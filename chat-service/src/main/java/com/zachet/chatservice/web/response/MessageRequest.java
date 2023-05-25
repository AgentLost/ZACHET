package com.zachet.chatservice.web.response;

import lombok.Data;

@Data
public class MessageRequest {
    private int chatId;

    private String senderId;

    private String text;

}
