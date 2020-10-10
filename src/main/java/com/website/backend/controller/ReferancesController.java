package com.website.backend.controller;

import com.website.backend.model.ReferancesModel;
import com.website.backend.model.ResponseModel;
import com.website.backend.service.ReferancesService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/restful/referance", produces = "application/json")
public class ReferancesController {

    private final ReferancesService referancesService;

    public ReferancesController(ReferancesService referancesService) {
        this.referancesService = referancesService;
    }

    @RequestMapping(value = "/saveData", method = RequestMethod.POST)
    public ResponseModel saveData(@RequestBody ReferancesModel referancesModel) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(referancesService.saveReferance(referancesModel), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getAllData", method = RequestMethod.GET)
    public ResponseModel getAllData() {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(referancesService.getAllData(), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getAllData/language={language}", method = RequestMethod.GET)
    public ResponseModel getAllData(@PathVariable String language) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(referancesService.getAllData(language), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/deleteData/{referanceId}", method = RequestMethod.GET)
    public ResponseModel deleteData(@PathVariable int referanceId) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(referancesService.deleteReferance(referanceId), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }
}
