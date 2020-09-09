package com.website.backend.service;

import com.website.backend.model.MessageModel;
import com.website.backend.repository.MessageRepo;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class MessageService {

    private static final DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");

    private final MessageRepo messageRepo;

    public MessageService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    public String sendMessage(MessageModel messageModel) {
        Date date = new Date();
        String nowDate = dateFormat.format(date);
        messageModel.setMessageDate(nowDate);
        messageRepo.save(messageModel);
        return "Send Successfully";
    }

    public String changeStatus(long messageId) {
        MessageModel message=messageRepo.findById(messageId);
        message.setMessageStatus(1);
        messageRepo.save(message);
        return "Changing Successfully";
    }

    public List<MessageModel> getMessages() {
        return messageRepo.findAll();
    }

    public MessageModel getOne(long messageId) {
        return messageRepo.findById(messageId);
    }

    public int getByStatus(int messageStatus) {
        if (messageStatus==-1){
            return getMessages().size();
        }
        return messageRepo.findByMessageStatus(messageStatus).size();
    }
}
