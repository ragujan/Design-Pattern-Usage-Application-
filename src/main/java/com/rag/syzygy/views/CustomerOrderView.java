/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rag.syzygy.views;

import com.rag.syzygy.design_patterns.mediator.MediatorContext;
import com.rag.syzygy.dao.AddedFoodItemDAO;
import com.rag.syzygy.context.OrderContext;
import com.rag.syzygy.design_patterns.mediator.Actor;
import com.rag.syzygy.design_patterns.mediator.ActorStorage;
import com.rag.syzygy.design_patterns.mediator.Chat;
import com.rag.syzygy.design_patterns.mediator.ChatCustomer;
import com.rag.syzygy.design_patterns.mediator.ChatEmployee;
import com.rag.syzygy.design_patterns.mediator.ChatHistory;
import com.rag.syzygy.design_patterns.mediator.EmployeeChatContext;
import com.rag.syzygy.design_patterns.mediator.Mediator;
import com.rag.syzygy.domains.Customer;
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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author ACER
 */
public class CustomerOrderView extends javax.swing.JFrame {

	/**
	 * Creates new form CustomerOrderView
	 */
	Customer customer;

	public CustomerOrderView(Customer customer) {
		initComponents();
		this.customer = customer;

		myJPanel = new JPanel();
		myJPanel.setLayout(new BoxLayout(myJPanel, BoxLayout.Y_AXIS));
		myJPanel.setBackground(Color.YELLOW);
		scrollPane = new JScrollPane(myJPanel);
		scrollPane.setBackground(Color.YELLOW);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		orderViewPanel.add(scrollPane, BorderLayout.CENTER);
		addFoodItem();
		customerName.setText(customer.getName());
		customerContact.setText(customer.getContact());
		customerAddress.setText(customer.getAddress());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);

	}

	public CustomerOrderView() {
		initComponents();
	}
	private JScrollPane scrollPane;
	private JPanel myJPanel;

	public CustomerOrderView(CustomerOrderView orderView) {

	}

	public void addFoodItem() {

		myJPanel.removeAll();
		if (OrderContext.getOrders() != null) {
			List<AddedFoodItemDAO> items = new LinkedList<>();

			for (CustomerOrder order : OrderContext.getOrders()) {
				if (order.getCustomer().getName().equals(this.customer.getName())) {
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

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                messageTextField = new javax.swing.JTextField();
                sendButton = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                chatScrollPane = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                customerName = new javax.swing.JLabel();
                customerContact = new javax.swing.JLabel();
                customerAddress = new javax.swing.JLabel();
                orderViewPanel = new javax.swing.JPanel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("Chat With Team");

                sendButton.setText("Send");
                sendButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                sendButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout chatScrollPaneLayout = new javax.swing.GroupLayout(chatScrollPane);
                chatScrollPane.setLayout(chatScrollPaneLayout);
                chatScrollPaneLayout.setHorizontalGroup(
                        chatScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 193, Short.MAX_VALUE)
                );
                chatScrollPaneLayout.setVerticalGroup(
                        chatScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 186, Short.MAX_VALUE)
                );

                jScrollPane1.setViewportView(chatScrollPane);

                jLabel2.setText("Your Order Details");

                jLabel3.setText("Name");

                jLabel4.setText("Contact");

                jLabel5.setText("Address");

                orderViewPanel.setBackground(new java.awt.Color(0, 255, 51));
                orderViewPanel.setLayout(new javax.swing.BoxLayout(orderViewPanel, javax.swing.BoxLayout.LINE_AXIS));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(customerAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(customerContact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orderViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sendButton))
                                        .addComponent(jLabel1)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(orderViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(customerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(customerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(sendButton)))))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

	int rowCount=0;
        private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
		// TODO add your handling code here:
		chatScrollPane.removeAll();
		rowCount=0;
		String message = messageTextField.getText();
		Mediator mediator = MediatorContext.getMediator();
		ChatCustomer chatCustomer = (ChatCustomer) ActorStorage.getChatCustomer(customer.getName());
		mediator.sendMessage(message, chatCustomer, EmployeeChatContext.getMainChatEmployee());

		Map<Actor, List<Chat>> chats = ChatHistory.getChats();

		for (Map.Entry<Actor, List<Chat>> entry : chats.entrySet()) {
			Actor key = entry.getKey();
			List<Chat> value = entry.getValue();

			if (key instanceof ChatEmployee) {

				ChatEmployee employee = (ChatEmployee) key;
				System.out.println("Actor is " + employee.getName());

				value.forEach(e -> {
					ChatCustomer customer = (ChatCustomer) e.getReceive();

					if (customer.getName().equals(this.customer.getName())) {
//						System.out.println("message " + e.getMessage() + " to " + customer.getName());
						chatScrollPane.add(new ToChatPanel("Employee", e.getMessage()));
						rowCount++;
					}
				});
			}
			if (key instanceof ChatCustomer) {
				ChatCustomer customer = (ChatCustomer) key;

				System.out.println("Actor is " + customer.getName());
				value.forEach(e -> {
					ChatEmployee employee = (ChatEmployee) e.getReceive();

//					System.out.println("message " + e.getMessage() + " to " + employee.getName());
					chatScrollPane.add(new FromChatPanel(e.getMessage()));
						rowCount++;
				});
			}

		}
		chatScrollPane.setLayout(new GridLayout(rowCount, 1));
		chatScrollPane.revalidate();
		chatScrollPane.repaint();
        }//GEN-LAST:event_sendButtonActionPerformed

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
			java.util.logging.Logger.getLogger(CustomerOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CustomerOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CustomerOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CustomerOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CustomerOrderView().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel chatScrollPane;
        private javax.swing.JLabel customerAddress;
        private javax.swing.JLabel customerContact;
        private javax.swing.JLabel customerName;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextField messageTextField;
        private javax.swing.JPanel orderViewPanel;
        private javax.swing.JButton sendButton;
        // End of variables declaration//GEN-END:variables
}
