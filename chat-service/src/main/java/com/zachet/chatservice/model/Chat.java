package com.zachet.chatservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Chat {
    @Id
    @Column(name = "chat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "client_id")
    private String clientId;

    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ChatStatus status = ChatStatus.WAITING;

    @Column(name = "rating")
    private int rating = -1;

    @Builder.Default
    @Column(name = "created_at")
    private java.util.Date createdAt = Date.from(Instant.now());

    @Column(name = "prev_chat_id")
    private int prevChatId;

    public Chat() {

    }
}
