package com.BeSpokedmw.demo.services;

import com.BeSpokedmw.demo.models.Product;
import com.BeSpokedmw.demo.repository.InventoryRepository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    public List<Product> getAllInventory() {

        return inventoryRepository.findAll();
    }

}
