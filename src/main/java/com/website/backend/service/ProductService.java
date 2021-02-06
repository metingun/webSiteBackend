package com.website.backend.service;

import com.website.backend.model.ProductModel;
import com.website.backend.model.ReferancesModel;
import com.website.backend.repository.ProductRepo;
import com.website.backend.repository.ReferancesRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public ProductModel saveProduct(ProductModel productModel) {
        productRepo.save(productModel);
        return productRepo.findByProductTitle(productModel.getProductTitle());
    }

    public String deleteProduct(long productId) {
        productRepo.delete(productRepo.findById(productId));
        return "Deleted Successfully";
    }

    public List<ProductModel> getAllData() {
        return productRepo.findAll();
    }

    public List<ProductModel> getAllData(String language) {
        return productRepo.findAllByLanguage(language);
    }
}
