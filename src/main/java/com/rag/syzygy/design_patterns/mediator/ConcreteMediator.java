package com.rag.syzygy.design_patterns.mediator;

import java.util.LinkedList;
import java.util.List;

public class ConcreteMediator implements Mediator {

	private List<Actor> actors;

	public ConcreteMediator() {
		this.actors = ActorStorage.getActorList();
	}

	public void addActor(Actor actor) {
		ActorStorage.setActor(actor);
//        this.actors.add(actor);
	}

	@Override
	public void sendMessage(String message, Actor from, Actor to) {

		if (from instanceof ChatEmployee) {
			to.receiveMessage(message, from);

		}

		if (from instanceof ChatCustomer) {

			to.receiveMessage(message, from);
		}
		ChatHistory.addChat(from, to, message);
	}
}
