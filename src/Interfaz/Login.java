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
	private JTextField textField;
	private JPasswordField passwordField_1;
	
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
		
		JLabel lblOng = new JLabel("ONG");
		lblOng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOng.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel label = new JLabel("Contrase\u00F1a");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblAccedeConTu = new JLabel("Accede con tu cuenta ONG:");
		lblAccedeConTu.setForeground(Color.BLUE);
		lblAccedeConTu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		
		JButton button = new JButton("Iniciar Sesi\u00F3n");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBackground(Color.BLUE);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap(334, Short.MAX_VALUE)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
							.addGap(187))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(60)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblUsuario)
								.addComponent(lblContraseña)
								.addComponent(lblOng, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(passwordField, Alignment.LEADING)
									.addComponent(textField_Usuario, Alignment.LEADING, 364, 364, Short.MAX_VALUE)
									.addComponent(btnIniciarSesin, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAccedeConTu, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 143, Short.MAX_VALUE)))
					.addGap(139)
					.addComponent(lblNewLabel)
					.addGap(64))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(169)
					.addComponent(lblInicieSesinComo, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(680, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(88, Short.MAX_VALUE)
					.addComponent(lblInicieSesinComo)
					.addGap(53)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsuario)
						.addComponent(textField_Usuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContraseña)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(btnIniciarSesin)
					.addGap(65)
					.addComponent(lblAccedeConTu, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(lblNewLabel_1)
					.addGap(13)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblOng, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(38))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(202)
					.addComponent(lblNewLabel)
					.addContainerGap(208, Short.MAX_VALUE))
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
