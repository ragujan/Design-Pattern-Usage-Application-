package com.rag.syzygy.design_patterns.mediator;

public class ChatEmployee implements Actor {

	private Mediator mediator;
	private String name;

	public ChatEmployee(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
		ConcreteMediator concreteMediator = (ConcreteMediator) this.mediator;
		concreteMediator.addActor(this);
	}

	public String getName() {
		return name;
	}

	@Override
	public void sendMessage(String message, Actor to) {
		mediator.sendMessage(message, this, to);
	}

	@Override
	public void receiveMessage(String message, Actor from) {

		ChatCustomer customer = (ChatCustomer)from;
		System.out.println(this.name + " receives messages " + message+ " from "+customer.getName());
	}
}
