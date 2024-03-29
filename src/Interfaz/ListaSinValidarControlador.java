package Interfaz;

import java.util.ArrayList;
import java.util.List;

import Implementacion.Actividad;
import Implementacion.Inscripcion;
import Implementacion.Login;

public class ListaSinValidarControlador {

	public static void goToValidarActividad(Actividad a) {
		Window.open(new ValidarActividad(a));
	}
	
	public static void goToListaValidadas() {
		Window.open(new ValidarONG());
	}
	
	public static List<Actividad> actividadesSinValidar() {
		List<Actividad> data = new ArrayList<Actividad>();
		for(Actividad a : Actividad.ListaActividades()) {
			if(!a.getValidada()) {
				data.add(a);
			}
		}
		return data;
	}

	
}
