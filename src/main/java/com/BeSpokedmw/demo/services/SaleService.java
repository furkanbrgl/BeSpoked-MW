package com.BeSpokedmw.demo.services;

import com.BeSpokedmw.demo.models.*;
import com.BeSpokedmw.demo.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    public List<Sale> getAllSales() {

        return saleRepository.findAll();
    }

    public List<Sale> getSalesBySalesPersonId(long id) {

        return saleRepository.getBySalespersonId(id);
    }

    public void makeASale(Sale sale) {
        saleRepository.save(sale);
    }
}
