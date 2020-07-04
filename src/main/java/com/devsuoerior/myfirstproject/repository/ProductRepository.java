package com.devsuoerior.myfirstproject.repository;


import com.devsuoerior.myfirstproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
