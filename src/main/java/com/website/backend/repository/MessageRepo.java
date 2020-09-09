package com.website.backend.repository;

import com.website.backend.model.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepo extends JpaRepository<MessageModel, Long> {
    MessageModel findById(long messageId);
    List<MessageModel> findByMessageStatus(int messageStatus);
}
