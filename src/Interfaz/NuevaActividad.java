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
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JComboBox;

public class NuevaActividad implements OpenableWindow {
	
	private JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public NuevaActividad() {
		panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(NuevaActividad.class.getResource("/Interfaz/Logos/LogoUma.png")));
		
		JLabel lblInicio = new JLabel("Inicio");
		lblInicio.setFont(new Font("Tahoma", Font.BOLD, 18));
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
		
		JLabel lblNoticias = new JLabel("NUEVA ACTIVIDAD");
		lblNoticias.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNoticias.setForeground(Color.BLACK);
		
		JLabel lblIniciarSesin = new JLabel("Iniciar Sesi\u00F3n");
		lblIniciarSesin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIniciarSesin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIniciarSesin.setForeground(Color.BLACK);
		
		JLabel lblUsuario = new JLabel("usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombre.setForeground(Color.BLACK);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setForeground(Color.BLACK);
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblProyecto = new JLabel("Proyecto:");
		lblProyecto.setForeground(Color.BLACK);
		lblProyecto.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setForeground(Color.BLACK);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setForeground(Color.BLACK);
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblLugar = new JLabel("Lugar:");
		lblLugar.setForeground(Color.BLACK);
		lblLugar.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblHoras = new JLabel("Horas:");
		lblHoras.setForeground(Color.BLACK);
		lblHoras.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(Color.BLACK);
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JRadioButton rdbtnMaana = new JRadioButton("Ma\u00F1ana");
		rdbtnMaana.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnMaana.setForeground(Color.BLACK);
		
		JRadioButton rdbtnTarde = new JRadioButton("Tarde");
		rdbtnTarde.setForeground(Color.BLACK);
		rdbtnTarde.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnVoluntariado = new JRadioButton("Voluntariado");
		rdbtnVoluntariado.setForeground(Color.BLACK);
		rdbtnVoluntariado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnFormacin = new JRadioButton("Formaci\u00F3n");
		rdbtnFormacin.setForeground(Color.BLACK);
		rdbtnFormacin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnInvestigacin = new JRadioButton("Investigaci\u00F3n");
		rdbtnInvestigacin.setForeground(Color.BLACK);
		rdbtnInvestigacin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setForeground(Color.BLACK);
		lblTurno.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setForeground(Color.WHITE);
		
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEnviar.setBackground(Color.BLUE);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(56)
							.addComponent(lblNoticias)
							.addContainerGap(480, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGap(635)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIniciarSesin, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
							.addGap(86))))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblInicio, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblBusqueda)
										.addComponent(lblMatches))
									.addGap(114)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNombre)
												.addComponent(lblProyecto, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCategoria, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblDescripcion, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
											.addGap(27)
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
														.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(textField, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
													.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))
												.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
													.addComponent(lblLugar, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
												.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(lblTurno, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblHoras, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(rdbtnFormacin)
														.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(rdbtnMaana)
														.addComponent(rdbtnVoluntariado))
													.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(rdbtnTarde, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
														.addComponent(rdbtnInvestigacin, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)))))
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_panel.createSequentialGroup()
													.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
													.addGap(18)
													.addComponent(btnNewButton))
												.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 754, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED))))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblValidarActividad)
									.addPreferredGap(ComponentPlacement.RELATED, 871, Short.MAX_VALUE))
								.addComponent(lblMisActividades))
							.addGap(159))
						.addComponent(lblCalificarActividad, Alignment.LEADING)))
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
							.addGap(34)
							.addComponent(lblCalificarActividad))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(21)
							.addComponent(lblIniciarSesin)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblUsuario)
							.addGap(69)
							.addComponent(lblNoticias)
							.addGap(37)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombre)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblLugar, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(29)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCategoria, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblHoras, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblProyecto, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTurno, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnMaana)
								.addComponent(rdbtnTarde))
							.addGap(29)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addGap(28)
									.addComponent(lblDescripcion, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(rdbtnInvestigacin)
										.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addComponent(rdbtnFormacin)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnVoluntariado)))
							.addGap(28)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
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
					Window.open(new NuevaActividad());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
