package com.website.backend.controller;

import com.website.backend.model.ContactModel;
import com.website.backend.model.ResponseModel;
import com.website.backend.service.ContactService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/restful/contact", produces = "application/json")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping(value = "/saveData", method = RequestMethod.POST)
    public ResponseModel saveData(@RequestBody ContactModel contactModel) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(contactService.saveContact(contactModel), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getAllData", method = RequestMethod.GET)
    public ResponseModel getAllData() {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(contactService.getAllData(), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/updateData", method = RequestMethod.POST)
    public ResponseModel updateData(@RequestBody ContactModel contactModel) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(contactService.updateContact(contactModel), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }
}
