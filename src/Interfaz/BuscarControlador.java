package Interfaz;

import java.util.ArrayList;
import java.util.List;

import Implementacion.Actividad;
import Implementacion.Asignatura;
import Implementacion.Categoria;
import Implementacion.Inscripcion;
import Implementacion.Login;
import Implementacion.Subcategoria;
import Implementacion.Usuario;

public class BuscarControlador {
	
	public static List<Actividad> listaActividades() {
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
				if(puedo) {
					lista.add(a);
					System.out.println(a.getNombre());
				}
				
			}
		}
		if(lista.size()==0) {
			System.out.println("Lista vacia de matches para el usuario " + u.getNombre());
		}
		return lista;
	}
	
	public static List<Actividad> listaFiltrada(String categoria, String subcategoria, int asignatura, boolean turno){
		List<Actividad> lista = listaActividades();
		List<Actividad> lista2 = new ArrayList<Actividad>();
		for(Actividad a : lista) {
			if(a.getCategoria().equals(categoria) && a.getsubCategoria().equals(subcategoria) && a.getAsignatura()==asignatura && a.getTurno()==turno) {
				lista2.add(a);
				System.out.println("añadida al filtro: " + a);
			}
		}
		if(lista2.isEmpty()) {
			System.out.println("filtro vacio");
		}
		return lista2;
	}
	
	public static void goToVerActividad(Actividad a) {
		Window.open(new VerActividad(a));
	}

	public static void recargar(List<Actividad> listita) {
		Window.open(new Buscar(listita));
	}
}
