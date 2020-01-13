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
import javax.swing.UIManager;

public class iDUMA implements OpenableWindow {
	
	private JPanel panel;
	private JTextField textField_Usuario;
	private JPasswordField passwordField;
	
	public iDUMA() {
		panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.background"));
		panel.setForeground(Color.WHITE);
		
		JLabel lblUsuario = new JLabel("Identificaci\u00F3n");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a");
		lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textField_Usuario = new JTextField();
		textField_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_Usuario.setColumns(10);
		
		JButton btnIniciarSesin = new JButton("Entrar");
		btnIniciarSesin.setBackground(Color.BLUE);
		btnIniciarSesin.setForeground(Color.WHITE);
		btnIniciarSesin.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblInicieSesinComo = new JLabel("iDUMA - Servicio de Identidad de la Universidad de M\u00E1laga");
		lblInicieSesinComo.setForeground(Color.BLUE);
		lblInicieSesinComo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(Color.RED);
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblIdentificacinDeUsuario = new JLabel("IDENTIFICACI\u00D3N DE USUARIO");
		lblIdentificacinDeUsuario.setForeground(Color.BLUE);
		lblIdentificacinDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JLabel lblAutenticacin = new JLabel("Autenticaci\u00F3n centralizada");
		lblAutenticacin.setForeground(Color.GRAY);
		lblAutenticacin.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblUnaVezQue = new JLabel("Una vez que se haya autenticado no ser\u00E1 necesario identificarse de nuevo para acceder a otros recursos.");
		lblUnaVezQue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUnaVezQue.setForeground(Color.DARK_GRAY);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(255)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(136)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblIdentificacinDeUsuario, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(76)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblUsuario)
								.addComponent(lblContraseña))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(passwordField)
								.addComponent(btnIniciarSesin, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_Usuario, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE))))
					.addGap(349))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(240, Short.MAX_VALUE)
					.addComponent(lblInicieSesinComo, GroupLayout.PREFERRED_SIZE, 730, GroupLayout.PREFERRED_SIZE)
					.addGap(180))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(445, Short.MAX_VALUE)
					.addComponent(lblAutenticacin, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
					.addGap(396))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(895, Short.MAX_VALUE)
					.addComponent(lblUnaVezQue)
					.addGap(199))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(76)
					.addComponent(lblInicieSesinComo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAutenticacin, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(lblIdentificacinDeUsuario, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_Usuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblUsuario))
						.addComponent(lblNewLabel_1))
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblContraseña))
					.addGap(29)
					.addComponent(btnIniciarSesin)
					.addGap(40)
					.addComponent(lblUnaVezQue)
					.addGap(61)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addGap(97))
		);
		panel.setLayout(gl_panel);
		
		btnIniciarSesin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				String usuario = textField_Usuario.getText();
				String password = String.valueOf(passwordField.getPassword());				
				boolean b = LoginControlador.iniciarSesionUsuario(usuario, password);
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
		return false;
	}
}
