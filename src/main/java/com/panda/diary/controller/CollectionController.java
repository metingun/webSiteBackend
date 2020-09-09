package com.panda.diary.controller;

import com.panda.diary.model.CollectionModel;
import com.panda.diary.model.HomePageModel;
import com.panda.diary.model.ResponseModel;
import com.panda.diary.service.CollectionService;
import com.panda.diary.service.HomePageService;
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

    @RequestMapping(value = "/deleteData/{productId}", method = RequestMethod.GET)
    public ResponseModel deleteData(@PathVariable long productId) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(collectionService.deleteCollection(productId), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }
}
