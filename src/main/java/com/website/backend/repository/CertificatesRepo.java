package com.website.backend.repository;

import com.website.backend.model.CertificatesModel;
import com.website.backend.model.ReferancesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificatesRepo extends JpaRepository<CertificatesModel, Long> {
    CertificatesModel findByCertificateName(String certificateName);
    CertificatesModel findById(long certificateId);
    List<CertificatesModel> findAllByLanguage(String language);
}
