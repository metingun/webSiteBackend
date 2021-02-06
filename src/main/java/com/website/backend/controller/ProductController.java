package com.website.backend.controller;

import com.website.backend.model.ProductModel;
import com.website.backend.model.ReferancesModel;
import com.website.backend.model.ResponseModel;
import com.website.backend.service.ProductService;
import com.website.backend.service.ReferancesService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/restful/product", produces = "application/json")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/saveData", method = RequestMethod.POST)
    public ResponseModel saveData(@RequestBody ProductModel productModel) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(productService.saveProduct(productModel), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getAllData", method = RequestMethod.GET)
    public ResponseModel getAllData() {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(productService.getAllData(), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getAllData/language={language}", method = RequestMethod.GET)
    public ResponseModel getAllData(@PathVariable String language) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(productService.getAllData(language), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/deleteData/{productId}", method = RequestMethod.GET)
    public ResponseModel deleteData(@PathVariable int productId) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(productService.deleteProduct(productId), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }
}
