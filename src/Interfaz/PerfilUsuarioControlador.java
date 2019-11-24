package Interfaz;

import Implementacion.Login;

public class PerfilUsuarioControlador {

	public static void goToHome() {
		Window.open(new Home());
	}
	
	public static void guardarPerfil(String nombre, String apellidos, int edad, String categoria, String subcategoria, String lugar, boolean turno) {
		Login.usuario.setNombre(nombre);
		Login.usuario.setApellidos(apellidos);
		Login.usuario.setEdad(edad);
		Login.usuario.setTurno(turno);
		Login.usuario.setCategoria(categoria);
		//Login.usuario.setSubCategoria(subcategoria);
		Login.usuario.setLugar(lugar);
	}
	
}
