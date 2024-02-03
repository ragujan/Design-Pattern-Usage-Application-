package com.rag.syzygy.domains;

public class CustomizedBurgerOptions extends CustomizedOptions{
    private String cheeseOptions;
    private String heatLevel;
    private String specialIngredients;
    private String vegetable1;
    private String vegetable2;

    public String getSpecialNote() {
        return specialNote;
    }

    public void setSpecialNote(String specialNote) {
        this.specialNote = specialNote;
    }

    private String specialNote;

    public CustomizedBurgerOptions(String cheeseOptions, String heatLevel, String specialIngredients, String vegetable1, String vegetable2,String specialNote) {
        this.cheeseOptions = cheeseOptions;
        this.heatLevel = heatLevel;
        this.specialIngredients = specialIngredients;
        this.vegetable1 = vegetable1;
        this.vegetable2 = vegetable2;
        this.specialNote = specialNote;
    }

    public String getCheeseOptions() {
        return cheeseOptions;
    }

    public void setCheeseOptions(String cheeseOptions) {
        this.cheeseOptions = cheeseOptions;
    }

    public String getHeatLevel() {
        return heatLevel;
    }

    public void setHeatLevel(String heatLevel) {
        this.heatLevel = heatLevel;
    }

    public String getSpecialIngredients() {
        return specialIngredients;
    }

    public void setSpecialIngredients(String specialIngredients) {
        this.specialIngredients = specialIngredients;
    }

    public String getVegetable1() {
        return vegetable1;
    }

    public void setVegetable1(String vegetable1) {
        this.vegetable1 = vegetable1;
    }

    public String getVegetable2() {
        return vegetable2;
    }

    public void setVegetable2(String vegetable2) {
        this.vegetable2 = vegetable2;
    }
}
