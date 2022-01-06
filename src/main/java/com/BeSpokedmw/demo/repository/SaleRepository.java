package com.BeSpokedmw.demo.repository;

import com.BeSpokedmw.demo.models.Sale;
import com.BeSpokedmw.demo.models.Salesperson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Override
    Sale getById(Long aLong);

    List<Sale> getBySalespersonId(long id);

}
