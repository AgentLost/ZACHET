package com.zachet.chatservice.service;

import com.zachet.chatservice.model.Chat;
import com.zachet.chatservice.web.response.ChatRequest;

import java.util.List;
import java.util.Optional;

public interface ChatService {

    void ConnectEmployeeToChat(String employee, int chatId);
    void Create(ChatRequest chatRequest);
    Optional<Chat> GetChat(int chatId);
    List<Chat> GetAllByClientId(String clientId);
}
