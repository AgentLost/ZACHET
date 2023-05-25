package com.zachet.chatservice.service.impl;

import com.zachet.chatservice.helper.mapper.ChatMapper;
import com.zachet.chatservice.model.Chat;
import com.zachet.chatservice.repo.ChatRepository;
import com.zachet.chatservice.service.ChatService;
import com.zachet.chatservice.web.response.ChatRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChatServiceImpl implements ChatService {

    private final ChatRepository chatRepository;

    private final ChatMapper chatMapper;

    public ChatServiceImpl(ChatRepository chatRepository, ChatMapper chatMapper) {
        this.chatRepository = chatRepository;
        this.chatMapper = chatMapper;
    }

    @Override
    public void ConnectEmployeeToChat(String employeeId, int chatId) {
        chatRepository.updateEmployeeByChatId(employeeId, chatId);
    }

    @Override
    public void Create(ChatRequest chatRequest) {
        Chat chat = new Chat();
        chat.setClientId(chatRequest.getClientId());
        chat.setPrevChatId(chatRequest.getPrevChatId());
        chatRepository.save(chat);
    }

    @Override
    public Optional<Chat> GetChat(int chatId) {
        return chatRepository.findById(chatId);
    }

    @Override
    public List<Chat> GetAllByClientId(String clientId) {
        return chatRepository.findAllByClientId(clientId);
    }
}
