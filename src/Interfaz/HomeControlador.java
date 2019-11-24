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
	
}
