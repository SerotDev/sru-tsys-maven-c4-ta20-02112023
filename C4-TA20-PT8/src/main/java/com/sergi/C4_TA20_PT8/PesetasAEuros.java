package com.sergi.C4_TA20_PT8;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PesetasAEuros {

	JFrame frmCalculadoraDeCambio;
	JTextField tfQuantity;
	JTextField tfResult;
	private JButton btnCalculate;
	private final String CURRENCIES[] = {"Ptas a euros","Euros a ptas"};
	private final double CONVERSION_FACTOR[] = {0.0060101210438378,166.386};

	/**
	 * Create the application.
	 */
	public PesetasAEuros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraDeCambio = new JFrame();
		frmCalculadoraDeCambio.setTitle("Cambio de moneda");
		frmCalculadoraDeCambio.setBounds(100, 100, 424, 264);
		frmCalculadoraDeCambio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraDeCambio.getContentPane().setLayout(null);
		frmCalculadoraDeCambio.setLocationRelativeTo(null);
		frmCalculadoraDeCambio.setResizable(false);
		
		JLabel lblQuantity = new JLabel("Cantidad a convertir:");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQuantity.setBounds(26, 23, 182, 22);
		frmCalculadoraDeCambio.getContentPane().add(lblQuantity);
		
		tfQuantity = new JTextField();
		tfQuantity.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfQuantity.setBounds(218, 22, 173, 24);
		frmCalculadoraDeCambio.getContentPane().add(tfQuantity);
		tfQuantity.setColumns(10);
		
		JLabel lblResult = new JLabel("Resultado:");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResult.setBounds(107, 66, 101, 22);
		frmCalculadoraDeCambio.getContentPane().add(lblResult);
		
		tfResult = new JTextField();
		tfResult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfResult.setColumns(10);
		tfResult.setBounds(218, 65, 173, 24);
		tfResult.setEditable(false);
		frmCalculadoraDeCambio.getContentPane().add(tfResult);
		
		JButton btnClear = new JButton("Borrar datos");
		btnClear.addActionListener(clickClear);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setBounds(26, 165, 182, 46);
		frmCalculadoraDeCambio.getContentPane().add(btnClear);
		
		btnCalculate = new JButton("Euros a ptas");
		btnCalculate.addActionListener(clickCalculate);
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalculate.setBounds(27, 109, 364, 46);
		frmCalculadoraDeCambio.getContentPane().add(btnCalculate);
		
		JButton btnChange = new JButton("Cambiar");
		btnChange.addActionListener(clickChange);
		btnChange.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChange.setBounds(218, 165, 173, 46);
		frmCalculadoraDeCambio.getContentPane().add(btnChange);
	}
	
	ActionListener clickClear = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tfQuantity.setText("");
			tfResult.setText("");
		}
	};
	
	ActionListener clickChange = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(btnCalculate.getText().equals(CURRENCIES[0])) {
				btnCalculate.setText(CURRENCIES[1]);
			}else if(btnCalculate.getText().equals(CURRENCIES[1])) {
				btnCalculate.setText(CURRENCIES[0]);
			}
		}
	};
	
	ActionListener clickCalculate = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//if text from text field is numeric do the calculation depending of the calculate button text
			if (isNumeric(tfQuantity.getText())) {
				double result = 0;
				if(btnCalculate.getText().equals(CURRENCIES[0])) {
					result = Double.parseDouble(tfQuantity.getText()) * CONVERSION_FACTOR[0];
				}else if(btnCalculate.getText().equals(CURRENCIES[1])) {
					result = Double.parseDouble(tfQuantity.getText()) * CONVERSION_FACTOR[1];
				}
				//it prints the result
				tfResult.setText(String.format("%.2f", result).replace(",", "."));
			} else {
				JOptionPane.showMessageDialog(null, "Dato no válido, ingresa un dato numérico y si es decimal usa el punto.");
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
