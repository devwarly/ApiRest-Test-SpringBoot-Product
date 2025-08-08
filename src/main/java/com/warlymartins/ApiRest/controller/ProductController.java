package com.warlymartins.ApiRest.controller;

import com.warlymartins.ApiRest.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.warlymartins.ApiRest.entities.Departament;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @GetMapping
    public List<Product> getObjects(){
        Departament d1 = new Departament(1L, "Tech");
        Departament d2 = new Departament(2L, "Peth");

        Product p1 = new Product(1L, "Macbook Pró", 4000.0, d1);
        Product p2 = new Product(1L, "Pc Gamer", 5000.0, d1);
        Product p3 = new Product(2L, "Pet House", 300.0, d2);
        List<Product> list = Arrays.asList(p1, p2, p3);

        return list;
    }
}
