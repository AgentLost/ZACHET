package com.zachet.chatservice.controllers.ws;

import com.zachet.chatservice.model.Message;
import com.zachet.chatservice.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ChatController {

    private final SimpMessagingTemplate messagingTemplate;
    private final MessageService messageService;

    public static final String SEND_MESSAGE = "/topic/chats.{chat_id}.messages.send";
    public static final String FETCH_MESSAGES = "/topic/chats.{chat_id}.messages";

    @MessageMapping(SEND_MESSAGE)
    public void sendMessageToChat(
            @DestinationVariable("chat_id") String chatId,
            String text,
            @Header String simpSessionId) {

        String destination = getFetchMessagesDestination(chatId);

        Message message = Message.builder()
                        .chatId(destination)
                        .senderId(simpSessionId)
                        .text(text)
                        .build();

        sendMessage(destination, message);
        this.messageService.Save(message);
    }

    @SubscribeMapping(FETCH_MESSAGES)
    public Message fetchMessages(@DestinationVariable("chat_id") String chatId) {
        return null;
    }


    private void sendMessage(String destination, Message message) {
        messagingTemplate.convertAndSend(
                destination,
                message
        );
    }

    public static String getFetchMessagesDestination(String chatId) {
        return FETCH_MESSAGES.replace("{chat_id}", chatId);
    }
}


