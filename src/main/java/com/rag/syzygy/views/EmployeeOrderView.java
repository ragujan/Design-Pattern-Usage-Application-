/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rag.syzygy.views;

import com.rag.syzygy.dao.AddedFoodItemDAO;
import com.rag.syzygy.dao.context.OrderContext;
import com.rag.syzygy.domains.CustomerOrder;
import com.rag.syzygy.domains.customized_food_domains.CustomizedBurgerOptions;
import com.rag.syzygy.domains.customized_food_domains.CustomizedIceCreamOptions;
import com.rag.syzygy.domains.customized_food_domains.CustomizedOptions;
import com.rag.syzygy.domains.customized_food_domains.CustomizedPastaOptions;
import com.rag.syzygy.domains.customized_food_domains.CustomizedPizzaOptions;
import com.rag.syzygy.domains.customized_food_domains.CustomizedSaladOptions;
import com.rag.syzygy.views.customization_options.CustomizationLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author ACER
 */
public class EmployeeOrderView extends javax.swing.JFrame {

	/**
	 * Creates new form OrderView
	 */
	public EmployeeOrderView() {
		initComponents();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		myJPanel = new JPanel();
		myJPanel.setLayout(new BoxLayout(myJPanel, BoxLayout.Y_AXIS));
		myJPanel.setBackground(Color.YELLOW);
		scrollPane = new JScrollPane(myJPanel);
		scrollPane.setBackground(Color.YELLOW);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		orderViewPanel.add(scrollPane, BorderLayout.CENTER);

		orderCount();
		loadCustomers();

	}
	private JScrollPane scrollPane;
	private JPanel myJPanel;

	public void loadCustomers() {
		if (OrderContext.getOrders() != null) {

			scrollPaneCustomerViewJPanel.setLayout(new GridLayout(OrderContext.getOrders().size(), 1));
			for (CustomerOrder order : OrderContext.getOrders()) {
				JButton button = new JButton(order.getCustomer().getName());
				button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						addFoodItem(order.getCustomer().getName());
					}
				});
				scrollPaneCustomerViewJPanel.add(button);

			}

		}
	}

	public void addFoodItem(String customerName) {

		myJPanel.removeAll();
		if (OrderContext.getOrders() != null) {
			List<AddedFoodItemDAO> items = new LinkedList<>();

			for (CustomerOrder order : OrderContext.getOrders()) {
				if (order.getCustomer().getName().equals(customerName)) {
					items = order.getOrders();

					break;
				}
			}

			if (items.size() != 0) {

				for (AddedFoodItemDAO item : items) {
					String foodItemName = item.getFoodItemName();
					int qty = item.getQty();
					AddedFoodItem addedFoodItem = new AddedFoodItem(foodItemName, qty, myJPanel);
					CustomizedOptions customizedOptions = item.getCustomizedOptions();

					addedFoodItem.getOrderScrollPaneJPanel();
					JPanel orderScrollPaneJPanel = addedFoodItem.getOrderScrollPaneJPanel();
//					myJPanel.add(addedFoodItem);

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
					orderScrollPaneJPanel.setLayout(new GridLayout(panelList.size(), 1));
					for (CustomizationLabel panel : panelList) {
						orderScrollPaneJPanel.add(panel);
						customizedOptions.getKeysValue().put(panel.getjLabel1().getText(), panel.getjLabel2().getText());
					}
					addedFoodItem.setOrderScrollPaneJPanel(orderScrollPaneJPanel);
					myJPanel.add(addedFoodItem);
					myJPanel.revalidate();
					myJPanel.repaint();

				}
			}
		}

	}

	public void orderCount() {
		if (OrderContext.getOrders() != null) {
			orderCountLabel.setText(Integer.toString(OrderContext.getOrders().size()));
		} else {
			orderCountLabel.setText("0");
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
                jPanel1 = new javax.swing.JPanel();
                orderViewPanel = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                scrollPaneCustomerView = new javax.swing.JScrollPane();
                scrollPaneCustomerViewJPanel = new javax.swing.JPanel();
                orderCountLabel = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("Orders in Hand");

                jPanel1.setBackground(new java.awt.Color(0, 255, 51));

                orderViewPanel.setBackground(new java.awt.Color(0, 255, 51));
                orderViewPanel.setLayout(new javax.swing.BoxLayout(orderViewPanel, javax.swing.BoxLayout.LINE_AXIS));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(orderViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(orderViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout scrollPaneCustomerViewJPanelLayout = new javax.swing.GroupLayout(scrollPaneCustomerViewJPanel);
                scrollPaneCustomerViewJPanel.setLayout(scrollPaneCustomerViewJPanelLayout);
                scrollPaneCustomerViewJPanelLayout.setHorizontalGroup(
                        scrollPaneCustomerViewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 158, Short.MAX_VALUE)
                );
                scrollPaneCustomerViewJPanelLayout.setVerticalGroup(
                        scrollPaneCustomerViewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 365, Short.MAX_VALUE)
                );

                scrollPaneCustomerView.setViewportView(scrollPaneCustomerViewJPanel);

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPaneCustomerView, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPaneCustomerView, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(32, 32, 32)
                                                .addComponent(orderCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(213, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(orderCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
			java.util.logging.Logger.getLogger(EmployeeOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(EmployeeOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(EmployeeOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(EmployeeOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new EmployeeOrderView().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JLabel orderCountLabel;
        private javax.swing.JPanel orderViewPanel;
        private javax.swing.JScrollPane scrollPaneCustomerView;
        private javax.swing.JPanel scrollPaneCustomerViewJPanel;
        // End of variables declaration//GEN-END:variables
}
