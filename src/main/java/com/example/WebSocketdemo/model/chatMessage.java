package com.example.WebSocketdemo.model;


import java.awt.*;

public class chatMessage {
private TrayIcon.MessageType type;
private String content;
private String sender;

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
