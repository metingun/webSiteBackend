package com.panda.diary.service;

import com.panda.diary.model.HomePageModel;
import com.panda.diary.repository.HomePageRepo;
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
        homePageRepo.delete(homePageRepo.findAll().get(0));
        homePageRepo.save(homePageModel);
        return "Updated Successfully";
    }

    public HomePageModel getAllData() {
        return homePageRepo.findAll().get(0);
    }
}
