/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.rag.syzygy.views;

import com.rag.syzygy.util.FoodItemList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ACER
 */
public class AddedFoodItem extends javax.swing.JPanel {

	private String foodItemName;
	private double price;
	private int qty;
	private JPanel parentPanel;

	public AddedFoodItem(String foodItemName, int qty,JPanel parentPanel) {
		initComponents();
		this.parentPanel = parentPanel;
		this.foodItemName = foodItemName;
		this.price = retriveFoodItemPrice(foodItemName);

		this.qty = qty;
		if (foodItemName != null) {
			foodNameLable.setText(foodItemName);
		}
		if (price != 0) {
			foodPriceLabel.setText(Double.toString(price));
		}
		if (qty != 0) {
			foodQtyLabel.setText(String.valueOf(qty));
		}

	}

	public double retriveFoodItemPrice(String name) {
		try {
			FoodItemList foodItem = FoodItemList.valueOf(name.toUpperCase().replace(" ","_" ));
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
                foodNameLable = new javax.swing.JLabel();
                foodPriceLabel = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                foodQtyLabel = new javax.swing.JLabel();
                jButton2 = new javax.swing.JButton();

                setBackground(new java.awt.Color(0, 204, 153));
                setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

                jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
                jLabel1.setForeground(java.awt.Color.white);
                jLabel1.setText("Name");

                jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
                jLabel2.setForeground(java.awt.Color.white);
                jLabel2.setText("Price");

                foodNameLable.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
                foodNameLable.setForeground(java.awt.Color.white);

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
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(foodNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 18, Short.MAX_VALUE))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(foodNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(foodPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(foodQtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addContainerGap(118, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
		this.parentPanel.remove(this);
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
		Map<String,Object> data = new HashMap<>();
		data.put("foodName",foodItemName);
		new Customize(new JFrame(), true,data).setVisible(true);
        }//GEN-LAST:event_jButton1ActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel foodNameLable;
        private javax.swing.JLabel foodPriceLabel;
        private javax.swing.JLabel foodQtyLabel;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        // End of variables declaration//GEN-END:variables
}
