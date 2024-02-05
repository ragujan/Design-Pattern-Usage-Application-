/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.syzygy.design_patterns.mediator;

/**
 *
 * @author ACER
 */
public class EmployeeChatContext {
	
	private static ChatEmployee chatEmployee = new ChatEmployee(MediatorContext.getMediator(), "Eric");


	public static ChatEmployee getMainChatEmployee(){
		return chatEmployee;
	}
}
