package com.rag.syzygy.dao;

import com.rag.syzygy.domains.customized_food_domains.CustomizedOptions;
import com.rag.syzygy.views.Customize;

import javax.swing.*;

public class AddedFoodItemDAO {
    private String foodItemName;
    private double price;
    private int qty;
    private JPanel parentPanel;
    private Customize customize;
    private CustomizedOptions customizedOptions;

    public AddedFoodItemDAO(String foodItemName, double price, int qty, JPanel parentPanel, Customize customize, CustomizedOptions customizedOptions) {
        this.foodItemName = foodItemName;
        this.price = price;
        this.qty = qty;
        this.parentPanel = parentPanel;
        this.customize = customize;
        this.customizedOptions = customizedOptions;
    }

    public String getFoodItemName() {
        return foodItemName;
    }

    public void setFoodItemName(String foodItemName) {
        this.foodItemName = foodItemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public JPanel getParentPanel() {
        return parentPanel;
    }

    public void setParentPanel(JPanel parentPanel) {
        this.parentPanel = parentPanel;
    }

    public Customize getCustomize() {
        return customize;
    }

    public void setCustomize(Customize customize) {
        this.customize = customize;
    }

    public CustomizedOptions getCustomizedOptions() {
        return customizedOptions;
    }

    public void setCustomizedOptions(CustomizedOptions customizedOptions) {
        this.customizedOptions = customizedOptions;
    }
}
