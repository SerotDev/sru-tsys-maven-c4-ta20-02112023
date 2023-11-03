package com.sergi.C4_TA20_PT2;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz {

	JFrame frmVentanaConInteraccion;
	private JLabel lblText;


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
		frmVentanaConInteraccion = new JFrame();
		frmVentanaConInteraccion.setTitle("Ventana con interacción");
		frmVentanaConInteraccion.setBounds(100, 100, 450, 200);
		frmVentanaConInteraccion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaConInteraccion.setLocationRelativeTo(null);
		frmVentanaConInteraccion.setResizable(false);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.addActionListener(clickBtn);
		btn1.setBounds(50, 34, 143, 38);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btn2 = new JButton("Boton 2");
		btn2.addActionListener(clickBtn);
		btn2.setBounds(240, 34, 143, 38);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lblText = new JLabel("", SwingConstants.CENTER);
		lblText.setBounds(50, 105, 333, 25);
		lblText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmVentanaConInteraccion.getContentPane().setLayout(null);
		frmVentanaConInteraccion.getContentPane().add(btn1);
		frmVentanaConInteraccion.getContentPane().add(btn2);
		frmVentanaConInteraccion.getContentPane().add(lblText);
		
	}
	
	ActionListener clickBtn = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton boton = (JButton) e.getSource();
			lblText.setText("Has pulsado: " + boton.getText());
			
		}
	};
}
