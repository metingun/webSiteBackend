package com.website.backend.controller;

import com.website.backend.model.AboutUsModel;
import com.website.backend.model.ResponseModel;
import com.website.backend.service.AboutUsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/restful/aboutUs", produces = "application/json")
public class AboutUsController {

    private final AboutUsService aboutUsService;

    public AboutUsController(AboutUsService aboutUsService) {
        this.aboutUsService = aboutUsService;
    }

    @RequestMapping(value = "/saveData", method = RequestMethod.POST)
    public ResponseModel saveData(@RequestBody AboutUsModel aboutUsModel) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(aboutUsService.saveAboutUs(aboutUsModel), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getAllData", method = RequestMethod.GET)
    public ResponseModel getAllData() {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(aboutUsService.getAllData(), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/updateData", method = RequestMethod.POST)
    public ResponseModel updateData(@RequestBody AboutUsModel aboutUsModel) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(aboutUsService.updateAboutUs(aboutUsModel), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }
}
