package Interfaz;

import java.util.List;

import Implementacion.Actividad;
import Implementacion.Inscripcion;
import Implementacion.Login;
import Implementacion.Usuario;

public class VerActividadControlador {

	public static void inscribir(Usuario u, Actividad a) {
		new Inscripcion(u.getID(), a.getID(), false);
		Window.open(new Matches());
	}

	
}
