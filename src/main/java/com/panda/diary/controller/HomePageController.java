package com.panda.diary.controller;

import com.panda.diary.model.HomePageModel;
import com.panda.diary.model.ResponseModel;
import com.panda.diary.service.HomePageService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/restful/homePage", produces = "application/json")
public class HomePageController {

    private final HomePageService homePageService;

    public HomePageController(HomePageService homePageService) {
        this.homePageService = homePageService;
    }

    @RequestMapping(value = "/saveData", method = RequestMethod.POST)
    public ResponseModel saveData(@RequestBody HomePageModel homePageModel) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(homePageService.saveHomePageData(homePageModel), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getAllData", method = RequestMethod.GET)
    public ResponseModel getAllData() {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(homePageService.getAllData(), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/updateData", method = RequestMethod.POST)
    public ResponseModel updateData(@RequestBody HomePageModel homePageModel) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(homePageService.updateHomePageData(homePageModel), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }
}
