package Interfaz;

import java.util.List;

import Implementacion.Actividad;
import Implementacion.Login;

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
	
}
