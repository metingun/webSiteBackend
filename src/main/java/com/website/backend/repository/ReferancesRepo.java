package com.website.backend.repository;

import com.website.backend.model.ReferancesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReferancesRepo extends JpaRepository<ReferancesModel, Long> {
    ReferancesModel findByCompanyName(String companyName);
    ReferancesModel findById(long referanceId);
    List<ReferancesModel> findAllByLanguage(String language);
}
