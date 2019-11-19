package Interfaz;

import Implementacion.Login;

public class LoginControlador {

	public static void iniciarSesion(String u, String c) {
		System.out.println("Llamada a iniciar sesion");
		Login.loginUsuario(u,c);
	}
}
