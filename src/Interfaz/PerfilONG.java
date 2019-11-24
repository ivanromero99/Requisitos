package Interfaz;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import Implementacion.Categoria;
import Implementacion.Login;
import Implementacion.Subcategoria;
import javax.swing.JTextArea;

public class PerfilONG implements OpenableWindow {
	
	private JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	private boolean turno;
	private JTextField textField_2;
	
	public PerfilONG() {
		panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PerfilONG.class.getResource("/Interfaz/Logos/LogoUma.png")));
		
		JLabel lblInicio = new JLabel("Inicio");
		lblInicio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblInicio.setForeground(Color.BLUE);
		
		JLabel lblBusqueda = new JLabel("Buscar actividad");
		lblBusqueda.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBusqueda.setForeground(Color.BLUE);
		
		JLabel lblMatches = new JLabel("Matches");
		lblMatches.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMatches.setForeground(Color.BLUE);
		
		JLabel lblMisActividades = new JLabel("Mis actividades");
		lblMisActividades.setForeground(Color.BLUE);
		lblMisActividades.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblValidarActividad = new JLabel("Validar actividad");
		lblValidarActividad.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblValidarActividad.setForeground(Color.BLUE);
		
		JLabel lblCalificarActividad = new JLabel("Calificar actividad");
		lblCalificarActividad.setForeground(Color.BLUE);
		lblCalificarActividad.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNoticias = new JLabel("MI INFORMACI\u00D3N");
		lblNoticias.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNoticias.setForeground(Color.RED);
		
		JLabel lblUsuario_1 = new JLabel("Usuario: ");
		lblUsuario_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblApellidos = new JLabel("Web:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblEdad = new JLabel("Descripci\u00F3n:");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(Color.BLUE);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnGuardar.setForeground(Color.WHITE);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancelar.setBackground(Color.BLUE);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		
		textField.setText(Login.usuario.getID());
		textField_1.setText(Login.usuario.getNombre());
		textField_2.setText(Login.usuario.getWeb());
		textArea.setText(Login.usuario.getDescripcion());
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(56)
							.addComponent(lblNoticias))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMatches)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblInicio, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblBusqueda)
												.addComponent(lblMisActividades)
												.addComponent(lblValidarActividad))
											.addGap(118)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblUsuario_1)
												.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblApellidos)
												.addComponent(lblEdad)))
										.addComponent(lblCalificarActividad))
									.addGap(21)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
										.addComponent(textField_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
										.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
										.addComponent(textField_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))))
							.addGap(140)))
					.addGap(91))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(778, Short.MAX_VALUE)
					.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(101))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
							.addGap(59)
							.addComponent(lblInicio)
							.addGap(30)
							.addComponent(lblBusqueda)
							.addGap(31)
							.addComponent(lblMatches)
							.addGap(33)
							.addComponent(lblMisActividades)
							.addGap(31)
							.addComponent(lblValidarActividad)
							.addGap(30)
							.addComponent(lblCalificarActividad))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(131)
							.addComponent(lblNoticias)
							.addGap(34)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUsuario_1)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEdad, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGuardar)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(30))
		);
		panel.setLayout(gl_panel);
		
		btnGuardar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				
				PerfilONGControlador.guardarPerfil(textField_1.getText(), textField_2.getText(), textArea.getText());
				PerfilONGControlador.goToHome();
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				PerfilUsuarioControlador.goToHome();
			}
		});
	
	}

	public JPanel getWindow() {
		return panel;
	}

	public boolean isCentered() {
		return false;
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window.open(new PerfilONG());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
