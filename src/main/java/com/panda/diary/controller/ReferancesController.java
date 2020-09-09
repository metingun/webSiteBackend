package com.panda.diary.controller;

import com.panda.diary.model.ReferancesModel;
import com.panda.diary.model.ResponseModel;
import com.panda.diary.service.ReferancesService;
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
