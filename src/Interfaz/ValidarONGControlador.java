package Interfaz;

import java.util.ArrayList;
import java.util.List;

import Implementacion.Actividad;
import Implementacion.Inscripcion;
import Implementacion.Login;

public class ValidarONGControlador {
	
	public static List<Inscripcion> incripciones(Actividad a) {
		List<Inscripcion> data = new ArrayList<>();
		for(Inscripcion i : Inscripcion.ListaInscripcionesActividad(a.getID())) {
			if(!i.getConfirmada()) {
				data.add(i);
			}
		}
		return data;
	}

	public static void abrir(Inscripcion inscripcion) {
		Window.open(new Solicitud(inscripcion));
		
	}

	
}
