package com.website.backend.service;

import com.website.backend.model.CollectionModel;
import com.website.backend.repository.CollectionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {

    private final CollectionRepo collectionRepo;

    public CollectionService(CollectionRepo collectionRepo) {
        this.collectionRepo = collectionRepo;
    }

    public CollectionModel saveCollection(CollectionModel collectionModel) {
        collectionRepo.save(collectionModel);
        return collectionRepo.findByProductName(collectionModel.getProductName());
    }

    public String deleteCollection(long productId) {
        collectionRepo.delete(collectionRepo.findById(productId));
        return "Deleted Successfully";
    }

    public List<CollectionModel> getAllData() {
        return collectionRepo.findAll();
    }
}
