package Interfaz;

import Implementacion.Login;

public class MisActividadesControlador {

	public static void goToLogin() {
		Window.open(new Interfaz.Login());
	}
	
	public static void goToNuevaActividad() {
		Window.open(new NuevaActividad());
	}
	
	public static void goToPerfil() {
		if(!Login.usuario.getRol().getNombre().equals("ONG")){
			Window.open(new PerfilUsuario());
		} else {
			Window.open(new PerfilONG());
		}
	}
	
	public static void goToHome() {
		Window.open(new Home());
	}
	
}