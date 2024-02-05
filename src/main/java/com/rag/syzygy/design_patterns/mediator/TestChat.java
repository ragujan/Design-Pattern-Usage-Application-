/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.syzygy.design_patterns.mediator;

import com.rag.syzygy.domains.Customer;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ACER
 */
public class TestChat {

	public static void main(String[] args) {
		Customer customer1 = new Customer("rag", "contact 1", "address 1");
		Customer customer2 = new Customer("ragbag", "contact 2", "address 1");
		ChatCustomer chatCustomer1 = new ChatCustomer(customer1, MediatorContext.getMediator());
		ChatCustomer chatCustomer2 = new ChatCustomer(customer2, MediatorContext.getMediator());
		ChatEmployee chatEmployee = EmployeeChatContext.getMainChatEmployee();

		ConcreteMediator concreteMediator = (ConcreteMediator) MediatorContext.getMediator();

		chatCustomer1.sendMessage("Hi Steve ", chatEmployee);
		chatCustomer2.sendMessage("Hi Steve ", chatEmployee);
//
		chatEmployee.sendMessage("hi Rag ", chatCustomer1);
		chatEmployee.sendMessage("hi Ragbag ", chatCustomer2);

		Map<Actor, List<Chat>> chats = ChatHistory.getChats();

		for (Map.Entry<Actor, List<Chat>> entry : chats.entrySet()) {
			Actor key = entry.getKey();
			List<Chat> value = entry.getValue();

			if (key instanceof ChatEmployee) {

				ChatEmployee employee = (ChatEmployee) key;
				System.out.println("Actor is " + employee.getName());

				value.forEach(e -> {
					ChatCustomer customer = (ChatCustomer) e.getReceive();

					System.out.println("message " + e.getMessage() + " to " + customer.getName());
				});
			}
			if (key instanceof ChatCustomer) {
				ChatCustomer customer = (ChatCustomer) key;

				System.out.println("Actor is " + customer.getName());
				value.forEach(e -> {
					ChatEmployee employee = (ChatEmployee) e.getReceive();

					System.out.println("message " + e.getMessage() + " to " + employee.getName());
				});
			}

		}

	}

}
