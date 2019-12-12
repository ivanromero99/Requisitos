package Interfaz;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.SwingConstants;

import Implementacion.Actividad;
import Implementacion.BD;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JTable;

public class ListaSinValidar implements OpenableWindow {
	
	private JPanel panel;
	private JTable table;
	
	public ListaSinValidar() {
		panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ListaSinValidar.class.getResource("/Interfaz/Logos/LogoUma.png")));
		
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
		lblValidarActividad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblValidarActividad.setForeground(Color.BLUE);
		
		JLabel lblCalificarActividad = new JLabel("Calificar actividad");
		lblCalificarActividad.setForeground(Color.BLUE);
		lblCalificarActividad.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNoticias = new JLabel("VALIDAR ACTIVIDADES");
		lblNoticias.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNoticias.setForeground(Color.BLACK);
		
		JLabel lblIniciarSesin = new JLabel("Iniciar Sesi\u00F3n");
		lblIniciarSesin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIniciarSesin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIniciarSesin.setForeground(Color.BLACK);
		
		JLabel lblUsuario = new JLabel("usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.setForeground(Color.BLUE);
		btnValidar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnValidar.setBackground(Color.WHITE);
		
		String[] columnNames = {"Nombre", "Lugar", "Descripción"};
		java.util.List<Actividad> actividades;
		actividades = ListaSinValidarControlador.actividadesSinValidar();
		String[][] datos = ListaControlador.generarDatosParaLaTabla(actividades);
		
		table = new JTable(datos, columnNames) {
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
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
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
											.addComponent(btnValidar, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
											.addComponent(table, GroupLayout.PREFERRED_SIZE, 738, GroupLayout.PREFERRED_SIZE))))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblBusqueda)
								.addComponent(lblMatches)
								.addComponent(lblInicio, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMisActividades, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblValidarActividad, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblCalificarActividad, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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
							.addGap(34)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE)))
					.addGap(30)
					.addComponent(btnValidar)
					.addContainerGap(62, Short.MAX_VALUE))
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
				ListaSinValidarControlador.goToValidarActividad(actividades.get(row));
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
					Window.open(new ListaSinValidar());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
