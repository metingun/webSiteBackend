package com.website.backend.service;

import com.website.backend.model.ReferancesModel;
import com.website.backend.repository.ReferancesRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferancesService {

    private final ReferancesRepo referancesRepo;

    public ReferancesService(ReferancesRepo referancesRepo) {
        this.referancesRepo = referancesRepo;
    }

    public ReferancesModel saveReferance(ReferancesModel referancesModel) {
        referancesRepo.save(referancesModel);
        return referancesRepo.findByCompanyName(referancesModel.getCompanyName());
    }

    public String deleteReferance(long referanceId) {
        referancesRepo.delete(referancesRepo.findById(referanceId));
        return "Deleted Successfully";
    }

    public List<ReferancesModel> getAllData() {
        return referancesRepo.findAll();
    }

    public List<ReferancesModel> getAllData(String language) {
        return referancesRepo.findAllByLanguage(language);
    }
}
