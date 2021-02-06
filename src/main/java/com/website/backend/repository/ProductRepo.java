package com.website.backend.repository;

import com.website.backend.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel, Long> {
    ProductModel findByProductTitle(String productTitle);
    List<ProductModel> findAllByLanguage(String language);
    ProductModel findById(long productId);
}
