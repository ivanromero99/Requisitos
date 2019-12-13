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
	private JTextField textField;
	private JPasswordField passwordField_1;
	
	public Login() {
		panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		
		JButton btnIniciarSesin = new JButton("IDUMA");
		btnIniciarSesin.setBackground(Color.BLUE);
		btnIniciarSesin.setForeground(Color.WHITE);
		btnIniciarSesin.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblInicieSesinComo = new JLabel("Accede con tu cuenta iDuma:");
		lblInicieSesinComo.setForeground(Color.BLUE);
		lblInicieSesinComo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Interfaz/Logos/LogoUma.png")));
		
		JLabel lblOng = new JLabel("ONG");
		lblOng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOng.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel label = new JLabel("Contrase\u00F1a");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblAccedeConTu = new JLabel("Accede con tu cuenta ONG:");
		lblAccedeConTu.setForeground(Color.BLUE);
		lblAccedeConTu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(Color.RED);
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton button = new JButton("Iniciar Sesi\u00F3n");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBackground(Color.BLUE);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(123, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblOng, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addGap(83)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
									.addGap(53)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblAccedeConTu, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
							.addGap(62)))
					.addGap(67)
					.addComponent(lblNewLabel)
					.addGap(118))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(321)
					.addComponent(lblInicieSesinComo, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(465, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(407)
					.addComponent(btnIniciarSesin, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(590, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(70, Short.MAX_VALUE)
					.addComponent(lblInicieSesinComo)
					.addGap(63)
					.addComponent(btnIniciarSesin)
					.addGap(71)
					.addComponent(lblNewLabel_1)
					.addGap(60)
					.addComponent(lblAccedeConTu, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblOng, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(97))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(212)
					.addComponent(lblNewLabel)
					.addContainerGap(198, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		btnIniciarSesin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				LoginControlador.goToIduma();
			}
		});
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				String usuario = textField.getText();
				String password = String.valueOf(passwordField_1.getPassword());				
				boolean b = LoginControlador.iniciarSesionONG(usuario, password);
				if(!b) {
					label_1.setText("Error al iniciar sesión");
					textField.setText("");
					passwordField_1.setText("");
				} 
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
