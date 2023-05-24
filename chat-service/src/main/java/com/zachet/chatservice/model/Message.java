package com.zachet.chatservice.model;

import lombok.Builder;
import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Builder
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private int id;

    @Column(name = "chat_id", nullable = false)
    private String chatId;

    @Column(name = "sender_id")
    private String senderId;

    @Column(nullable = false)
    private String text;

    @Builder.Default
    @Column(name = "created_at")
    private Date createdAt = Date.from(Instant.now());

    public Message() {

    }
}
