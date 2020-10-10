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

    public List<CollectionModel> getAllData(String language) {
        return collectionRepo.findAllByLanguage(language);
    }

    public CollectionModel getDataById(int id) {
        return collectionRepo.findById(id);
    }

    public List<CollectionModel> getDataBySex(int sexId, String language) {
        switch (sexId) {
            case 0:
                return getAllData(language);
            case 1:
                return collectionRepo.findBySexAndLanguage("Woman", language);

            case 2:
                return collectionRepo.findBySexAndLanguage("Man", language);

            case 3:
                return collectionRepo.findBySexAndLanguage("Kids", language);

        }
        return null;
    }
}
