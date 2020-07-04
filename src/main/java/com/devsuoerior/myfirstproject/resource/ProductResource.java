package com.devsuoerior.myfirstproject.resource;


import com.devsuoerior.myfirstproject.entities.Product;
import com.devsuoerior.myfirstproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductRepository ProductRepository;

    public ProductResource(ProductRepository ProductRepository) {
        this.ProductRepository = ProductRepository;
    }

    //retorna todas as categorias
    @GetMapping
    public ResponseEntity<List<Product>> findAll(){

       List<Product>list = ProductRepository.findAll();

        return ResponseEntity.ok().body(list);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findByid(@PathVariable Long id ){

        Product cat  = ProductRepository.findById(id);
        return ResponseEntity.ok().body(cat);
    }

}
