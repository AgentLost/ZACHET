package com.zachet.chatservice.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private int id;

    @Column(name = "chat_id", nullable = false)
    private int chatId;

    @Column(name = "sender_id", nullable = false)
    private int senderId;

    @Column(nullable = false)
    private String text;

    @CreatedDate
    private Date createAt;
}
