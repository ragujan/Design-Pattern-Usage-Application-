package com.rag.syzygy.domains;

public class CustomizedIceCreamOptions extends CustomizedOptions{
    private String baseFlavour;
    private String sauces;
    private String toppings;
    private String mixIns;
    private String extras;
    private String specialNote;

    public CustomizedIceCreamOptions(String baseFlavour, String sauces, String toppings, String mixIns, String extras, String specialNote) {
        this.baseFlavour = baseFlavour;
        this.sauces = sauces;
        this.toppings = toppings;
        this.mixIns = mixIns;
        this.extras = extras;
        this.specialNote = specialNote;
    }

    public String getBaseFlavour() {
        return baseFlavour;
    }

    public void setBaseFlavour(String baseFlavour) {
        this.baseFlavour = baseFlavour;
    }

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getMixIns() {
        return mixIns;
    }

    public void setMixIns(String mixIns) {
        this.mixIns = mixIns;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getSpecialNote() {
        return specialNote;
    }

    public void setSpecialNote(String specialNote) {
        this.specialNote = specialNote;
    }
}
