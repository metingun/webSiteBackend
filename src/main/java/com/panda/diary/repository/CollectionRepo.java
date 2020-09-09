package com.panda.diary.repository;

import com.panda.diary.model.CollectionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionRepo extends JpaRepository<CollectionModel, Long> {
    CollectionModel findById(long productId);
    CollectionModel findByProductName(String productName);

}
