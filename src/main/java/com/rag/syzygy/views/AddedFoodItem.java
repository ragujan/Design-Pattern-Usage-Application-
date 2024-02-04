/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.rag.syzygy.views;

import com.rag.syzygy.domains.customized_food_domains.*;
import com.rag.syzygy.util.FoodItemList;
import com.rag.syzygy.views.customization_options.CustomizationLabel;
import com.rag.syzygy.listeners.ValueChangeListener;

import java.awt.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.*;

/**
 * @author ACER
 */
public class AddedFoodItem extends javax.swing.JPanel implements ValueChangeListener, CustomizationOptionValueChangedListener {

    private String foodItemName;
    private double price;
    private int qty;
    private JPanel parentPanel;
    private Customize customize;
    private CustomizedOptions customizedOptions;

    public CustomizedOptions getCustomizedOptions() {
        return customizedOptions;
    }


    public AddedFoodItem(String foodItemName, int qty, JPanel parentPanel) {
        initComponents();
        this.parentPanel = parentPanel;
        this.foodItemName = foodItemName;
        this.price = retrieveFoodItemPrice(foodItemName);

        this.qty = qty;
        if (foodItemName != null) {
            foodNameLabel.setText(foodItemName);
        }
        if (price != 0) {
            foodPriceLabel.setText(Double.toString(price));
        }
        if (qty != 0) {
            foodQtyLabel.setText(String.valueOf(qty));
        }

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
    }

    @Override
    public void valueChanged(String newValue) {
    }

    @Override
    public void valueChanged(CustomizedOptions customizedOptions) {
        this.customizedOptions = customizedOptions;
        orderScrollPaneJPanel.removeAll();

        List<CustomizationLabel> panelList = new LinkedList<>();
        if (customizedOptions instanceof CustomizedPizzaOptions customizedPizzaOptions) {
            panelList.add(new CustomizationLabel("crust", customizedPizzaOptions.getCrust()));
            panelList.add(new CustomizationLabel("size", customizedPizzaOptions.getSize()));
            panelList.add(new CustomizationLabel("topping1", customizedPizzaOptions.getToppings1()));
            panelList.add(new CustomizationLabel("topping2", customizedPizzaOptions.getToppings2()));
            panelList.add(new CustomizationLabel("slices", Integer.toString(customizedPizzaOptions.getSlices())));
            panelList.add(new CustomizationLabel("cheese options", customizedPizzaOptions.getCheeseOptions()));
            panelList.add(new CustomizationLabel("description", customizedPizzaOptions.getDescription()));
        }
        if (customizedOptions instanceof CustomizedPastaOptions customizedPastaOptions) {
            panelList.add(new CustomizationLabel("type", customizedPastaOptions.getType()));
            panelList.add(new CustomizationLabel("sauce", customizedPastaOptions.getSauce()));
            panelList.add(new CustomizationLabel("cheese toppings", customizedPastaOptions.getCheeseToppings()));
            panelList.add(new CustomizationLabel("protein addition", customizedPastaOptions.getProteinAddition()));
            panelList.add(new CustomizationLabel("vegetable option", customizedPastaOptions.getVegetableOption()));
            panelList.add(new CustomizationLabel("special notes", customizedPastaOptions.getSpecialNotes()));


        }

        if (customizedOptions instanceof CustomizedSaladOptions customizedSaladOptions) {

            panelList.add(new CustomizationLabel("tortilla type", customizedSaladOptions.getTortillaType()));
            panelList.add(new CustomizationLabel("protein options", customizedSaladOptions.getProteinOptions()));
            panelList.add(new CustomizationLabel("toppings", customizedSaladOptions.getToppings()));
            panelList.add(new CustomizationLabel("vegetables", customizedSaladOptions.getVegetables()));
            panelList.add(new CustomizationLabel("special notes", customizedSaladOptions.getSpecialNotes()));

        }


        if (customizedOptions instanceof CustomizedBurgerOptions customizedBurgerOptions) {
            panelList.add(new CustomizationLabel("cheese options", customizedBurgerOptions.getCheeseOptions()));
            panelList.add(new CustomizationLabel("heat level", customizedBurgerOptions.getHeatLevel()));
            panelList.add(new CustomizationLabel("special ingredients", customizedBurgerOptions.getSpecialIngredients()));
            panelList.add(new CustomizationLabel("vegetable 1", customizedBurgerOptions.getVegetable1()));
            panelList.add(new CustomizationLabel("vegetable 2", customizedBurgerOptions.getVegetable2()));
            panelList.add(new CustomizationLabel("special note", customizedBurgerOptions.getSpecialNote()));

        }

        if (customizedOptions instanceof CustomizedIceCreamOptions customizedIceCreamOptions) {
            panelList.add(new CustomizationLabel("base flavour", customizedIceCreamOptions.getBaseFlavour()));
            panelList.add(new CustomizationLabel("sauces", customizedIceCreamOptions.getSauces()));
            panelList.add(new CustomizationLabel("toppings", customizedIceCreamOptions.getToppings()));
            panelList.add(new CustomizationLabel("mix-ins", customizedIceCreamOptions.getMixIns()));
            panelList.add(new CustomizationLabel("extras", customizedIceCreamOptions.getExtras()));
            panelList.add(new CustomizationLabel("special note", customizedIceCreamOptions.getSpecialNote()));

        }
        orderScrollPaneJPanel.setLayout(new GridLayout(panelList.size(), 1));
        for (CustomizationLabel panel : panelList) {
            orderScrollPaneJPanel.add(panel);
            customizedOptions.getKeysValue().put(panel.getjLabel1().getText(), panel.getjLabel2().getText());
        }

    }

    public double retrieveFoodItemPrice(String name) {
        try {
            FoodItemList foodItem = FoodItemList.valueOf(name.toUpperCase().replace(" ", "_"));
            return foodItem.getPrice();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String getFoodItemName() {
        return foodItemName;
    }

    public void setFoodItemName(String foodItemName) {
        this.foodItemName = foodItemName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * Creates new form AddedFoodItem
     */
    public AddedFoodItem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        foodNameLabel = new javax.swing.JLabel();
        foodPriceLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        foodQtyLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderScrollPaneJPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 204, 153));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Price");

        foodNameLabel.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        foodNameLabel.setForeground(java.awt.Color.white);

        foodPriceLabel.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        foodPriceLabel.setForeground(java.awt.Color.white);

        jButton1.setText("Customize");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Qty");

        foodQtyLabel.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        foodQtyLabel.setForeground(java.awt.Color.white);
        foodQtyLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Customization List");

        javax.swing.GroupLayout orderScrollPaneJPanelLayout = new javax.swing.GroupLayout(orderScrollPaneJPanel);
        orderScrollPaneJPanel.setLayout(orderScrollPaneJPanelLayout);
        orderScrollPaneJPanelLayout.setHorizontalGroup(
                orderScrollPaneJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 502, Short.MAX_VALUE)
        );
        orderScrollPaneJPanelLayout.setVerticalGroup(
                orderScrollPaneJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 207, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(orderScrollPaneJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(foodPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(foodQtyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(95, 95, 95))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(foodNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel4))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(foodNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(foodPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(foodQtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.parentPanel.remove(this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Map<String, Object> data = new HashMap<>();
        data.put("foodName", foodItemName);
        customize = new Customize(new JFrame(), true, data, this);
        customize.setValueChangeListener(this);
        customize.setCustomizationOptionValueChangedListener(this);
        customize.setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel foodNameLabel;
    private javax.swing.JLabel foodPriceLabel;
    private javax.swing.JLabel foodQtyLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel orderScrollPaneJPanel;
    // End of variables declaration//GEN-END:variables

}
