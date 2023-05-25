package com.zachet.chatservice.service.impl;

import com.zachet.chatservice.helper.mapper.MessageMapper;
import com.zachet.chatservice.model.Message;
import com.zachet.chatservice.model.MessageStatus;
import com.zachet.chatservice.repo.MessageRepository;
import com.zachet.chatservice.service.MessageService;
import com.zachet.chatservice.web.response.MessageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageMapper messageMapper;

    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageMapper messageMapper, MessageRepository messageRepository) {
        this.messageMapper = messageMapper;
        this.messageRepository = messageRepository;
    }

    @Override
    public void Save(MessageRequest message) {
        var m = new Message();
        m.setSenderId(message.getSenderId());
        m.setText(message.getText());
        m.setChatId(message.getChatId());

        messageRepository.save(m);
    }

    @Override
    public List<Message> GetAll(int chatId) {
        return messageRepository.findAllByChatId(chatId);
    }

    @Override
    public List<Message> GetNew(int chatId) {
        return messageRepository.findAllByChatIdAndAndStatus(chatId, MessageStatus.RECEIVED);
    }

    @Override
    public void Delete(int messageId) {

    }
}
