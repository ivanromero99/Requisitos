package Interfaz;

import Implementacion.Login;

public class LoginControlador {

	public static void iniciarSesion(String u, String c) {
		Login.loginUsuario(u,c);
	}
}
