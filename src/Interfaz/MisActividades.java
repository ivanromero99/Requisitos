package Interfaz;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

import Implementacion.Actividad;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JList;

public class MisActividades implements OpenableWindow {
	
	private JPanel panel;
	
	public MisActividades() {
		panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MisActividades.class.getResource("/Interfaz/Logos/LogoUma.png")));
		
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
		lblMisActividades.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblValidarActividad = new JLabel("Validar actividad");
		lblValidarActividad.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblValidarActividad.setForeground(Color.BLUE);
		
		JLabel lblCalificarActividad = new JLabel("Calificar actividad");
		lblCalificarActividad.setForeground(Color.BLUE);
		lblCalificarActividad.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNoticias = new JLabel("MIS ACTIVIDADES");
		lblNoticias.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNoticias.setForeground(Color.BLACK);
		
		JLabel lblIniciarSesin = new JLabel("Iniciar Sesi\u00F3n");
		lblIniciarSesin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIniciarSesin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIniciarSesin.setForeground(Color.BLACK);
		
		JLabel lblUsuario = new JLabel("usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JList list = new JList();
		DefaultListModel modelo = new DefaultListModel();
		
		JButton btnCrearActividad = new JButton("Crear Actividad");
		btnCrearActividad.setBackground(Color.WHITE);
		btnCrearActividad.setForeground(Color.BLUE);
		btnCrearActividad.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setForeground(Color.BLUE);
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBorrar.setBackground(Color.WHITE);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setForeground(Color.BLUE);
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEditar.setBackground(Color.WHITE);
		
		for(Actividad a : Actividad.ListaActividades()) {
			if(a.getid_ong().equals(Implementacion.Login.usuario.getID())) {
				modelo.addElement(a.getNombre());
			}
		}
		list.setModel(modelo);
		
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
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(list, GroupLayout.PREFERRED_SIZE, 706, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNoticias)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btnCrearActividad, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBorrar, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblBusqueda)
								.addComponent(lblMatches)
								.addComponent(lblInicio, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblValidarActividad)
								.addComponent(lblCalificarActividad)
								.addComponent(lblMisActividades, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))))
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
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNoticias)
									.addGap(36))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(btnCrearActividad, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addGap(18)))
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBorrar)
						.addComponent(btnEditar))
					.addContainerGap(63, Short.MAX_VALUE))
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
				MisActividadesControlador.goToHome();
			}
		});
		
		btnCrearActividad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				MisActividadesControlador.goToNuevaActividad();
			}
		});
		
		if(!Implementacion.Login.usuario.getRol().getNombre().equals("ONG")) {
			btnCrearActividad.setEnabled(false);;
		}
		
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
					Window.open(new MisActividades());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
