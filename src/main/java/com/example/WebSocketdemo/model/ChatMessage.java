package com.example.WebSocketdemo.model;


import java.awt.*;

public class ChatMessage {
private TrayIcon.MessageType type;
private String content;
private String sender;

    public void setType(MessageType messageType) {
    }

    public enum MessageType {
    CHAT,
    JOIN,
    LEAVE
}

    public TrayIcon.MessageType getType() {
        return type;
    }

    public void setType(TrayIcon.MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
