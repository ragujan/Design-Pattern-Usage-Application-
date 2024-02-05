package com.rag.syzygy.design_patterns.mediator;

import com.rag.syzygy.domains.Customer;

public class ChatCustomer implements Actor {

	private Customer customer;
	private Mediator mediator;
	private String name;

	public ChatCustomer(Customer customer, Mediator mediator) {
		this.customer = customer;
		this.mediator = mediator;
		this.name = this.customer.getName();
		ConcreteMediator concreteMediator = (ConcreteMediator) mediator;
		concreteMediator.addActor(this);
	}

	@Override
	public void sendMessage(String message, Actor to) {
		mediator.sendMessage(message, this,to);
	}

	@Override
	public void receiveMessage(String message,Actor from) {
		ChatEmployee employee = (ChatEmployee)from;
		System.out.println(name + " receives messages " + message+ "from "+employee.getName());
	}

	public Customer getCustomer() {
		return customer;
	}

	public String getName() {
		return name;
	}

}
