package com.website.backend.service;

import com.website.backend.model.HomePageModel;
import com.website.backend.repository.HomePageRepo;
import org.springframework.stereotype.Service;

@Service
public class HomePageService {

    private final HomePageRepo homePageRepo;

    public HomePageService(HomePageRepo homePageRepo) {
        this.homePageRepo = homePageRepo;
    }

    public String saveHomePageData(HomePageModel homePageModel) {
        homePageRepo.save(homePageModel);
        return "Saved Successfully";
    }

    public String updateHomePageData(HomePageModel homePageModel) {
        homePageRepo.save(homePageModel);
        homePageRepo.delete(homePageRepo.findAll().get(0));
        return "Updated Successfully";
    }

    public HomePageModel getAllData() {
        return homePageRepo.findAll().get(0);
    }
}
