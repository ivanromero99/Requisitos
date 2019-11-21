package Interfaz;

import Implementacion.Login;

public class LoginControlador {

	public static boolean iniciarSesion(String u, String c) {
		System.out.println("Llamada a iniciar sesion");
		if (Login.login(u,c)) {
			Window.open(new Home());
			return true;
		} else {
			return false;
		}
	}
}
