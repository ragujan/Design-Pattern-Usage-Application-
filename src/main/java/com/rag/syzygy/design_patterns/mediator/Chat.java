/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.syzygy.design_patterns.mediator;

/**
 *
 * @author ACER
 */
public class Chat {
	
	private Actor sender;
	private Actor receiver;
	private String message;

	public Chat(Actor sender, Actor receiver, String message) {
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
	}

	public Actor getSender() {
		return sender;
	}

	public void setSender(Actor sender) {
		this.sender = sender;
	}

	public Actor getReceive() {
		return receiver;
	}

	public void setReceive(Actor receive) {
		this.receiver = receive;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	
}
