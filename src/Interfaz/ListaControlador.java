package Interfaz;

import java.util.List;

import Implementacion.Actividad;
import Implementacion.Inscripcion;
import Implementacion.Login;
import Implementacion.Usuario;

public class ListaControlador {
	
	public static String[][] generarDatosParaLaTabla(List<Actividad> actividades) {
		String[][] datos = new String[actividades.size()][3];
		for(int i=0; i<actividades.size(); i++) {
			datos[i][0] = actividades.get(i).getNombre();
			datos[i][1] = actividades.get(i).getLugar();
			datos[i][2] = actividades.get(i).getDescripcion();
		}
		return datos;
	}
	
	public static String[][] generarDatosParaLaTabla2(List<Inscripcion> inscripciones) {
		String[][] datos = new String[inscripciones.size()][3];
		int aux = 1;
		for(int i=0; i<inscripciones.size(); i++) {
			Actividad actividad = new Actividad(inscripciones.get(i).getID_Actividad());
			datos[i][0] = actividad.getNombre();
			datos[i][1] = actividad.getid_ong();
			datos[i][2] = "Solicitante " + aux;
			aux += 1;
		}
		return datos;
	}
}
