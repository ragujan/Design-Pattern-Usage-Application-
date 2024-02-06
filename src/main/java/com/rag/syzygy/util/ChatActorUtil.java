/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.syzygy.util;

import com.rag.syzygy.design_patterns.mediator.Actor;
import com.rag.syzygy.design_patterns.mediator.ChatCustomer;
import com.rag.syzygy.design_patterns.mediator.ChatEmployee;

/**
 *
 * @author ACER
 */
public class ChatActorUtil {

	public static String getName(Actor actor) {
		if (actor instanceof ChatEmployee) {
			ChatEmployee employee = (ChatEmployee) actor;
			return employee.getName();
		} else if (actor instanceof ChatCustomer) {
			ChatCustomer customer = (ChatCustomer) actor;
			return customer.getName();
		}else{ 
			return "No Name";
		}
	}
}
