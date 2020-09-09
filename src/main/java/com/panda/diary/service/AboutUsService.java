package com.panda.diary.service;

import com.panda.diary.model.AboutUsModel;
import com.panda.diary.repository.AboutUsRepo;
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
        aboutUsRepo.delete(aboutUsRepo.findAll().get(0));
        aboutUsRepo.save(aboutUsModel);
        return "Updated Successfully";
    }

    public AboutUsModel getAllData() {
        return aboutUsRepo.findAll().get(0);
    }
}
