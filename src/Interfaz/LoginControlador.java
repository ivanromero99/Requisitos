package Interfaz;

import Implementacion.Login;

public class LoginControlador {

	public static boolean iniciarSesionUsuario(String u, String c) {
		System.out.println("Llamada a iniciar sesion");
		if (Login.loginUsuario(u,c)) {
			Window.open(new Home());
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean iniciarSesionONG(String u, String c) {
		System.out.println("Llamada a iniciar sesion");
		if (Login.loginONG(u,c)) {
			Window.open(new Home());
			return true;
		} else {
			return false;
		}
	}
}
