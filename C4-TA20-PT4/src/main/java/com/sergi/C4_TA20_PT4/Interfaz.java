package com.sergi.C4_TA20_PT4;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;

public class Interfaz {

	JFrame frmVentanaEvetos;
	JTextArea txtrTextoInicial = new JTextArea("Texto inicial");

	/**
	 * Create the application.
	 */
	public Interfaz() {
		txtrTextoInicial.setText(txtrTextoInicial.getText() + "\nVentana Activada");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVentanaEvetos = new JFrame();
		frmVentanaEvetos.setTitle("Ventana evetos");
		frmVentanaEvetos.setBounds(100, 100, 450, 300);
		frmVentanaEvetos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaEvetos.getContentPane().setLayout(null);
		frmVentanaEvetos.setLocationRelativeTo(null);
		frmVentanaEvetos.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Eventos:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(167, 10, 92, 30);
		frmVentanaEvetos.getContentPane().add(lblNewLabel);
		
		txtrTextoInicial.setText(txtrTextoInicial.getText() + "\nVentana Abierta");
		txtrTextoInicial.setFont(new Font("Monospaced", Font.PLAIN, 17));
		txtrTextoInicial.setBounds(10, 46, 416, 207);
		txtrTextoInicial.setEditable(false);
		frmVentanaEvetos.getContentPane().add(txtrTextoInicial);
	}
}
