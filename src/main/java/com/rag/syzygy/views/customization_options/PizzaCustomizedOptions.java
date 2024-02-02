/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.syzygy.views.customization_options;

/**
 *
 * @author ACER
 */
public class PizzaCustomizedOptions {

	private String Crust;
	private String size;
	private String toppings1;
	private String toppings2;
	private int slices;
	private String cheeseOptions;
	private String description;

	public PizzaCustomizedOptions() {
	}

	public PizzaCustomizedOptions(String Crust, String size, String toppings1, String toppings2, int slices, String cheeseOptions, String description) {
		this.Crust = Crust;
		this.size = size;
		this.toppings1 = toppings1;
		this.toppings2 = toppings2;
		this.slices = slices;
		this.cheeseOptions = cheeseOptions;
		this.description = description;
	}

	public String getCrust() {
		return Crust;
	}

	public void setCrust(String Crust) {
		this.Crust = Crust;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getToppings1() {
		return toppings1;
	}

	public void setToppings1(String toppings1) {
		this.toppings1 = toppings1;
	}

	public String getToppings2() {
		return toppings2;
	}

	public void setToppings2(String toppings2) {
		this.toppings2 = toppings2;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public String getCheeseOptions() {
		return cheeseOptions;
	}

	public void setCheeseOptions(String cheeseOptions) {
		this.cheeseOptions = cheeseOptions;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
