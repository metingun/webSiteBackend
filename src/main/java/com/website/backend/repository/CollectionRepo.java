package com.website.backend.repository;

import com.website.backend.model.CollectionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectionRepo extends JpaRepository<CollectionModel, Long> {
    CollectionModel findById(long productId);
    CollectionModel findByProductName(String productName);

    List<CollectionModel> findBySexAndLanguage(String sex,String language);
    List<CollectionModel> findAllByLanguage(String language);
}
