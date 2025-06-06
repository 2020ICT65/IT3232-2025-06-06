package me.chamodi.ICA2_2024.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import me.chamodi.ICA2_2024.models.Product;
@Repository

public interface ProductRepo extends JpaRepository<Product, Integer>{
    @Query("SELECT p FROM Product p WHERE p.category.id = ?1")
    public List<Product> getProductByCategoryId(int id);
}
