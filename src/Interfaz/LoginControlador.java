package Interfaz;

import Implementacion.Login;

public class LoginControlador {
	
	public static boolean redireccion; //false a Home, true a Mi perfil 

	public static boolean iniciarSesionUsuario(String u, String c) {
		System.out.println("Llamada a iniciar sesion");
		redireccion = false;
		if (Login.loginUsuario(u,c)) {
			if(redireccion) {
				Window.open(new PerfilUsuario());
			} else {
				Window.open(new Home());
			}
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean iniciarSesionONG(String u, String c) {
		System.out.println("Llamada a iniciar sesion");
		redireccion = false;
		if (Login.loginONG(u,c)) {
			if(redireccion) {
				Window.open(new PerfilUsuario());
			} else {
				Window.open(new Home());
			}
			return true;
		} else {
			return false;
		}
	}
}
