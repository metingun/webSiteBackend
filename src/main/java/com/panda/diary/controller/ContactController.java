package com.panda.diary.controller;

import com.panda.diary.model.ContactModel;
import com.panda.diary.model.ResponseModel;
import com.panda.diary.service.ContactService;
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
