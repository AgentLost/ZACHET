package com.zachet.chatservice.web.response;

import lombok.Data;


@Data
public class ChatRequest {

    private String clientId;

    private int prevChatId;

}
