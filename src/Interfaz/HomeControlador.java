package Interfaz;

import Implementacion.Login;

public class HomeControlador {

	public static void goToLogin() {
		Window.open(new Interfaz.Login());
	}
	
	public static void goToPerfil() {
		if(!Login.usuario.getRol().getNombre().equals("ONG")){
			Window.open(new PerfilUsuario());
		} else {
			Window.open(new PerfilONG());
		}
	}
	
	public static void goToMisActividades() {
		Window.open(new MisActividades());
	}
	
	public static void goToHome() {
		Implementacion.Login.usuario = null;
		Window.open(new Home());
	}
	
}
