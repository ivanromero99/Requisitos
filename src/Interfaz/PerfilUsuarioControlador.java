package Interfaz;

import Implementacion.Login;
import Implementacion.Categoria;
import Implementacion.Subcategoria;

public class PerfilUsuarioControlador {
	
	public static void guardarPerfil(String nombre, String apellidos, String edad, Categoria categoria, Subcategoria subcategoria, boolean turno) {
		Login.usuario.setNombre(nombre);
		Login.usuario.setApellidos(apellidos);
		Login.usuario.setEdad(edad);
		Login.usuario.setCategoria(categoria.getNombre());
		Login.usuario.setSubcategoria(subcategoria.getNombre());
		Login.usuario.setTurno(turno);
	}
	
}
