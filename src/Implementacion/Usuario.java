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
		private String edad;
		private int imparte_asignatura;
		private boolean turno_preferente;
		private Subcategoria subcategoria_preferente;
		private Categoria categoria_preferente;
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
		        if(tupla[3]!=null) {
		        	this.apellidos = (String)tupla[3];
		        }
		        if(tupla[4]!=null) {
		        	this.edad = tupla[4].toString();
		        }
		        this.rol = new Rol((String)tupla[5]);
		        if(tupla[6]!=null) {
		        	this.imparte_asignatura = (Integer)tupla[6];
		        }
		        
		        if(tupla[7]!=null) {
		        	 if(((boolean) tupla[7]) == false) { 
				        	this.turno_preferente = false;
				        } else {
				        	this.turno_preferente = true;
				     }
		        }
		        
		        if(tupla[8]!=null) {
		        	this.subcategoria_preferente = new Subcategoria((String)tupla[8]);
		        }
		        
		        if(tupla[9]!=null) {
		        	this.categoria_preferente = new Categoria((String)tupla[9]);
		        }
		        
		        if(tupla[10]!=null) {
		        	this.descripcion_ONG = (String)tupla[10];
		        }
		        
		        if(tupla[11]!=null) {
		        	this.web = (String)tupla[11];
		        }
		      
	    }
	    
	    public Usuario(String id,String pass, String nombre, String apellidos, Rol rol)
	    {
			// Crea el objeto y lo inserta en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);		
	    	miBD.Insert("INSERT INTO Usuarios VALUES('"+id+"', '"+pass+"', '"+nombre+"', '"+apellidos+"', NULL, '"+rol.getNombre()+"', NULL,NULL,NULL,NULL,NULL,NULL);" );			
	    	
	    	this.ID = id;
	    	this.password = pass;
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.edad = (String)null;
	        this.rol = rol;
	        this.imparte_asignatura = 0;
	        this.turno_preferente = false;
	        this.subcategoria_preferente = null;
	        this.categoria_preferente = null;
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
	    	
	    	this.password = value; 
	    }
	    
	    public String getPass() 
	    { 
	    	return password; 
	    }

	    public void setPass(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Usuarios SET Password = '" + value 
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
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
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
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.apellidos = value; 
	    }
	    
	    public String getEdad() 
	    { 
	    	return edad; 
	    }

	    public void setEdad(String value) 
	    { 
	    	int v = Integer.parseInt(value);
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Usuarios SET Edad = '" + v 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
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
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.imparte_asignatura = value; 
	    }
	    
	    
	    public boolean getTurno() 
	    { 
	    	return turno_preferente; 
	    }

	    public void setTurno(boolean value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	if(!value) {
	    		miBD.Update("UPDATE Usuarios SET Turno_preferente = '" + 0 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	} else {
	    		miBD.Update("UPDATE Usuarios SET Turno_preferente = '" + 1
		    			+ "' WHERE ID ='"+ this.ID + "';");
	    	}
	    	
	    	this.turno_preferente = value; 
	    }
	    
	    public Categoria getCategoria() 
	    { 
	    	return categoria_preferente; 
	    }

	    public void setCategoria(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Usuarios SET Categoria_preferente = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.categoria_preferente = new Categoria(value); 
	    }
	    
	    public Subcategoria getSubcategoria() 
	    { 
	    	return subcategoria_preferente; 
	    }

	    public void setSubcategoria(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Usuarios SET Subcategoria_preferente = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.subcategoria_preferente = new Subcategoria(value); 
	    }
	    
	    public String getDescripcion() 
	    { 
	    	return descripcion_ONG; 
	    }

	    public void setDescripcion(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Usuarios SET Descripcion_ONG = '" + value 
	    			+ "' WHERE Descripcion_ONG ='"+ this.descripcion_ONG + "';");
	    	
	    	this.descripcion_ONG = value; 
	    }
	    
	    public String getWeb() 
	    { 
	    	return web; 
	    }

	    public void setWeb(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Usuarios SET Web = '" + value 
	    			+ "' WHERE Web ='"+ this.web + "';");
	    	
	    	this.web = value; 
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
	        return ID + ";" + nombre + apellidos + ";" + rol;
	    }

	    public boolean equals(Object obj)
	    {
	        return (obj instanceof Usuario) && ((Usuario)obj).ID.equals(this.ID);
	    }

	    public int hashCode()
	    {
	        return this.ID.hashCode();
	    }

		public int compareTo(Usuario u) 
		{
			return this.ID.compareToIgnoreCase(u.ID);	
		}
	}

