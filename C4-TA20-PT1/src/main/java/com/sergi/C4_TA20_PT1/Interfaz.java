package com.sergi.C4_TA20_PT1;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

public class Interfaz {

	JFrame frmInterfaz;

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInterfaz = new JFrame();
		frmInterfaz.setTitle("Interfaz");
		frmInterfaz.setBounds(100, 100, 450, 200);
		frmInterfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInterfaz.setLocationRelativeTo(null);
		frmInterfaz.setMinimumSize(new Dimension(230, 100));
		frmInterfaz.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Hello World!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		frmInterfaz.getContentPane().add(lblNewLabel);
		
	}
}
