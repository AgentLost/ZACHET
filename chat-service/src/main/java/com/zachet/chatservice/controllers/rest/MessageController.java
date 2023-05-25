package com.zachet.chatservice.controllers.rest;

import com.zachet.chatservice.dto.MessageDto;
import com.zachet.chatservice.model.Message;
import com.zachet.chatservice.service.MessageService;
import com.zachet.chatservice.web.response.MessageRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@Controller
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageService messageService;


    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/new")
    public ResponseEntity<List<Message>> getNewMessage(@RequestParam int chatId) {
        return ResponseEntity.ok(messageService.GetNew(chatId));
    }

    @GetMapping
    public  ResponseEntity<List<Message>> getAllMessage(@RequestParam int chatId) {
        return ResponseEntity.ok(messageService.GetAll(chatId));
    }

    @DeleteMapping
    public void deleteMessage(@RequestParam int messageId) {
        messageService.Delete(messageId);
    }

    @PostMapping
    public ResponseEntity<String> saveMessage(@RequestBody MessageRequest messageDto){
        messageService.Save(messageDto);

        return  ResponseEntity.ok("ok");
    }
}
