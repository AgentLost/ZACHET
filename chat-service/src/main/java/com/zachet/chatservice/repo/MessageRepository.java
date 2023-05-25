package com.zachet.chatservice.repo;

import com.zachet.chatservice.model.Message;
import com.zachet.chatservice.model.MessageStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Integer> {

    List<Message> findAllByChatId(Integer chatId);

    List<Message> findAllByChatIdAndAndStatus(int chatId, MessageStatus status);

}
