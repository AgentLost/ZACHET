package com.zachet.chatservice.service;

import com.zachet.chatservice.dto.MessageDto;
import com.zachet.chatservice.model.Message;
import com.zachet.chatservice.web.response.MessageRequest;

import java.util.List;

public interface MessageService{
    void Save(MessageRequest message);

    List<Message> GetAll(int chatId);

    List<Message> GetNew(int chatId);

    void Delete(int messageId);
}
