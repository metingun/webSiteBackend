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
    public CollectionModel getDataById(int id) {
        return collectionRepo.findById(id);
    }
    public List<CollectionModel> getDataBySex(int sexId) {
        switch (sexId){
            case 0:
                return getAllData();
            case 1:
                return collectionRepo.findBySex("Woman");

            case 2:
                return collectionRepo.findBySex("Man");

            case 3:
                return collectionRepo.findBySex("Kids");

        }
        return null;
    }
}
