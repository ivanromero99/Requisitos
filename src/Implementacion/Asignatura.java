package Implementacion;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
	
	private static String BD_SERVER = "localhost";
    private static String BD_NAME = "REQUISITOS";
	private String asignatura;
	private int ID;
	
	public static List<Asignatura> ListaAsignaturas()
	{
		// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
		BD miBD = new BD(BD_SERVER,BD_NAME);
		ArrayList<Asignatura> lista = new ArrayList<Asignatura>(); 
					
		for(Object[] tupla: miBD.Select("SELECT ID FROM Asignaturas;"))
		{
			int id = (Integer)tupla[0];
			Asignatura c = new Asignatura(id);
			lista.add(c);
		}
		return lista;
	}
	
	public int getID() {
		return ID;
	}

	public Asignatura(int id) {
		BD miBD = new BD(BD_SERVER,BD_NAME);			
		  
		Object[] tupla = miBD.Select("SELECT * FROM Asignaturas " + "WHERE ID='"+id+ "';").get(0);
		this.ID = (Integer)tupla[0];
		this.asignatura = (String)tupla[1];
	}
	
	public String getNombre() {
		return this.asignatura;
	}

	@Override
	public String toString() {
		return this.asignatura;
	}

	public static int saberID(String nombre) {
		BD miBD = new BD(BD_SERVER,BD_NAME);			
		  
		Object[] tupla = miBD.Select("SELECT ID FROM Asignaturas " + "WHERE Nombre='"+nombre+ "';").get(0);
		return (int)tupla[0];
	}
}
