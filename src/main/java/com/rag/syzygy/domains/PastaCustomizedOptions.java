/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.syzygy.domains;

import com.rag.syzygy.views.customization_options.CustomizationOptions;

/**
 *
 * @author ACER
 */
public class PastaCustomizedOptions extends CustomizationOptions {

	private String type;
	private String sauce;
	private String cheeseToppings;
	private String proteinAddition;
	private int vegetableOption;
	private String specialNotes;

	public PastaCustomizedOptions() {
	}

	public PastaCustomizedOptions(String type, String sauce, String cheeseToppings, String proteinAddition, int vegetableOption, String specialNotes) {
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

	public int getVegetableOption() {
		return vegetableOption;
	}

	public void setVegetableOption(int vegetableOption) {
		this.vegetableOption = vegetableOption;
	}

	public String getSpecialNotes() {
		return specialNotes;
	}

	public void setSpecialNotes(String specialNotes) {
		this.specialNotes = specialNotes;
	}
}
