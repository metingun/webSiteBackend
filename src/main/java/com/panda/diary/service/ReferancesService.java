package com.panda.diary.service;

import com.panda.diary.model.ReferancesModel;
import com.panda.diary.repository.ReferancesRepo;
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
}
