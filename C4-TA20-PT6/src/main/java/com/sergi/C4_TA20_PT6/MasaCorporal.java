package com.sergi.C4_TA20_PT6;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MasaCorporal {

	JFrame frmIndiceDeMasa;
	private JTextField tfAltura;
	private JTextField tfKg;
	private JLabel lblImc;

	/**
	 * Create the application.
	 */
	public MasaCorporal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIndiceDeMasa = new JFrame();
		frmIndiceDeMasa.setTitle("Indice de masa corporal");
		frmIndiceDeMasa.setBounds(100, 100, 376, 300);
		frmIndiceDeMasa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIndiceDeMasa.getContentPane().setLayout(null);
		frmIndiceDeMasa.setLocationRelativeTo(null);
		frmIndiceDeMasa.setResizable(false);
		
		JLabel lblAltura = new JLabel("Altura en metros:");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAltura.setBounds(26, 23, 163, 22);
		frmIndiceDeMasa.getContentPane().add(lblAltura);
		
		tfAltura = new JTextField();
		tfAltura.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfAltura.setBounds(184, 22, 145, 24);
		frmIndiceDeMasa.getContentPane().add(tfAltura);
		tfAltura.setColumns(10);
		
		JLabel lblKg = new JLabel("Peso en Kg:");
		lblKg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblKg.setBounds(26, 63, 163, 22);
		frmIndiceDeMasa.getContentPane().add(lblKg);
		
		tfKg = new JTextField();
		tfKg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfKg.setColumns(10);
		tfKg.setBounds(184, 62, 145, 24);
		frmIndiceDeMasa.getContentPane().add(tfKg);
		
		JButton btnCalcular = new JButton("CALCULAR I.M.C.");
		btnCalcular.addActionListener(calcularImc);
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalcular.setBounds(26, 118, 303, 46);
		frmIndiceDeMasa.getContentPane().add(btnCalcular);
		
		lblImc = new JLabel("IMC:", SwingConstants.CENTER);
		lblImc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblImc.setBounds(26, 184, 303, 32);
		frmIndiceDeMasa.getContentPane().add(lblImc);
	}
	
	ActionListener calcularImc = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//if two fields are numeric it makes the calculation
			if (isNumeric(tfAltura.getText()) && isNumeric(tfKg.getText())) {
				double height = Double.parseDouble(tfAltura.getText());
				double weight = Double.parseDouble(tfKg.getText());
				
				//calculates the body mass index
				double bmi = weight / (height * height);
				
				//shows the result:
				lblImc.setText("IMC: " + String.format( "%.4f", bmi));
				
				
			//if some field are not numeric value it shows a message to prevent wrong data
			} else {
				JOptionPane.showMessageDialog(null, "Altura o pesos incorrectos, por favor introduce datos en formato numérico separando los decimales con un punto");
			}
		}
	};
	
	/**
	 * it validates if string is numeric with optional substract sign at the first and (one dot followed with numbers) optional too.
	 * @param str Is the string that will validate if its numeric or not
	 * @return it returns a boolean (true) is numeric, (false) is not numeric 
	 */
	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?"); //RegEx
	}
}
