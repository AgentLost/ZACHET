package com.zachet.chatservice.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ChatDto {

    private int id;

    private String clientId;

    private String employeeId;

    private String status;

    private int rating;

    private java.util.Date createdAt;

    private int prevChatId;


}
