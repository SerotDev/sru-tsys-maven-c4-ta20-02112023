package com.sergi.C4_TA20_PT5;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Interfaz {

	JFrame frmEventosDelRaton;
	JTextArea txtrEventosRaton;

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
		frmEventosDelRaton = new JFrame();
		frmEventosDelRaton.setTitle("Eventos del raton");
		frmEventosDelRaton.setBounds(100, 100, 450, 559);
		frmEventosDelRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEventosDelRaton.getContentPane().setLayout(null);
		frmEventosDelRaton.setLocationRelativeTo(null);
		frmEventosDelRaton.setResizable(false);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(clickLimpiar);
		btnLimpiar.setBounds(138, 10, 143, 38);
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmEventosDelRaton.getContentPane().add(btnLimpiar);
		
		txtrEventosRaton = new JTextArea("");
		txtrEventosRaton.addMouseListener(mouseEvent);
		txtrEventosRaton.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrEventosRaton.setBounds(10, 58, 426, 454);
		txtrEventosRaton.setEditable(false);
		frmEventosDelRaton.getContentPane().add(txtrEventosRaton);
	}
	
	ActionListener clickLimpiar = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			txtrEventosRaton.setText("");
		}
	};
	
	MouseAdapter mouseEvent = new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			txtrEventosRaton.setText(txtrEventosRaton.getText() + "\nEl raton ha hecho clic en el componente.");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			txtrEventosRaton.setText(txtrEventosRaton.getText() + "\nEl raton ha entrado en el componente.");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			txtrEventosRaton.setText(txtrEventosRaton.getText() + "\nEl raton ha salido en el componente.");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			txtrEventosRaton.setText(txtrEventosRaton.getText() + "\nEl raton ha sido presionado en el componente.");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			txtrEventosRaton.setText(txtrEventosRaton.getText() + "\nEl raton se ha soltado en el componente.");
		}
	};
}
