package Interfaz;

import Implementacion.Actividad;
import Implementacion.Inscripcion;

public class SolicitudControlador {
	
	public static void confirmar(Inscripcion i) {
		i.setConfirmada(true);
		Window.open(new ValidarONG());
	}
	
	public static void denegar(Inscripcion i) {
		i.delete();
		Window.open(new ValidarONG());
	}

}
