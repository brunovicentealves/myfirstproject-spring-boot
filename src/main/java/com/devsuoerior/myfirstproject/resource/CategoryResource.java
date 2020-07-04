package com.devsuoerior.myfirstproject.resource;


import com.devsuoerior.myfirstproject.entities.Category;
import com.devsuoerior.myfirstproject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryResource(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    //retorna todas as categorias
    @GetMapping
    public ResponseEntity<List<Category>> findAll(){

       List<Category>list = categoryRepository.findAll();

        return ResponseEntity.ok().body(list);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findByid(@PathVariable Long id ){

        Category cat  = categoryRepository.findById(id).get();
        return ResponseEntity.ok().body(cat);
    }

}
