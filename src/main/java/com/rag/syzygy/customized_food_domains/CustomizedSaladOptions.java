package com.rag.syzygy.customized_food_domains;

public class CustomizedSaladOptions extends CustomizedOptions{
    private String tortillaType;
    private String proteinOptions;
    private String toppings;
    private String vegetables;
    private String specialNotes;

    public CustomizedSaladOptions(String tortillaType, String proteinOptions, String toppings, String vegetables, String specialNotes) {
        this.tortillaType = tortillaType;
        this.proteinOptions = proteinOptions;
        this.toppings = toppings;
        this.vegetables = vegetables;
        this.specialNotes = specialNotes;
    }

    public String getTortillaType() {
        return tortillaType;
    }

    public void setTortillaType(String tortillaType) {
        this.tortillaType = tortillaType;
    }

    public String getProteinOptions() {
        return proteinOptions;
    }

    public void setProteinOptions(String proteinOptions) {
        this.proteinOptions = proteinOptions;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }
}
