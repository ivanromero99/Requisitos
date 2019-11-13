package Interfaz;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Login implements OpenableWindow {
	
	private JPanel panel;
	private JTextField textField_Usuario;
	private JPasswordField passwordField;
	
	public Login() {
		panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a");
		lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textField_Usuario = new JTextField();
		textField_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_Usuario.setColumns(10);
		
		JButton btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesin.setBackground(Color.BLUE);
		btnIniciarSesin.setForeground(Color.WHITE);
		btnIniciarSesin.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(358)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnIniciarSesin)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblContraseña)
								.addComponent(lblUsuario))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(passwordField)
								.addComponent(textField_Usuario))))
					.addContainerGap(424, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(183)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsuario)
						.addComponent(textField_Usuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContraseña)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addComponent(btnIniciarSesin)
					.addContainerGap(308, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		btnIniciarSesin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				String usuario = textField_Usuario.getText();
				String password = String.valueOf(passwordField.getPassword());				
				LoginControlador.iniciarSesion(usuario, password);
			}
		});
	}

	public JPanel getWindow() {
		return panel;
	}

	public boolean isCentered() {
		return false;
	}
	
}
