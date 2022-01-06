package com.BeSpokedmw.demo.controller;

import com.BeSpokedmw.demo.models.Salesperson;
import com.BeSpokedmw.demo.services.SalespersonService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salespersons")
@CrossOrigin(origins = "http://localhost:4200")
public class SalespersonController {

    private static final Logger LOGGER = LogManager.getLogger(SalespersonController.class);

    @Autowired
    private SalespersonService salespersonService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Salesperson> getAllSalespersons() {
        return salespersonService.getAllSalespersons();
    }


}
