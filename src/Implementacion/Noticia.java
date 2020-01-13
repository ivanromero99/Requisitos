package Implementacion;

import java.util.ArrayList;
import java.util.List;

public class Noticia {
	
	private static String BD_SERVER = "localhost";
    private static String BD_NAME = "REQUISITOS";
	private String titulo, autor, contenido;
	
	public static List<Noticia> ListaNoticias()
	{
		// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
		BD miBD = new BD(BD_SERVER,BD_NAME);
		ArrayList<Noticia> lista = new ArrayList<Noticia>(); 
					
		for(Object[] tupla: miBD.Select("SELECT Titulo FROM Noticia;"))
		{
			String id = (String)tupla[0];
			Noticia s = new Noticia(id);
			lista.add(s);
		}
		return lista;
	}
	
	public static List<Noticia> DosNoticias()
	{
		// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
		BD miBD = new BD(BD_SERVER,BD_NAME);
		ArrayList<Noticia> lista = new ArrayList<Noticia>();
		ArrayList<Noticia> lista2 = new ArrayList<Noticia>();
					
		for(Object[] tupla: miBD.Select("SELECT Titulo FROM Noticias;"))
		{
			String id = (String)tupla[0];
			Noticia s = new Noticia(id);
			lista.add(s);
		}
		lista2.add(lista.get(lista.size()-1));
		lista2.add(lista.get(lista.size()-2));
		return lista2;
	}
	
	public Noticia(String id) {
		BD miBD = new BD(BD_SERVER,BD_NAME);			
		  
		Object[] tupla = miBD.Select("SELECT * FROM Noticias WHERE Titulo='"+id+ "';").get(0);
		this.titulo = (String)tupla[0];
		this.autor = (String)tupla[1];
		this.contenido = (String)tupla[2];
	}
	
	public Noticia(String titulo, String autor, String contenido) {
		BD miBD = new BD(BD_SERVER,BD_NAME);			
		  
		miBD.Insert("INSERT INTO Noticias VALUES('" + titulo + "','" + autor + "','" + contenido + "',NULL)");
		this.titulo = titulo;
		this.autor = autor;
		this.contenido = contenido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	

}
