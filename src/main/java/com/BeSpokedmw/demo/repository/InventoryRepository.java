package com.BeSpokedmw.demo.repository;

import com.BeSpokedmw.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Product, Long> {

}
