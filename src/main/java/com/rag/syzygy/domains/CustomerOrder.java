/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.syzygy.domains;

import com.rag.syzygy.dao.AddedFoodItemDAO;

import java.util.List;

/**
 *
 * @author ACER
 */
public class CustomerOrder {
	private Customer customer;
	private List<AddedFoodItemDAO> orders;

	public CustomerOrder() {

	}

	public static class Builder {
		private Customer customer;
		private List<AddedFoodItemDAO> orders;

		public Builder customer(Customer customer) {
			this.customer = customer;
			return this;
		}

		public Builder orders(List<AddedFoodItemDAO> orders) {
			this.orders = orders;
			return this;
		}

		public CustomerOrder build() {
			return new CustomerOrder(this);
		}
	}
	private CustomerOrder(Builder builder) {
		this.customer = builder.customer;
		this.orders = builder.orders;
	}
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<AddedFoodItemDAO> getOrders() {
		return orders;
	}

	public void setOrders(List<AddedFoodItemDAO> orders) {
		this.orders = orders;
	}

	public CustomerOrder(Customer customer, List<AddedFoodItemDAO> orders) {
		this.customer = customer;
		this.orders = orders;
	}
}
