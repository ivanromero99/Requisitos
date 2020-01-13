package Interfaz;

import java.util.ArrayList;
import java.util.List;

import Implementacion.Actividad;
import Implementacion.Inscripcion;
import Implementacion.Login;

public class ListaValidadaControlador {

	public static void goToValidarActividad(Actividad a) {
		Window.open(new ValidarActividad(a));
	}
	
	public static List<Actividad> actividadesValidadas() {
		List<Actividad> data = new ArrayList<Actividad>();
		for(Actividad a : Actividad.ListaActividades()) {
			if(a.getValidada()) {
				data.add(a);
			}
		}
		return data;
	}
	
	public static List<Inscripcion> incripciones(Actividad a) {
		List<Inscripcion> data = new ArrayList<>();
		for(Inscripcion i : Inscripcion.ListaInscripcionesActividad(a.getID())) {
			if(!i.getConfirmada()) {
				data.add(i);
			}
		}
		return data;
	}

	
}
