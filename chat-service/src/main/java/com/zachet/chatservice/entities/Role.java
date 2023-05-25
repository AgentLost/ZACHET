package com.zachet.chatservice.entities;

import lombok.*;

import javax.persistence.*;

public enum Role {
    USER("USER"), MANAGER("MANAGER");
    private final String name;

    Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
