package com.dev.taskmanager_api.user;

import com.dev.taskmanager_api.task.Task;
import jakarta.persistence.*;
import org.hibernate.boot.model.internal.PropertyContainer;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name="\"USER\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String username;
    private String password;
    private String email;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User:{id=%d, username=%s, password=%s, email=%s}".formatted(id, username, password, email);
    }
}
