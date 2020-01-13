package Interfaz;

import java.util.List;

import Implementacion.Actividad;
import Implementacion.Login;
import Implementacion.Noticia;

public class NuevaNoticiaControlador {
	
	public static void añadirNoticia(String a, String b, String c) {
		new Noticia(a,b,c);
	}
	
}
