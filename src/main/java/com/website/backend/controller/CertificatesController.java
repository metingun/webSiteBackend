package com.website.backend.controller;

import com.website.backend.model.CertificatesModel;
import com.website.backend.model.ReferancesModel;
import com.website.backend.model.ResponseModel;
import com.website.backend.service.CertificatesService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/restful/certificates", produces = "application/json")
public class CertificatesController {

    private final CertificatesService certificatesService;

    public CertificatesController(CertificatesService certificatesService) {
        this.certificatesService = certificatesService;
    }

    @RequestMapping(value = "/saveData", method = RequestMethod.POST)
    public ResponseModel saveData(@RequestBody CertificatesModel certificatesModel) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(certificatesService.saveCertificate(certificatesModel), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getAllData", method = RequestMethod.GET)
    public ResponseModel getAllData() {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(certificatesService.getAllData(), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getAllData/language={language}", method = RequestMethod.GET)
    public ResponseModel getAllData(@PathVariable String language) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(certificatesService.getAllData(language), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/deleteData/{certificatesId}", method = RequestMethod.GET)
    public ResponseModel deleteData(@PathVariable int certificatesId) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(certificatesService.deleteCertificate(certificatesId), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getDataById/{id}", method = RequestMethod.GET)
    public ResponseModel getDataById(@PathVariable int id) {

        try {
            return ResponseModel
                    .createSuccessResponseWithData(certificatesService.getDataById(id), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseModel update(@RequestBody CertificatesModel certificatesModel) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(certificatesService.update(certificatesModel), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }
}
