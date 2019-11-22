package Implementacion;
	import java.util.*;

	public class Usuario implements Comparable<Usuario>
	{
	   
		
		private static String BD_SERVER = "localhost";
	    private static String BD_NAME = "REQUISITOS";
	    
		private String ID;
		private String password;
		private String nombre;
		private String apellidos;
		private int edad;
		private int imparte_asignatura;
		private boolean turno_preferente;
		private String lugar_preferente;
		private String categoria_preferente;
		private String descripcion_ONG;
		private String web;
	    private Rol rol;

		public static List<Usuario> ListaUsuarios()
		{
			// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
			BD miBD = new BD(BD_SERVER,BD_NAME);
			ArrayList<Usuario> lista = new ArrayList<Usuario>(); 
						
			for(Object[] tupla: miBD.Select("SELECT ID FROM Usuarios;"))
			{
				String id = (String)tupla[0];
				Usuario u = new Usuario(id);
				lista.add(u);
			}
			return lista;
		}
		
	    public Usuario(String id)
	    {
			// Crea el objeto cargando sus valores de la base de datos
		    	BD miBD = new BD(BD_SERVER,BD_NAME);			
		  
				Object[] tupla = miBD.Select("SELECT * FROM Usuarios " + "WHERE ID='"+id+ "';").get(0);
				
		        this.ID = (String)tupla[0];
		        this.password = (String)tupla[1];
		        this.nombre = (String)tupla[2];
		        this.apellidos = (String)tupla[3];
		        this.edad = (Integer)tupla[4];
		        this.rol = new Rol((String)tupla[5]);
		        this.imparte_asignatura = (Integer)tupla[6];
		        this.turno_preferente = (Boolean)tupla[7];
		        this.lugar_preferente = (String)tupla[8];
		        this.categoria_preferente = (String)tupla[9];
		        this.descripcion_ONG = (String)tupla[10];
		        this.web = (String)tupla[11];
	    }
	    
	    public Usuario(String id,String pass, String nombre, String apellidos, Rol rol)
	    {
			// Crea el objeto y lo inserta en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);		
	    	
	    	miBD.Insert("INSERT INTO tUsuario VALUES(" + "'" + id + "', '" + pass + "', '" + nombre + "', '" + "'" + apellidos + "', NULL, '" + "'" + rol + "', NULL,NULL,NULL,NULL,NULL,NULL" +  "');" );			
	    	
	    	this.ID = id;
	    	this.password = pass;
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.edad = (Integer)null;
	        this.rol = rol;
	        this.imparte_asignatura = (Integer)null;
	        this.turno_preferente = (Boolean)null;
	        this.lugar_preferente = (String)null;
	        this.categoria_preferente = (String)null;
	        this.descripcion_ONG = (String)null;
	        this.web = (String)null;
	        
	    }

	    public String getID() 
	    { 
	    	return ID; 
	    }

	    public void setID(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Usuarios SET ID = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.ID = value; 
	    }

	    /*public void borraUsuario() 
	    {     	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Delete("DELETE FROM  tUsuario WHERE nif ='"+ this.nif + "';");    	
	    	nif = password = null;
	    	rol = null;
	    }
	    */
	    
	    public String getNombre() 
	    { 
	    	return nombre; 
	    }

	    public void setNombre(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Usuarios SET Nombre = '" + value 
	    			+ "' WHERE Nombre ='"+ this.nombre + "';");
	    	
	    	this.nombre = value; 
	    }

	    public String getApellidos() 
	    { 
	    	return apellidos; 
	    }

	    public void setApellidos(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Usuarios SET Apellidos = '" + value 
	    			+ "' WHERE Apellidos ='"+ this.apellidos + "';");
	    	
	    	this.apellidos = value; 
	    }
	    
	    public int getEdad() 
	    { 
	    	return edad; 
	    }

	    public void setEdad(int value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Usuarios SET Edad = '" + value 
	    			+ "' WHERE Edad ='"+ this.edad + "';");
	    	
	    	this.edad = value; 
	    }
	    
	    public int getImparte() 
	    { 
	    	return imparte_asignatura; 
	    }

	    public void setImparte(int value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Usuarios SET Imparte_Asignatura = '" + value 
	    			+ "' WHERE Imparte_Asignatura ='"+ this.imparte_asignatura + "';");
	    	
	    	this.imparte_asignatura = value; 
	    }
	    
	    public String getCategoria() 
	    { 
	    	return categoria_preferente; 
	    }

	    public void setCategoria(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Usuarios SET Categoria_preferente = '" + value 
	    			+ "' WHERE Apellidos ='"+ this.apellidos + "';");
	    	
	    	this.apellidos = value; 
	    }
	    
	    
	    
	    public Rol getRol()
	    {
	        return rol;
	    }
	    
	    public void setRol()
	    {
	    	throw new BDException("Error: Un usuario no puede cambiar el rol de si mismo.");     
	    }
	    

	    public String toString()
	    {
	        return nif + ";" + password + ";" + rol;
	    }

	    public boolean equals(Object obj)
	    {
	        return (obj instanceof Usuario) && ((Usuario)obj).nif.equals(this.nif);
	    }

	    public int hashCode()
	    {
	        return this.nif.hashCode();
	    }

		public int compareTo(Usuario u) 
		{
			return this.nif.compareToIgnoreCase(u.nif);	
		}
	}


