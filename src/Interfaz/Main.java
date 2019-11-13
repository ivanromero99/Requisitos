package Interfaz;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window.open(new Login());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
