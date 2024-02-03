/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.rag.syzygy.views.customization_options;

import com.rag.syzygy.domains.CustomizationOptions;
import com.rag.syzygy.domains.CustomizedPizzaOptions;
import com.rag.syzygy.util.PizzaTopping1;
import com.rag.syzygy.util.PizzaTopping2;

import java.awt.Window;

import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

/**
 * @author ACER
 */
public class PizzaCustomization extends CustomizationOptionPanel {

	/**
	 * Creates new form PizzaCustomization
	 */
	ButtonGroup crustGroup;
//	CustomizationOptions customizationOptions;

	public PizzaCustomization() {
		initComponents();

		crustGroup = new ButtonGroup();

		crustGroup.add(panButton);
		crustGroup.add(handTossedButton);
		loadTopping1Options();

	}

	public PizzaCustomization(CustomizationOptions customizationOptions) {
		this();
//		this.customizationOptions = customizationOptions;
		System.out.println("hey");
	}

	private String[] getEnumNames(Enum<?>[] values) {
		String[] names = new String[values.length];
		for (int i = 0; i < names.length; i++) {
//			System.out.println("name is "+values[i].name());
			names[i] = values[i].name();
		}
		return names;
	}

	public void loadTopping1Options() {
		topping1.removeAllItems();
		topping2.removeAllItems();

		String[] names1 = getEnumNames(PizzaTopping1.values());
		String[] names2 = getEnumNames(PizzaTopping2.values());
		for (String name : names1) {
			System.out.println("name is " + name);
			topping1.addItem(name);
		}
		for (String name : names2) {
			System.out.println("name is " + name);
			topping2.addItem(name);
		}

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
                handTossedButton = new javax.swing.JRadioButton();
                panButton = new javax.swing.JRadioButton();
                jButton1 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                topping2 = new javax.swing.JComboBox<>();
                jLabel5 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                extraNotes = new javax.swing.JTextArea();
                topping1 = new javax.swing.JComboBox<>();
                slices = new javax.swing.JComboBox<>();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                size = new javax.swing.JComboBox<>();
                jLabel8 = new javax.swing.JLabel();
                cheeseOptions = new javax.swing.JComboBox<>();

                setBackground(new java.awt.Color(204, 153, 255));

                jLabel1.setText("Pizza Customization");

                jLabel2.setText("Crust");

                handTossedButton.setSelected(true);
                handTossedButton.setText("Hand Tossed");
                handTossedButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                handTossedButtonActionPerformed(evt);
                        }
                });

                panButton.setText("Pan");
                panButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                panButtonActionPerformed(evt);
                        }
                });

                jButton1.setText("Done");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jLabel3.setText("Toppings 1");

                jLabel4.setText("Toppings 2");

                topping2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salsa", "Guacamole", "Sour Cream", "Pico de Gallo", "Cilantro", "Onions" }));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(topping2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 4, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(topping2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );

                jLabel5.setText("Extra Notes");

                extraNotes.setColumns(20);
                extraNotes.setRows(5);
                jScrollPane1.setViewportView(extraNotes);

                topping1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salsa", "Guacamole", "Sour Cream", "Pico de Gallo", "Cilantro", "Onions" }));

                slices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "6", "8" }));

                jLabel6.setText("Slices");

                jLabel7.setText("Size");

                size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "personal", "medium", "large" }));

                jLabel8.setText("Cheese Options");

                cheeseOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "American", "cheddar", "Swiss", "pepper jack", "blue cheese" }));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton1))
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(topping1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(handTossedButton)
                                                                                .addGap(26, 26, 26)
                                                                                .addComponent(panButton))
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel6)
                                                        .addComponent(slices, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(size, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(cheeseOptions, 0, 137, Short.MAX_VALUE))
                                                .addGap(0, 119, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(handTossedButton)
                                        .addComponent(panButton)
                                        .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(topping1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(slices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cheeseOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addContainerGap())
                );
        }// </editor-fold>//GEN-END:initComponents

    private void handTossedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handTossedButtonActionPerformed
	    // TODO add your handling code here:
    }//GEN-LAST:event_handTossedButtonActionPerformed

    private void panButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panButtonActionPerformed
	    // TODO add your handling code here:
    }//GEN-LAST:event_panButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	    // TODO add your handling code here:
	    String crustType = "";
	    if (panButton.isSelected()) {
		    System.out.println("Pan is selected ");
		    crustType = "pan";
	    }
	    if (handTossedButton.isSelected()) {
		    System.out.println("Hand tossed is selected ");
		    crustType = "hand toast";
	    }
	    String topping1 = this.topping1.getSelectedItem().toString();
	    String topping2 = this.topping2.getSelectedItem().toString();
	    String size = this.size.getSelectedItem().toString();
	    int slices = Integer.parseInt(this.slices.getSelectedItem().toString());
	    String specialNote = this.extraNotes.getText();
	    String cheeseOptions = this.cheeseOptions.getSelectedItem().toString();

	   CustomizationOptions customizationOptions = new CustomizedPizzaOptions(crustType, size, topping1, topping2, slices, cheeseOptions, specialNote);
	    valueChanged.valueChanged(customizationOptions);
	    JComponent comp = (JComponent) evt.getSource();
	    Window win = SwingUtilities.getWindowAncestor(comp);
	    win.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JComboBox<String> cheeseOptions;
        private javax.swing.JTextArea extraNotes;
        private javax.swing.JRadioButton handTossedButton;
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JRadioButton panButton;
        private javax.swing.JComboBox<String> size;
        private javax.swing.JComboBox<String> slices;
        private javax.swing.JComboBox<String> topping1;
        private javax.swing.JComboBox<String> topping2;
        // End of variables declaration//GEN-END:variables
}
