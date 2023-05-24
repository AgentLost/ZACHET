package com.zachet.chatservice.model;

import lombok.Builder;
import lombok.Getter;
import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Entity
@Builder
@Getter
public class Chat {
    @Id
    @Column(name = "chat_id")
    @Builder.Default
    private UUID id = UUID.randomUUID();

    @Column(name = "client_id")
    private String clientId;

    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "status")
    private String status;

    @Column(name = "rating")
    private int rating;

    @Builder.Default
    @Column(name = "created_at")
    private java.util.Date createdAt = Date.from(Instant.now());

    @Column(name = "prev_chat_id")
    private int prevChatId;

    public Chat() {

    }
}
