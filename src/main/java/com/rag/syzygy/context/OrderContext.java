/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.syzygy.context;

import com.rag.syzygy.domains.CustomerOrder;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class OrderContext {

	private static List<CustomerOrder> orders = new LinkedList<>();

	public static List<CustomerOrder> getOrders() {
		return orders;
	}

	public static void setOrder(CustomerOrder order) {
		orders.add(order);
	}
	
}
