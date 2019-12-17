package Interfaz;

import java.util.ArrayList;
import java.util.List;

import Implementacion.Actividad;
import Implementacion.Inscripcion;
import Implementacion.Login;
import Implementacion.Usuario;

public class MatchesControlador {
	
	public static List<Actividad> listaMatches() {
		Usuario u = Login.usuario;
		List<Actividad> lista = new ArrayList<>();
		for(Actividad a : Actividad.ListaActividades()){
			boolean puedo=true;
			for(Inscripcion inscripcion : Inscripcion.ListaInscripcionesUsuario(u.getID())){
				if(inscripcion.getID_Actividad() == a.getID()) {
					puedo=false;
					System.out.println("No vas a poder");
				}
			}
			if(a.getValidada()) {
				if(a.getTurno()==u.getTurno() && (a.getCategoria().equals(u.getCategoria().getNombre()) || a.getsubCategoria().equals(u.getSubcategoria().getNombre()))) {
					System.out.println("Paso por aqui");
					if(puedo) {
						lista.add(a);
						System.out.println(a.getNombre());
					}
				}
			}
		}
		if(lista.size()==0) {
			System.out.println("Lista vacia de matches para el usuario " + u.getNombre());
		}
		return lista;
	}
	
	public static void goToVerActividad(Actividad a) {
		Window.open(new VerActividad(a));
	}

	
}
