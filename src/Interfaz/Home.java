package Interfaz;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import Implementacion.Noticia;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Home implements OpenableWindow {
	
	private JPanel panel;
	
	public Home() {
		panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/Interfaz/Logos/LogoUma.png")));
		
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
		
		JLabel lblNoticias = new JLabel("NOTICIAS");
		lblNoticias.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNoticias.setForeground(Color.BLACK);
		
		JLabel lblIniciarSesin = new JLabel("Iniciar Sesi\u00F3n");
		lblIniciarSesin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIniciarSesin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIniciarSesin.setForeground(Color.BLUE);
		
		JLabel lblUsuario = new JLabel("usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblCerrarSesin = new JLabel("Cerrar Sesi\u00F3n");
		lblCerrarSesin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCerrarSesin.setForeground(Color.RED);
		lblCerrarSesin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnAadirNoticia = new JButton("A\u00F1adir noticia");
		btnAadirNoticia.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAadirNoticia.setForeground(Color.WHITE);
		btnAadirNoticia.setBackground(Color.BLUE);
		btnAadirNoticia.setVisible(false);
		
		JLabel lblGestin = new JLabel("Gesti\u00F3n");
		lblGestin.setForeground(Color.BLUE);
		lblGestin.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		List<Noticia> lista = Noticia.DosNoticias();
		Noticia noticia1 = lista.get(0);
		Noticia noticia2 = lista.get(1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setText(noticia1.getTitulo());
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.BOLD, 15));
		textArea.setBackground(UIManager.getColor("Button.background"));
		textArea.setText(noticia1.getContenido());
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setText(noticia2.getTitulo());
		textArea.setEditable(false);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textArea_1.setBackground(SystemColor.menu);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setText(noticia2.getContenido());
		textArea_1.setEditable(false);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel_2.setText(noticia1.getAutor());
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		label_1.setText(noticia2.getAutor());
		
		lblMisActividades.setEnabled(true);
		lblBusqueda.setEnabled(true);
		
		if(Implementacion.Login.usuario != null) {
			if(!Implementacion.Login.usuario.getRol().getNombre().equalsIgnoreCase("Gestor")) {
				lblGestin.setEnabled(false);
			} else {
				lblGestin.setEnabled(true);
				btnAadirNoticia.setVisible(true);
			}
		} else {
			lblGestin.setEnabled(false);
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
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(56)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 791, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNoticias)
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE)
									.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 791, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(72, Short.MAX_VALUE))
							.addGroup(gl_panel.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_panel.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblIniciarSesin, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblCerrarSesin, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblMatches)
							.addPreferredGap(ComponentPlacement.RELATED, 629, Short.MAX_VALUE)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
							.addGap(139))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblGestin, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 533, Short.MAX_VALUE)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
							.addGap(129))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblBusqueda)
								.addComponent(lblMisActividades)
								.addComponent(lblValidarActividad)
								.addComponent(lblCalificarActividad)
								.addComponent(lblInicio, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(957, Short.MAX_VALUE))))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(813, Short.MAX_VALUE)
					.addComponent(btnAadirNoticia)
					.addGap(226))
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
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblCerrarSesin, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(45)
							.addComponent(lblNoticias)
							.addGap(37)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2)
							.addGap(48)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(28)
							.addComponent(lblGestin, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(label_1)))
					.addGap(13)
					.addComponent(btnAadirNoticia)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		if(Implementacion.Login.usuario == null) {
			lblUsuario.setVisible(false);
			lblCerrarSesin.setVisible(false);
			lblIniciarSesin.setVisible(true);
		} else {
			lblIniciarSesin.setVisible(false);
			lblUsuario.setVisible(true);
			lblCerrarSesin.setVisible(true);
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
		
		lblCerrarSesin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				HomeControlador.goToHomeCerrarSesion();
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
		
		lblGestin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				HomeControlador.goToGestionar(7);
			}
		});
		
		lblBusqueda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				HomeControlador.goToBusqueda();
			}
		});
		
		btnAadirNoticia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				HomeControlador.goToNuevaNoticia();
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
					Window.open(new Home());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
