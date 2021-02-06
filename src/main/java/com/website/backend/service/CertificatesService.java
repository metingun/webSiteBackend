package com.website.backend.service;

import com.website.backend.model.CertificatesModel;
import com.website.backend.repository.CertificatesRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificatesService {

    private final CertificatesRepo certificatesRepo;

    public CertificatesService(CertificatesRepo certificatesRepo) {
        this.certificatesRepo = certificatesRepo;
    }

    public CertificatesModel saveCertificate(CertificatesModel certificatesModel) {
        certificatesRepo.save(certificatesModel);
        return certificatesRepo.findByCertificateName(certificatesModel.getCertificateName());
    }

    public String deleteCertificate(long certificateId) {
        certificatesRepo.delete(certificatesRepo.findById(certificateId));
        return "Deleted Successfully";
    }

    public List<CertificatesModel> getAllData() {
        return certificatesRepo.findAll();
    }

    public List<CertificatesModel> getAllData(String language) {
        return certificatesRepo.findAllByLanguage(language);
    }

}
