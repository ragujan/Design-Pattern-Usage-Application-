package com.rag.syzygy.design_patterns.mediator;

public interface Mediator {
    void sendMessage(String message, Actor from,Actor to);
}
