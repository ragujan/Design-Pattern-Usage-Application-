/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.rag.syzygy.views.customization_options;

import com.rag.syzygy.domains.customized_food_domains.CustomizedSaladOptions;
import com.rag.syzygy.design_patterns.factory.CustomizedOptionsFactory;
import com.rag.syzygy.design_patterns.interpreter.CommandExpression;
import com.rag.syzygy.design_patterns.interpreter.ExtraNoteContext;
import com.rag.syzygy.design_patterns.interpreter.RemoveOptionExpression;
import com.rag.syzygy.design_patterns.interpreter.ToggleOptionExpression;
import com.rag.syzygy.util.FoodItemList;
import com.rag.syzygy.util.ExtraNoteCommands;
import java.awt.Window;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

/**
 *
 * @author ACER
 */
public class SaladCustomization extends CustomizationOptionPanel {

	/**
	 * Creates new form PizzaCustomization
	 */
	public SaladCustomization() {
		initComponents();
		context = new ExtraNoteContext();
	}

	private ExtraNoteContext context;

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                extraNoteLabel = new javax.swing.JTextArea();
                jButton1 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jComboBox1 = new javax.swing.JComboBox<>();
                jLabel3 = new javax.swing.JLabel();
                jComboBox2 = new javax.swing.JComboBox<>();
                jLabel4 = new javax.swing.JLabel();
                jComboBox3 = new javax.swing.JComboBox<>();
                jLabel5 = new javax.swing.JLabel();
                jComboBox4 = new javax.swing.JComboBox<>();
                jLabel6 = new javax.swing.JLabel();
                jButton4 = new javax.swing.JButton();
                jButton5 = new javax.swing.JButton();
                jButton7 = new javax.swing.JButton();
                jButton6 = new javax.swing.JButton();

                jLabel1.setText("Salad Customization");

                extraNoteLabel.setColumns(20);
                extraNoteLabel.setRows(5);
                jScrollPane1.setViewportView(extraNoteLabel);

                jButton1.setText("Done");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jLabel2.setText("Tortilla Type");

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corn", "Flour", "Whole Wheat", "Hard Shell", "Soft Shell" }));

                jLabel3.setText("Protein Options");

                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grilled Chicken", "Beef Barbacoa", "Carnitas", "Shrimp", "Tofu" }));

                jLabel4.setText("Toppings");

                jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salsa", "Guacamole", "Sour Cream", "Pico de Gallo", "Cilantro", "Onions" }));

                jLabel5.setText("Vegetables");

                jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lettuce", "Tomatoes", "Onions", "Jalapeños", "Bell Peppers" }));

                jLabel6.setText("Extra Notes");

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

                jButton7.setText("Less Spice");
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton7ActionPerformed(evt);
                        }
                });

                jButton6.setText("Less Salt");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton6ActionPerformed(evt);
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
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jComboBox2, 0, 156, Short.MAX_VALUE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jComboBox3, 0, 163, Short.MAX_VALUE)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addComponent(jLabel6)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton4)
                                                                        .addComponent(jButton7))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton6)
                                                                        .addComponent(jButton5))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4)
                                        .addComponent(jButton5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton6)
                                        .addComponent(jButton7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addContainerGap())
                );
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:

		String tortillaType = jComboBox1.getSelectedItem().toString();
		String proteinOptions = jComboBox2.getSelectedItem().toString();
		String toppings = jComboBox2.getSelectedItem().toString();
		String vegetables = jComboBox3.getSelectedItem().toString();
		String specialNotes = extraNoteLabel.getText();

//		this.customizationOptions = new CustomizedSaladOptions(tortillaType, proteinOptions, toppings, vegetables, specialNotes);
		customizationOptions = CustomizedOptionsFactory.createCustomizedOptions(FoodItemList.SALAD.name());

		CustomizedSaladOptions customizedSaladOptions = (CustomizedSaladOptions) customizationOptions;
		customizedSaladOptions.setTortillaType(tortillaType);
		customizedSaladOptions.setProteinOptions(proteinOptions);
		customizedSaladOptions.setToppings(toppings);
		customizedSaladOptions.setVegetables(vegetables);
		customizedSaladOptions.setSpecialNotes(specialNotes);

		this.customizationOptions = customizedSaladOptions;
		this.valueChanged.valueChanged(this.customizationOptions);

		JComponent comp = (JComponent) evt.getSource();
		Window win = SwingUtilities.getWindowAncestor(comp);
		win.dispose();
        }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:
		CommandExpression toggleDetailsExpression = new ToggleOptionExpression(ExtraNoteCommands.EXTRA_SPICE.name());
		CommandExpression removeDetailsExpression = new RemoveOptionExpression(ExtraNoteCommands.LESS_SPICE.name());
		toggleDetailsExpression.interpret(context);
		removeDetailsExpression.interpret(context);
		extraNoteLabel.setText(context.toString());
        }//GEN-LAST:event_jButton4ActionPerformed

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
		// TODO add your handling code here:
		CommandExpression toggleDetailsExpression = new ToggleOptionExpression(ExtraNoteCommands.EXTRA_SALT.name());
		CommandExpression removeDetailsExpression = new RemoveOptionExpression(ExtraNoteCommands.LESS_SALT.name());
		toggleDetailsExpression.interpret(context);
		removeDetailsExpression.interpret(context);
		extraNoteLabel.setText(context.toString());
        }//GEN-LAST:event_jButton5ActionPerformed

        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
		// TODO add your handling code here:
		CommandExpression toggleDetailsExpression = new ToggleOptionExpression(ExtraNoteCommands.LESS_SPICE.name());
		CommandExpression removeDetailsExpression = new RemoveOptionExpression(ExtraNoteCommands.EXTRA_SPICE.name());
		toggleDetailsExpression.interpret(context);
		removeDetailsExpression.interpret(context);
		extraNoteLabel.setText(context.toString());
        }//GEN-LAST:event_jButton7ActionPerformed
        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
		// TODO add your handling code here:
		CommandExpression toggleDetailsExpression = new ToggleOptionExpression(ExtraNoteCommands.LESS_SALT.name());
		CommandExpression removeDetailsExpression = new RemoveOptionExpression(ExtraNoteCommands.EXTRA_SALT.name());
                toggleDetailsExpression.interpret(context);
                removeDetailsExpression.interpret(context);
                extraNoteLabel.setText(context.toString());

        }//GEN-LAST:event_jButton6ActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextArea extraNoteLabel;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JComboBox<String> jComboBox2;
        private javax.swing.JComboBox<String> jComboBox3;
        private javax.swing.JComboBox<String> jComboBox4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JScrollPane jScrollPane1;
        // End of variables declaration//GEN-END:variables
}
