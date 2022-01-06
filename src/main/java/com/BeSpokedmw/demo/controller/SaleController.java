package com.BeSpokedmw.demo.controller;

import com.BeSpokedmw.demo.models.Sale;
import com.BeSpokedmw.demo.services.SaleService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
@CrossOrigin(origins = "http://localhost:4200")
public class SaleController {

    private static final Logger LOGGER = LogManager.getLogger(SaleController.class);

    @Autowired
    private SaleService saleService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Sale> getAllSales() {
        return saleService.getAllSales();
    }

    @RequestMapping(value = "/salespersonId/{salespersonId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Sale> getSalesBySalesPersonId(@PathVariable(value="salespersonId") Long id) {
        return saleService.getSalesBySalesPersonId(id);
    }

    @PostMapping(value = "/make", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void makeASale(@RequestBody Sale makeASaleObject){
        System.out.println(makeASaleObject.toString());
        saleService.makeASale(makeASaleObject);
    }

}
