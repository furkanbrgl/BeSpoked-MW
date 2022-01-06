package com.BeSpokedmw.demo.controller;

import com.BeSpokedmw.demo.models.Product;
import com.BeSpokedmw.demo.services.InventoryService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
@CrossOrigin(origins = "http://localhost:4200")
public class InventoryController {

    private static final Logger LOGGER = LogManager.getLogger(InventoryController.class);

    @Autowired
    private InventoryService inventoryService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAllInventory() {
        return inventoryService.getAllInventory();
    }


}
