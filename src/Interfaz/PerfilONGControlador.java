package Interfaz;

import Implementacion.Login;

public class PerfilONGControlador {
	
	public static void guardarPerfil(String nombre, String web, String descripcion) {
		Login.usuario.setNombre(nombre);
		Login.usuario.setWeb(web);
		Login.usuario.setDescripcion(descripcion);
	}
	
}
