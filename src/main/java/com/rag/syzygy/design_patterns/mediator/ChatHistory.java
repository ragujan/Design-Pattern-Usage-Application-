/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.syzygy.design_patterns.mediator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ACER
 */
public class ChatHistory {

	private static Map<Actor, List<Chat>> chats = new HashMap<>();

	public static Map<Actor, List<Chat>> getChats() {
		return chats;
	}

	public static List<Chat> getChatsByActor(Actor actor) {
		if (chats != null) {
			return chats.get(actor);
		}else{
			return new LinkedList<>();
		}
	}

	public static void addChat(Actor from,Actor to, String message) {

		if (chats != null) {
			if (chats.get(from) != null) {
				List<Chat> messages = chats.get(from);
				Chat chat = new Chat(from, to, message);
				messages.add(chat);
				chats.put(from, messages);
			}
			if (chats.get(from) == null) {
				List<Chat> messages = new LinkedList<>();
				Chat chat = new Chat(from, to, message);
				messages.add(chat);
				chats.put(from, messages);
			}
		}

	}

	

}
