package me.chamodi.ICA2_2024.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.chamodi.ICA2_2024.models.Product;
import me.chamodi.ICA2_2024.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<List<Product>>(service.getProducts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Product>> getProductByCategoryId(@PathVariable("id") int id) {
        return new ResponseEntity<List<Product>>(service.getProductByCategoryId(id), HttpStatus.OK);
    }

}
