package com.sergi.C4_TA20_PT3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfaz {

	JFrame frmContadorDeClicks;
	JLabel lblClickBtn1, lblClickBtn2;
	private int countBtn1 = 0;
	private int countBtn2 = 0;

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
		frmContadorDeClicks = new JFrame();
		frmContadorDeClicks.setTitle("Contador de clicks en botones");
		frmContadorDeClicks.setBounds(100, 100, 450, 200);
		frmContadorDeClicks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmContadorDeClicks.getContentPane().setLayout(null);
		frmContadorDeClicks.setLocationRelativeTo(null);
		frmContadorDeClicks.setResizable(false);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.addActionListener(clickBtn1);
		btn1.setBounds(50, 34, 143, 38);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btn2 = new JButton("Boton 2");
		btn2.addActionListener(clickBtn2);
		btn2.setBounds(240, 34, 143, 38);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lblClickBtn1 = new JLabel("Clics en Boton 1: 0");
		lblClickBtn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClickBtn1.setBounds(50, 90, 180, 20);
		
		lblClickBtn2 = new JLabel("Clics en Boton 2: 0");
		lblClickBtn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClickBtn2.setBounds(240, 90, 186, 20);
		
		frmContadorDeClicks.getContentPane().add(btn1);
		frmContadorDeClicks.getContentPane().add(btn2);
		frmContadorDeClicks.getContentPane().add(lblClickBtn1);
		frmContadorDeClicks.getContentPane().add(lblClickBtn2);
	}
	
	ActionListener clickBtn1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			countBtn1++;
			lblClickBtn1.setText("Clics en Boton 1: " + countBtn1);
			
		}
	};
	
	ActionListener clickBtn2 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			countBtn2++;
			lblClickBtn2.setText("Clics en Boton 2: " + countBtn2);
		}
	};
}
