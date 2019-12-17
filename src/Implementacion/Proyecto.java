package Implementacion;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
	
	private static String BD_SERVER = "localhost";
    private static String BD_NAME = "REQUISITOS";
	private String proyecto;
	private int ID;
	
	public static List<Proyecto> ListaProyectos()
	{
		// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
		BD miBD = new BD(BD_SERVER,BD_NAME);
		ArrayList<Proyecto> lista = new ArrayList<Proyecto>(); 
					
		for(Object[] tupla: miBD.Select("SELECT ID FROM Proyectos;"))
		{
			int id = (int)tupla[0];
			Proyecto c = new Proyecto(id);
			lista.add(c);
		}
		return lista;
	}
	
	@Override
	public String toString() {
		return this.proyecto;
	}

	public Proyecto(int id) {
		BD miBD = new BD(BD_SERVER,BD_NAME);			
		  
		Object[] tupla = miBD.Select("SELECT * FROM Proyectos " + "WHERE ID="+id+ ";").get(0);
		this.ID = (Integer)tupla[0];
		this.proyecto = (String)tupla[1];
	}
	
	public String getNombre() {
		return this.proyecto;
	}

	public int getID() {
		return this.ID;
	}
	
	public static int saberID(String nombre) {
		BD miBD = new BD(BD_SERVER,BD_NAME);			
		  
		Object[] tupla = miBD.Select("SELECT ID FROM Proyectos " + "WHERE Nombre='"+nombre+ "';").get(0);
		return (int)tupla[0];
	}
}
