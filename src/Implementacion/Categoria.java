package Implementacion;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	
	private static String BD_SERVER = "localhost";
    private static String BD_NAME = "REQUISITOS";
	private String categoria;
	
	public static List<Categoria> ListaCategorias()
	{
		// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
		BD miBD = new BD(BD_SERVER,BD_NAME);
		ArrayList<Categoria> lista = new ArrayList<Categoria>(); 
					
		for(Object[] tupla: miBD.Select("SELECT Categoria FROM Categorias;"))
		{
			String id = (String)tupla[0];
			Categoria c = new Categoria(id);
			lista.add(c);
		}
		return lista;
	}
	
	public Categoria(String id) {
		BD miBD = new BD(BD_SERVER,BD_NAME);			
		  
		Object[] tupla = miBD.Select("SELECT * FROM Categorias " + "WHERE Categoria='"+id+ "';").get(0);
		this.categoria = (String)tupla[0];
	}
	
	public String getNombre() {
		return this.categoria;
	}

}
