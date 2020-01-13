package Interfaz;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.SwingConstants;

import Implementacion.Actividad;
import Implementacion.Asignatura;
import Implementacion.BD;
import Implementacion.Categoria;
import Implementacion.Subcategoria;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class Buscar implements OpenableWindow {
	
	private JPanel panel;
	private JTable table;
	
	public Buscar(List<Actividad> miLista) {
		panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Buscar.class.getResource("/Interfaz/Logos/LogoUma.png")));
		
		JLabel lblCargandoEspereUn = new JLabel("Cargando, espere un momento");
		lblCargandoEspereUn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCargandoEspereUn.setForeground(Color.RED);
		lblCargandoEspereUn.setVisible(true);
		
		JLabel lblInicio = new JLabel("Inicio");
		lblInicio.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblInicio.setForeground(Color.BLUE);
		
		JLabel lblBusqueda = new JLabel("Buscar actividad");
		lblBusqueda.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
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
		
		JLabel lblNoticias = new JLabel("B\u00DASQUEDA");
		lblNoticias.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNoticias.setForeground(Color.BLACK);
		
		JLabel lblIniciarSesin = new JLabel("Iniciar Sesi\u00F3n");
		lblIniciarSesin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIniciarSesin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIniciarSesin.setForeground(Color.BLACK);
		
		JLabel lblUsuario = new JLabel("usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnValidar = new JButton("Ver Actividad");
		btnValidar.setForeground(Color.BLUE);
		btnValidar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnValidar.setBackground(Color.WHITE);
		
		String[] columnNames = {"Nombre", "Lugar", "Descripción"};
		java.util.List<Actividad> actividades;
		actividades = BuscarControlador.listaActividades();
		String[][] datos;
		
		if(miLista==null) {
			datos = ListaControlador.generarDatosParaLaTabla(actividades);
		} else {
			datos = ListaControlador.generarDatosParaLaTabla(miLista);
		}
		
		
		table = new JTable(datos, columnNames) {
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.setShowGrid(false);
		table.setBackground(UIManager.getColor("Button.background"));
		
		JLabel lblFiltrarActividades = new JLabel("Filtrar actividades:");
		lblFiltrarActividades.setForeground(Color.BLACK);
		lblFiltrarActividades.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		for(Categoria as : Categoria.ListaCategorias()) {
			comboBox.addItem(as);
		}
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		for(Subcategoria as : Subcategoria.ListaSubcategorias()) {
			comboBox_1.addItem(as);
		}
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		for(Asignatura as : Asignatura.ListaAsignaturas()) {
			comboBox_2.addItem(as);
		}
		
		JRadioButton rdbtnTurnoDeTarde = new JRadioButton("Turno de Tarde");
		
		JRadioButton rdbtnTurnoDeMaana = new JRadioButton("Turno de Ma\u00F1ana");
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnTurnoDeTarde);
		group.add(rdbtnTurnoDeMaana);
		
		JLabel lblCategora = new JLabel("Categor\u00EDa");
		lblCategora.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblSubcategora = new JLabel("Subcategor\u00EDa");
		lblSubcategora.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblAsignatura = new JLabel("Asignatura");
		lblAsignatura.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(Color.BLUE);
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBuscar.setBackground(Color.WHITE);
		
		lblCargandoEspereUn.setVisible(false);
		
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
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(631)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblIniciarSesin, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(56)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNoticias)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblFiltrarActividades, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(rdbtnTurnoDeMaana, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(rdbtnTurnoDeTarde)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblCargandoEspereUn))
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
											.addComponent(btnValidar, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
											.addComponent(table, GroupLayout.PREFERRED_SIZE, 738, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCategora))
											.addGap(18)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblSubcategora, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
													.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
													.addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addGap(121))
												.addGroup(gl_panel.createSequentialGroup()
													.addComponent(lblAsignatura, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, 333, Short.MAX_VALUE))))))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMatches)
								.addComponent(lblInicio, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMisActividades, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblValidarActividad, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblCalificarActividad, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(lblBusqueda, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(28, Short.MAX_VALUE))
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
							.addGap(21)
							.addComponent(lblIniciarSesin)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblUsuario)
							.addGap(69)
							.addComponent(lblNoticias)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFiltrarActividades, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnTurnoDeMaana)
								.addComponent(rdbtnTurnoDeTarde)
								.addComponent(lblCargandoEspereUn))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCategora)
								.addComponent(lblSubcategora, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAsignatura, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBuscar))
							.addGap(23)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)))
					.addGap(30)
					.addComponent(btnValidar)
					.addContainerGap(57, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		if(Implementacion.Login.usuario == null) {
			lblUsuario.setVisible(false);
			lblIniciarSesin.setVisible(true);
		} else {
			lblIniciarSesin.setVisible(false);
			lblUsuario.setVisible(true);
			lblUsuario.setText(Implementacion.Login.usuario.getID());
		}
		
		lblIniciarSesin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				HomeControlador.goToLogin();
			}
		});
		
		lblUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				HomeControlador.goToPerfil();
			}
		});
		
		lblInicio.addMouseListener(new MouseAdapter() {
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
				int row = table.getSelectedRow();
				BuscarControlador.goToVerActividad(actividades.get(row));
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
		
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				boolean turno = false;
				if(rdbtnTurnoDeTarde.isSelected()) {
					turno = true;
				}
				if(rdbtnTurnoDeMaana.isSelected()) {
					turno = false;
				}
				List<Actividad> listita = BuscarControlador.listaFiltrada(comboBox.getSelectedItem().toString(), comboBox_1.getSelectedItem().toString(), Asignatura.saberID(comboBox_2.getSelectedItem().toString()), turno);
				BuscarControlador.recargar(listita);
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
					Window.open(new Buscar(null));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
