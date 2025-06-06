package me.chamodi.ICA2_2024.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import me.chamodi.ICA2_2024.models.Product;
import me.chamodi.ICA2_2024.repo.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public List<Product> getProductByCategoryId(int id){
        if(repo.getProductByCategoryId(id).isEmpty()){
            throw new EntityNotFoundException("No Products");
        }
        return repo.getProductByCategoryId(id);
    }
}
