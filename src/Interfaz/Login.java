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
import javax.swing.ImageIcon;

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
		
		JLabel lblInicieSesinComo = new JLabel("Accede con tu cuenta iDuma:");
		lblInicieSesinComo.setForeground(Color.BLUE);
		lblInicieSesinComo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Interfaz/Logos/LogoUma.png")));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap(295, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblContraseña)
								.addComponent(lblUsuario))
							.addGap(50)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_Usuario)
								.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(392)
							.addComponent(lblInicieSesinComo, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(btnIniciarSesin)))
					.addContainerGap(309, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(437)
					.addComponent(lblNewLabel)
					.addContainerGap(482, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblInicieSesinComo)
					.addGap(44)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_Usuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUsuario))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContraseña)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnIniciarSesin)
						.addComponent(lblNewLabel_1))
					.addGap(192))
		);
		panel.setLayout(gl_panel);
		
		btnIniciarSesin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				String usuario = textField_Usuario.getText();
				String password = String.valueOf(passwordField.getPassword());				
				boolean b = LoginControlador.iniciarSesion(usuario, password);
				if(!b) {
					lblNewLabel_1.setText("Error al iniciar sesión");
					textField_Usuario.setText("");
					passwordField.setText("");
				} 
			}
		});
		
		
		
	}

	public JPanel getWindow() {
		return panel;
	}

	public boolean isCentered() {
		return true;
	}
}
