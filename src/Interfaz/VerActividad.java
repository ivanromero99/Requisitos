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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;

import org.json.JSONException;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import Implementacion.Actividad;
import Implementacion.Asignatura;
import Implementacion.Categoria;
import Implementacion.Proyecto;
import Implementacion.Subcategoria;
import Implementacion.parteJSON;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class VerActividad implements OpenableWindow {
	
	private JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;
	private Actividad actividad;
	private JTextField textField_5;
	private JTextField textField_6;
	
	public VerActividad(Actividad a) {
		panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		actividad = a;
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VerActividad.class.getResource("/Interfaz/Logos/LogoUma.png")));
		
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
		
		JLabel lblNoticias = new JLabel("ACTIVIDAD");
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
		
		JLabel lblFecha = new JLabel("Proyecto:");
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
		
		JRadioButton rdbtnFormacin = new JRadioButton("Aprendizaje-Servicio");
		rdbtnFormacin.setForeground(Color.BLACK);
		rdbtnFormacin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnInvestigacin = new JRadioButton("Investigaci\u00F3n");
		rdbtnInvestigacin.setForeground(Color.BLACK);
		rdbtnInvestigacin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnTarde);
		group.add(rdbtnMaana);
		rdbtnTarde.setEnabled(false);
		rdbtnMaana.setEnabled(false);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rdbtnInvestigacin);
		group2.add(rdbtnFormacin);
		group2.add(rdbtnVoluntariado);
		
		if(!a.getTurno()) {
			rdbtnMaana.setSelected(true);
		} else {
			rdbtnTarde.setSelected(true);
		}
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setText(a.getNombre());
		textField.setEditable(false);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setText(Integer.toString(a.getHoras()));
		textField_1.setEditable(false);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setForeground(Color.BLACK);
		lblTurno.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnNewButton = new JButton("VOLVER");
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setForeground(Color.WHITE);
		
		JButton btnValidar = new JButton("PARTICIPAR");
		btnValidar.setForeground(Color.WHITE);
		btnValidar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnValidar.setBackground(Color.BLUE);
		if(Implementacion.Login.usuario.getRol().getNombre().equalsIgnoreCase("ong")) {
			btnValidar.setVisible(false);
		}
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setText(a.getLugar());
		textField_3.setEditable(false);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setText(a.getDescripcion());
		textArea.setEditable(false);
		
		JLabel lblNewLabel_1 = new JLabel("La inscripci\u00F3n no puede realizarse debido a que no cursa la asignatura");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setVisible(false);
		
		JLabel lblAsignatura = new JLabel("Asignatura:");
		lblAsignatura.setForeground(Color.BLACK);
		lblAsignatura.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setText(a.getCategoria());
		textField_2.setEditable(false);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setText(a.getsubCategoria());
		textField_4.setEditable(false);
		
		textField_5 = new JTextField();
		textField_5.setText((String) null);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		Proyecto p = new Proyecto(a.getProyecto());
		textField_5.setText(p.getNombre());
		
		textField_6 = new JTextField();
		textField_6.setText((String) null);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		Asignatura asig = new Asignatura(a.getAsignatura());
		textField_6.setText(asig.getNombre());
		
		if(a.getFormacion()) {
			rdbtnFormacin.setSelected(true);
		}
		
		if(a.getVoluntariado()) {
			rdbtnVoluntariado.setSelected(true);
		}
		
		if(a.getInvestigacion()) {
			rdbtnInvestigacin.setSelected(true);
		}
		
		if(Implementacion.Login.usuario!=null) {
			if(Implementacion.Login.usuario.getRol().getMat()) {
				lblMatches.setEnabled(true);
			} else {
				lblMatches.setEnabled(false);
			}
			
			if(Implementacion.Login.usuario.getRol().getValid()) {
				lblValidarActividad.setEnabled(true);
			} else {
				lblValidarActividad.setEnabled(false);
			}
			
			if(Implementacion.Login.usuario.getRol().getCalif()) {
				lblCalificarActividad.setEnabled(true);
			} else {
				lblCalificarActividad.setEnabled(false);
			}
		} else {
			lblCalificarActividad.setEnabled(false);
			lblValidarActividad.setEnabled(false);
			lblMatches.setEnabled(false);
			lblMisActividades.setEnabled(false);
			lblBusqueda.setEnabled(false);
		}
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(56)
							.addComponent(lblNoticias)
							.addContainerGap(632, Short.MAX_VALUE))
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
								.addComponent(lblMisActividades)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblInicio, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblBusqueda)
										.addComponent(lblMatches)
										.addComponent(lblValidarActividad))
									.addGap(113)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(12)
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
											.addComponent(btnValidar)
											.addGap(18)
											.addComponent(btnNewButton))
										.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
												.addGroup(gl_panel.createSequentialGroup()
													.addComponent(lblAsignatura, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel.createSequentialGroup()
													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNombre)
														.addComponent(lblCategoria, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblProyecto, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
													.addGap(18)
													.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
															.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
															.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
																.addComponent(textField, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
																.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)))
														.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))))
											.addPreferredGap(ComponentPlacement.RELATED)
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
										.addComponent(lblDescripcion, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))))
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
								.addComponent(lblHoras, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblProyecto, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTurno, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnMaana)
								.addComponent(rdbtnTarde)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(29)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(rdbtnInvestigacin)
										.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addComponent(rdbtnFormacin)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnVoluntariado)))
							.addGap(1)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAsignatura, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addComponent(lblDescripcion, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
					.addGap(34)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton)
							.addComponent(btnValidar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				HomeControlador.goToHome();
			}
		});
		
		btnValidar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				boolean puedo = true;
				Asignatura aux = new Asignatura(a.getAsignatura());
				List<String> lista = new ArrayList<>();
				try {
					lista = parteJSON.getAsignaturasDadoUsuario(Implementacion.Login.usuario.getID(), Implementacion.Login.usuario.getPass());
				} catch (JSONException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(a.getFormacion()) {
					for(String asignatura : lista) {
						if(!asignatura.equals(aux.getNombre())){
							puedo = false;;
						}
					}
				}
				
				if(puedo) {
					VerActividadControlador.inscribir(Implementacion.Login.usuario, a);
				} else {
					lblNewLabel_1.setVisible(true);
				}
			}
		});
		
		lblUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				HomeControlador.goToPerfil();
			}
		});
		
		lblMisActividades.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				HomeControlador.goToMisActividades();
			}
		});
		
		lblMatches.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				HomeControlador.goToMatches();
			}
		});
		
		lblValidarActividad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				HomeControlador.goToValidarActividad();
			}
		});
		
		lblBusqueda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				HomeControlador.goToBusqueda();
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
					Window.open(new VerActividad(null));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
