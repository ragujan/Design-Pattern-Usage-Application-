/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.syzygy.util;

/**
 *
 * @author ACER
 */
public enum FoodItemList {

	PIZZA(10.99),
	PASTA(8.99),
	SALAD(6.99),
	BURGER(9.99),
	ICE_CREAM(4.99);

	private final double price;

	FoodItemList(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String getFoodItemName() {
		return this.name();
	}

	
}
