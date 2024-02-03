/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.syzygy.customized_food_domains;

/**
 *
 * @author ACER
 */
public class CustomizedPastaOptions extends CustomizedOptions {

	private String type;
	private String sauce;
	private String cheeseToppings;
	private String proteinAddition;
	private String vegetableOption;
	private String specialNotes;

	public CustomizedPastaOptions() {
	}

	public CustomizedPastaOptions(String type, String sauce, String cheeseToppings, String proteinAddition, String vegetableOption, String specialNotes) {
		this.type = type;
		this.sauce = sauce;
		this.cheeseToppings = cheeseToppings;
		this.proteinAddition = proteinAddition;
		this.vegetableOption = vegetableOption;
		this.specialNotes = specialNotes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public String getCheeseToppings() {
		return cheeseToppings;
	}

	public void setCheeseToppings(String cheeseToppings) {
		this.cheeseToppings = cheeseToppings;
	}

	public String getProteinAddition() {
		return proteinAddition;
	}

	public void setProteinAddition(String proteinAddition) {
		this.proteinAddition = proteinAddition;
	}

	public String getVegetableOption() {
		return vegetableOption;
	}

	public void setVegetableOption(String vegetableOption) {
		this.vegetableOption = vegetableOption;
	}

	public String getSpecialNotes() {
		return specialNotes;
	}

	public void setSpecialNotes(String specialNotes) {
		this.specialNotes = specialNotes;
	}
}
