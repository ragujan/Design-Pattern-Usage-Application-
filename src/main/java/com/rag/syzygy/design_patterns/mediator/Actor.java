package com.rag.syzygy.design_patterns.mediator;

public interface Actor {
    void sendMessage(String message,Actor to);
    void receiveMessage(String message, Actor from);
}
