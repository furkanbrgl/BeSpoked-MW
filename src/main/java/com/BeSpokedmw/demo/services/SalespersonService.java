package com.BeSpokedmw.demo.services;

import com.BeSpokedmw.demo.models.Customer;
import com.BeSpokedmw.demo.models.Salesperson;
import com.BeSpokedmw.demo.repository.CustomerRepository;
import com.BeSpokedmw.demo.repository.SalespersonRepository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalespersonService {

    private static final Logger LOGGER = LogManager.getLogger(SalespersonService.class);

    @Autowired
    SalespersonRepository salespersonRepository;

    public List<Salesperson> getAllSalespersons() {

        return salespersonRepository.findAll();
    }

}
