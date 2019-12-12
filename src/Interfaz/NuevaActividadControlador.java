package Interfaz;

import java.util.List;

import Implementacion.Actividad;
import Implementacion.Login;

public class NuevaActividadControlador {
	
	public static void guardarActividad(String nombre, String descripcion, int horas, boolean turno, String fecha,boolean validada,
										boolean voluntariado, boolean formacion, boolean investigacion,int proyecto, String id_ong,String profesor,
										int asignatura, String categoria, String subcategoria, String lugar) 
	{
		List<Actividad> lista = Actividad.ListaActividades();
		new Actividad(lista.size(), nombre, descripcion, horas, turno, fecha, validada, voluntariado, formacion, investigacion, proyecto,
					  id_ong, profesor, asignatura, categoria, subcategoria, lugar);
	}
	
}
