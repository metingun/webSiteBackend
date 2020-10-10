package com.website.backend.service;

import com.website.backend.model.AboutUsModel;
import com.website.backend.repository.AboutUsRepo;
import org.springframework.stereotype.Service;

@Service
public class AboutUsService {

    private final AboutUsRepo aboutUsRepo;

    public AboutUsService(AboutUsRepo aboutUsRepo) {
        this.aboutUsRepo = aboutUsRepo;
    }

    public String saveAboutUs(AboutUsModel aboutUsModel) {
        aboutUsRepo.save(aboutUsModel);
        return "Saved Successfully";
    }

    public String updateAboutUs(AboutUsModel aboutUsModel) {
        aboutUsRepo.save(aboutUsModel);
        aboutUsRepo.delete(aboutUsRepo.findAll().get(0));
        return "Updated Successfully";
    }

    public AboutUsModel getAllData() {
        return aboutUsRepo.findAll().get(0);
    }
}
