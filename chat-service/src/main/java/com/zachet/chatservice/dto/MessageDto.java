package com.zachet.chatservice.dto;

import com.zachet.chatservice.model.MessageStatus;
import lombok.Data;

import java.util.Date;

@Data
public class MessageDto {

    private int id;

    private int chatId;

    private String senderId;

    private String text;

    private MessageStatus status;

    private Date createdAt;
}
