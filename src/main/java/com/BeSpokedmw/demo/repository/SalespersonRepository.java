package com.BeSpokedmw.demo.repository;

import com.BeSpokedmw.demo.models.Salesperson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalespersonRepository extends JpaRepository<Salesperson, Long> {

}
