package com.panda.diary.controller;

import com.panda.diary.model.HomePageModel;
import com.panda.diary.model.MessageModel;
import com.panda.diary.model.ResponseModel;
import com.panda.diary.service.HomePageService;
import com.panda.diary.service.MessageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/restful/message", produces = "application/json")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
    public ResponseModel sendMessage(@RequestBody MessageModel messageModel) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(messageService.sendMessage(messageModel), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getMessages", method = RequestMethod.GET)
    public ResponseModel getMessages() {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(messageService.getMessages(), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }
    @RequestMapping(value = "/getOne/{messageId}", method = RequestMethod.GET)
    public ResponseModel getOne(@PathVariable int messageId) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(messageService.getOne(messageId), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/getByStatus/{messageStatus}", method = RequestMethod.GET)
    public ResponseModel getByStatus(@PathVariable int messageStatus) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(messageService.getByStatus(messageStatus), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }

    @RequestMapping(value = "/changeStatus/{messageId}", method = RequestMethod.GET)
    public ResponseModel changeStatus(@PathVariable int messageId) {
        try {
            return ResponseModel
                    .createSuccessResponseWithData(messageService.changeStatus(messageId), false);
        } catch (Exception e) {
            return ResponseModel.createErrorResponseWithErrorMessage(e);
        }
    }
}
