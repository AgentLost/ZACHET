package com.zachet.chatservice.controllers.rest;

import com.zachet.chatservice.model.Chat;
import com.zachet.chatservice.service.ChatService;
import com.zachet.chatservice.web.response.ChatRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@Controller
@RequestMapping("/api/chats")
public class ChatController {

    private final ChatService chatService;

    public ChatController( ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public ResponseEntity<String> createChat(@RequestBody ChatRequest chatRequest) {
        chatService.Create(chatRequest);
        return  ResponseEntity.ok("ok");
    }

    @GetMapping("/{chatId}")
    public ResponseEntity<Object> getChat(@PathVariable int chatId){
        var chat = chatService.GetChat(chatId);
        if (chat.isEmpty()) {
            return (ResponseEntity) ResponseEntity.status(404);
        }
        return ResponseEntity.ok(chat.get());
    }

    @GetMapping
    public ResponseEntity<List<Chat>> getChatsByClientId(@RequestParam String clientId) {
        return ResponseEntity.ok(chatService.GetAllByClientId(clientId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> connectEmployee(@PathVariable("id") int chatId ,@RequestBody String employeeId) {
        chatService.ConnectEmployeeToChat(employeeId, chatId);
        return ResponseEntity.ok("ok");
    }
}
