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

import Implementacion.Categoria;
import Implementacion.Subcategoria;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class NuevaActividad implements OpenableWindow {
	
    private String nombre;
    private String descripcion;
    private int horas;
    private boolean turno;
    private String fecha;
    private boolean validada;
    private boolean voluntariado;
    private boolean formacion;
    private boolean investigacion;
    private int proyecto;
    private String id_ong;
    private String profesor;
    private int asignatura;
    private String categoria;
    private String subcategoria;
    private String lugar;
	
	private JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
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
		
		JLabel lblProyecto = new JLabel("Subcategoria:");
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
		
		JRadioButton rdbtnVoluntariado = new JRadioButton("Aprendizaje-Servicio");
		rdbtnVoluntariado.setForeground(Color.BLACK);
		rdbtnVoluntariado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnFormacin = new JRadioButton("Voluntariado");
		rdbtnFormacin.setForeground(Color.BLACK);
		rdbtnFormacin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnInvestigacin = new JRadioButton("Investigaci\u00F3n");
		rdbtnInvestigacin.setForeground(Color.BLACK);
		rdbtnInvestigacin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnTarde);
		group.add(rdbtnMaana);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rdbtnInvestigacin);
		group2.add(rdbtnFormacin);
		group2.add(rdbtnVoluntariado);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
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
		textField_2.setToolTipText("");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		
		for(Categoria c : Categoria.ListaCategorias()) {
			comboBox.addItem(c.getNombre());
		}
		
		for(Subcategoria s : Subcategoria.ListaSubcategorias()) {
			comboBox_1.addItem(s.getNombre());
		}
		
		JLabel lblFechaEnFormato = new JLabel("Fecha en formato: AAAA-MM-DD");
		lblFechaEnFormato.setForeground(Color.RED);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(56)
							.addComponent(lblNoticias)
							.addContainerGap(480, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
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
											.addGap(478)
											.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(btnNewButton)
											.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNombre)
												.addComponent(lblCategoria, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblDescripcion, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblProyecto, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
														.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(textField, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
													.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))
												.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblFechaEnFormato, Alignment.LEADING))
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
													.addComponent(lblLugar, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel.createSequentialGroup()
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
										.addComponent(textArea, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblValidarActividad)
									.addPreferredGap(ComponentPlacement.RELATED, 893, Short.MAX_VALUE))
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
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
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
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblFechaEnFormato)
							.addGap(1)
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
							.addGap(19)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
					.addGap(34)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		btnEnviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				
				nombre = textField.getText();
				descripcion = textArea.getText();
				horas = Integer.parseInt(textField_1.getText());
				if(rdbtnTarde.isSelected()) {
					turno = true;
				}
				if(rdbtnMaana.isSelected()) {
					turno = false;
				}
				fecha = textField_2.getText();
				validada = false;
				if(rdbtnVoluntariado.isSelected()) {
					voluntariado = true;
				} else {
					voluntariado = false;
				}
				if(rdbtnFormacin.isSelected()) {
					formacion = true;
				} else {
					formacion = false;
				}
				if(rdbtnInvestigacin.isSelected()) {
					investigacion = true;
				} else {
					investigacion = false;
				}
				proyecto = 0;
				id_ong = Implementacion.Login.usuario.getID();
				profesor = null;
				asignatura = 0;
				categoria = comboBox.getSelectedItem().toString();
				subcategoria = comboBox_1.getSelectedItem().toString(); 
				lugar = textField_3.getText();
				
				NuevaActividadControlador.guardarActividad(nombre, descripcion, horas, turno, fecha, validada, voluntariado, formacion, 
														   investigacion, proyecto, id_ong, profesor, asignatura, categoria, subcategoria, lugar);
				NuevaActividadControlador.goToMisActividades();
			}
		});
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				NuevaActividadControlador.goToMisActividades();
			}
		});
		
		lblUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				HomeControlador.goToPerfil();
			}
		});
		
		if(Implementacion.Login.usuario == null) {
			lblUsuario.setVisible(false);
			lblIniciarSesin.setVisible(true);
		} else {
			lblIniciarSesin.setVisible(false);
			lblUsuario.setVisible(true);
			lblUsuario.setText(Implementacion.Login.usuario.getID());
		}
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
