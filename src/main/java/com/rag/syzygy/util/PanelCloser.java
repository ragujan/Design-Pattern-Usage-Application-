/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.syzygy.util;

import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author ACER
 */
public class PanelCloser {

	public static void close(ActionEvent evt) {
		JComponent comp = (JComponent) evt.getSource();
		Window win = SwingUtilities.getWindowAncestor(comp);
		win.dispose();
	}
}
