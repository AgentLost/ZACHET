package com.zachet.chatservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private int id;

    @Column(name = "chat_id", nullable = false)
    private int chatId;

    @Column(name = "sender_id")
    private String senderId;

    @Column(nullable = false)
    private String text;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private MessageStatus status = MessageStatus.RECEIVED;

    @Builder.Default
    @Column(name = "created_at")
    private Date createdAt = Date.from(Instant.now());

    public Message() {

    }
}
