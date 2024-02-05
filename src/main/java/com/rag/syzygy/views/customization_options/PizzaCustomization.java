/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.rag.syzygy.views.customization_options;

import com.rag.syzygy.domains.customized_food_domains.CustomizedOptions;
import com.rag.syzygy.domains.customized_food_domains.CustomizedPizzaOptions;
import com.rag.syzygy.design_patterns.factory.CustomizedOptionsFactory;
import com.rag.syzygy.design_patterns.interpreter.AddOptionExpression;
import com.rag.syzygy.design_patterns.interpreter.CommandExpression;
import com.rag.syzygy.design_patterns.interpreter.ExtraNoteContext;
import com.rag.syzygy.design_patterns.interpreter.RemoveOptionExpression;
import com.rag.syzygy.design_patterns.interpreter.ToggleOptionExpression;
import com.rag.syzygy.util.FoodItemList;
import com.rag.syzygy.util.ExtraNoteCommands;
import com.rag.syzygy.util.PizzaTopping1;
import com.rag.syzygy.util.PizzaTopping2;

import java.awt.Window;

import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 * @author ACER
 */
public class PizzaCustomization extends CustomizationOptionPanel {

	/**
	 * Creates new form PizzaCustomization
	 */
	ButtonGroup crustGroup;
	ExtraNoteContext pizzaContext;
//	CustomizationOptions customizationOptions;

	public PizzaCustomization() {
		initComponents();

		crustGroup = new ButtonGroup();

		crustGroup.add(panButton);
		crustGroup.add(handTossedButton);
		loadTopping1Options();
		this.pizzaContext = new ExtraNoteContext();
	}

	public PizzaCustomization(CustomizedOptions customizationOptions) {
		this();
//		this.customizationOptions = customizationOptions;
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
			topping1.addItem(name);
		}
		for (String name : names2) {
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
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jButton5 = new javax.swing.JButton();
                jButton6 = new javax.swing.JButton();
                jButton7 = new javax.swing.JButton();
                jButton8 = new javax.swing.JButton();
                jButton9 = new javax.swing.JButton();

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

                jButton2.setText("Extra Cheese");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton3.setText("Extra Onions");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jButton4.setText("Extra Spice");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jButton5.setText("Extra Salt");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                jButton6.setText("Less Salt");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton6ActionPerformed(evt);
                        }
                });

                jButton7.setText("Less Spice");
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton7ActionPerformed(evt);
                        }
                });

                jButton8.setText("Less Onions");
                jButton8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton8ActionPerformed(evt);
                        }
                });

                jButton9.setText("Less Cheese");
                jButton9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton9ActionPerformed(evt);
                        }
                });

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
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(topping1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(handTossedButton)
                                                                                .addGap(26, 26, 26)
                                                                                .addComponent(panButton))
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(slices, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(size, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(cheeseOptions, 0, 137, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton2)
                                                                        .addComponent(jButton9))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton8))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton4)
                                                                        .addComponent(jButton7))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton6)
                                                                        .addComponent(jButton5))))
                                                .addGap(0, 118, Short.MAX_VALUE)))
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4)
                                        .addComponent(jButton5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton6)
                                        .addComponent(jButton7)
                                        .addComponent(jButton8)
                                        .addComponent(jButton9))
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

	    customizationOptions = CustomizedOptionsFactory.createCustomizedOptions(FoodItemList.PIZZA.name());

	    CustomizedPizzaOptions pizzaOptions = (CustomizedPizzaOptions) customizationOptions;

	    pizzaOptions.setCrust(crustType);
	    pizzaOptions.setSize(size);
	    pizzaOptions.setToppings1(topping1);
	    pizzaOptions.setToppings2(topping2);
	    pizzaOptions.setSlices(slices);
	    pizzaOptions.setCheeseOptions(cheeseOptions);
	    pizzaOptions.setDescription(specialNote);

	    customizationOptions = pizzaOptions;
	    valueChanged.valueChanged(customizationOptions);

	    JComponent comp = (JComponent) evt.getSource();
	    Window win = SwingUtilities.getWindowAncestor(comp);
	    win.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
		String extraCheese = ExtraNoteCommands.EXTRA_CHEESE.name();

		CommandExpression toggleExpression = new ToggleOptionExpression(extraCheese);
		CommandExpression removeDetailsExpression = new RemoveOptionExpression(ExtraNoteCommands.LESS_CHEESE.name());
		toggleExpression.interpret(pizzaContext);
		removeDetailsExpression.interpret(pizzaContext);
		extraNotes.setText(pizzaContext.toString());

        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:
		String extraCheese = ExtraNoteCommands.EXTRA_ONIONS.name();
		CommandExpression toggleDetailsExpression = new ToggleOptionExpression(extraCheese);
		CommandExpression removeDetailsExpression = new RemoveOptionExpression(ExtraNoteCommands.LESS_ONIONS.name());
		toggleDetailsExpression.interpret(pizzaContext);
		removeDetailsExpression.interpret(pizzaContext);
		extraNotes.setText(pizzaContext.toString());
        }//GEN-LAST:event_jButton3ActionPerformed

        private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
		// TODO add your handling code here:
		String lessCheese = ExtraNoteCommands.LESS_CHEESE.name();
		CommandExpression toggleDetailsExpression = new ToggleOptionExpression(lessCheese);
		CommandExpression removeDetailsExpression = new RemoveOptionExpression(ExtraNoteCommands.EXTRA_CHEESE.name());
		toggleDetailsExpression.interpret(pizzaContext);
		removeDetailsExpression.interpret(pizzaContext);
		extraNotes.setText(pizzaContext.toString());
        }//GEN-LAST:event_jButton9ActionPerformed

        private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
		// TODO add your handling code here:
		CommandExpression toggleDetailsExpression = new ToggleOptionExpression(ExtraNoteCommands.LESS_ONIONS.name());
		CommandExpression removeDetailsExpression = new RemoveOptionExpression(ExtraNoteCommands.EXTRA_ONIONS.name());
		toggleDetailsExpression.interpret(pizzaContext);
		removeDetailsExpression.interpret(pizzaContext);
		extraNotes.setText(pizzaContext.toString());
        }//GEN-LAST:event_jButton8ActionPerformed

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:
		CommandExpression toggleDetailsExpression = new ToggleOptionExpression(ExtraNoteCommands.EXTRA_SPICE.name());
		CommandExpression removeDetailsExpression = new RemoveOptionExpression(ExtraNoteCommands.LESS_SPICE.name());
		toggleDetailsExpression.interpret(pizzaContext);
		removeDetailsExpression.interpret(pizzaContext);
		extraNotes.setText(pizzaContext.toString());
        }//GEN-LAST:event_jButton4ActionPerformed

        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
		// TODO add your handling code here:
		CommandExpression toggleDetailsExpression = new ToggleOptionExpression(ExtraNoteCommands.LESS_SPICE.name());
		CommandExpression removeDetailsExpression = new RemoveOptionExpression(ExtraNoteCommands.EXTRA_SPICE.name());
		toggleDetailsExpression.interpret(pizzaContext);
		removeDetailsExpression.interpret(pizzaContext);
		extraNotes.setText(pizzaContext.toString());
        }//GEN-LAST:event_jButton7ActionPerformed

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
		// TODO add your handling code here:
		CommandExpression toggleDetailsExpression = new ToggleOptionExpression(ExtraNoteCommands.EXTRA_SALT.name());
		CommandExpression removeDetailsExpression = new RemoveOptionExpression(ExtraNoteCommands.LESS_SALT.name());
		toggleDetailsExpression.interpret(pizzaContext);
		removeDetailsExpression.interpret(pizzaContext);
		extraNotes.setText(pizzaContext.toString());
        }//GEN-LAST:event_jButton5ActionPerformed

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
		// TODO add your handling code here:
		CommandExpression toggleDetailsExpression = new ToggleOptionExpression(ExtraNoteCommands.LESS_SALT.name());
		CommandExpression removeDetailsExpression = new RemoveOptionExpression(ExtraNoteCommands.EXTRA_SALT.name());
		toggleDetailsExpression.interpret(pizzaContext);
		removeDetailsExpression.interpret(pizzaContext);
		extraNotes.setText(pizzaContext.toString());
        }//GEN-LAST:event_jButton6ActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JComboBox<String> cheeseOptions;
        private javax.swing.JTextArea extraNotes;
        private javax.swing.JRadioButton handTossedButton;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JButton jButton8;
        private javax.swing.JButton jButton9;
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
