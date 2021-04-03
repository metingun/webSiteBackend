package com.website.backend.controller;

import com.website.backend.model.CollectionModel;
import com.website.backend.model.ResponseModel;
import com.website.backend.service.CollectionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/restful/collection", produces = "application/json")
public class CollectionController {

    private final CollectionService collectionService;

    public CollectionController(CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    @RequestMapping(value = "/saveData", method = RequestMethod.POST)
    public ResponseModel saveData(@RequestBody CollectionModel collectionModel) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(collectionService.saveCollection(collectionModel), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getAllData", method = RequestMethod.GET)
    public ResponseModel getAllData() {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(collectionService.getAllData(), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    /*
    SEXID

    all--0
    woman--1
    man--2
    kids--3
    */
    @RequestMapping(value = "/getDataBySex/{sexId}/language={language}", method = RequestMethod.GET)
    public ResponseModel getDataBySex(@PathVariable int sexId,@PathVariable String language) {

        try {
            return ResponseModel
                    .createSuccessResponseWithData(collectionService.getDataBySex(sexId,language), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getDataById/{id}", method = RequestMethod.GET)
    public ResponseModel getDataById(@PathVariable int id) {

        try {
            return ResponseModel
                    .createSuccessResponseWithData(collectionService.getDataById(id), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/deleteData/{productId}", method = RequestMethod.GET)
    public ResponseModel deleteData(@PathVariable long productId) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(collectionService.deleteCollection(productId), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseModel update(@RequestBody CollectionModel collectionModel) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(collectionService.update(collectionModel), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }
}
