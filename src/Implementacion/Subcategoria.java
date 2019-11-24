package Implementacion;

import java.util.ArrayList;
import java.util.List;

public class Subcategoria {
	
	private static String BD_SERVER = "localhost";
    private static String BD_NAME = "REQUISITOS";
	private String subcategoria;

	public static List<Subcategoria> ListaSubcategorias()
	{
		// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
		BD miBD = new BD(BD_SERVER,BD_NAME);
		ArrayList<Subcategoria> lista = new ArrayList<Subcategoria>(); 
					
		for(Object[] tupla: miBD.Select("SELECT Subcategoria FROM Subcategorias;"))
		{
			String id = (String)tupla[0];
			Subcategoria s = new Subcategoria(id);
			lista.add(s);
		}
		return lista;
	}
	
	public Subcategoria(String id) {
		BD miBD = new BD(BD_SERVER,BD_NAME);			
		  
		Object[] tupla = miBD.Select("SELECT * FROM Subcategorias WHERE Subcategoria='"+id+ "';").get(0);
		this.subcategoria = (String)tupla[0];
	}
	
	public String getNombre() {
		return this.subcategoria;
	}
}
