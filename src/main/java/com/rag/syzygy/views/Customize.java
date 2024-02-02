/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.rag.syzygy.views;

import com.rag.syzygy.domains.PizzaCustomizedOptions;
import com.rag.syzygy.util.FoodItemList;
import com.rag.syzygy.views.customization_options.*;

import java.awt.BorderLayout;
import java.util.Map;
import javax.swing.JScrollPane;

/**
 * @author ACER
 */
public class Customize extends javax.swing.JDialog implements CustomizationOptionValueChangedListener {

    /**
     * Creates new form Customize
     */
    private Map<String, Object> data;
    private JScrollPane jScrollPane;
    private CustomizationOptions customizationOptions;
//    private AddedFoodItem addedFoodItem;
    private ValueChangeListener listener;
    private CustomizationOptionValueChangedListener customizationOptionValueChangedListener;

    public void setValueChangeListener(ValueChangeListener listener) {
        this.listener = listener;
    }

    public void setCustomizationOptionValueChangedListener(CustomizationOptionValueChangedListener customizationOptionValueChangedListener) {
        this.customizationOptionValueChangedListener = customizationOptionValueChangedListener;
    }



    @Override
    public void valueChanged(CustomizationOptions customizationOptions) {
        this.customizationOptions = customizationOptions;
        if(this.customizationOptions instanceof PizzaCustomizedOptions pizzaCustomizedOptions){
            this.customizationOptionValueChangedListener.valueChanged(customizationOptions);
        }
    }

    public Customize(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Customize(java.awt.Frame parent, boolean modal, Map<String, Object> values,  AddedFoodItem addedFoodItem) {
        super(parent, modal);
        initComponents();
        data = values;
        foodItemNameLabel.setText(data.get("foodName").toString());
        customizationPanel.setLayout(new BorderLayout());
//        this.addedFoodItem = addedFoodItem;
        this.listener = addedFoodItem;
        this.customizationOptionValueChangedListener = addedFoodItem;
        orderOptions();
    }

    private FoodItemList getFoodItemList() {
        return FoodItemList.valueOf(data.get("foodName").toString().toUpperCase().replace(" ", "_"));
    }

    private void orderOptions() {
        this.listener.valueChanged("hello");
        CustomizationOptionPanel customizationOptionsPanel = new CustomizationOptionPanel();
        if (getFoodItemList().getFoodItemName().equals(FoodItemList.PIZZA.name())) {
            System.out.println("price of the Pizza item is " + getFoodItemList().getFoodItemName());
            customizationOptionsPanel = new PizzaCustomization(customizationOptions);
            customizationOptionsPanel.setValueChanged(this);

        }

        if (getFoodItemList().getFoodItemName().equals(FoodItemList.PASTA.name())) {
            System.out.println("price of the food item is " + getFoodItemList().getFoodItemName());
            customizationOptionsPanel = new PastaCustomization();

        }

        if (getFoodItemList().getFoodItemName().equals(FoodItemList.SALAD.name())) {
            System.out.println("price of the food item is " + getFoodItemList().getFoodItemName());
            customizationOptionsPanel = new SaladCustomization();
        }

        if (getFoodItemList().getFoodItemName().equals(FoodItemList.BURGER.name())) {
            customizationOptionsPanel = new BurgerCustomization();

        }

        if (getFoodItemList().getFoodItemName().equals(FoodItemList.ICE_CREAM.name())) {
            System.out.println("price of the food item is " + getFoodItemList().getFoodItemName());
            customizationOptionsPanel = new IceCreamCustomization();
        }

        customizationOptionsPanel.setVisible(true);
        jScrollPane = new JScrollPane(customizationOptionsPanel);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        customizationPanel.add(jScrollPane, BorderLayout.CENTER);
        jScrollPane.getVerticalScrollBar().setUnitIncrement(16);
        customizationPanel.revalidate();
        customizationPanel.repaint();
        this.revalidate();
        this.repaint();

// Repeat for other food items
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
                foodItemNameLabel = new javax.swing.JLabel();
                customizationPanel = new javax.swing.JPanel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setBackground(new java.awt.Color(0, 204, 204));

                jLabel1.setText("Customize Your Food Item");

                jLabel2.setText("Food Item Name");

                customizationPanel.setBackground(new java.awt.Color(0, 255, 255));

                javax.swing.GroupLayout customizationPanelLayout = new javax.swing.GroupLayout(customizationPanel);
                customizationPanel.setLayout(customizationPanelLayout);
                customizationPanelLayout.setHorizontalGroup(
                        customizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                customizationPanelLayout.setVerticalGroup(
                        customizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 267, Short.MAX_VALUE)
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(customizationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(foodItemNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel1))
                                                .addContainerGap(234, Short.MAX_VALUE))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(foodItemNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customizationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Customize dialog = new Customize(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel customizationPanel;
        private javax.swing.JLabel foodItemNameLabel;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        // End of variables declaration//GEN-END:variables
}
