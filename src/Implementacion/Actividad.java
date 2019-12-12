package Implementacion;
import java.util.*;

public class Actividad {

	private static String BD_SERVER = "localhost";
    private static String BD_NAME = "REQUISITOS";
    
    private int ID;
    private String Nombre;
    private String Descripcion;
    private int horas;
    private boolean turno;
    private String fecha;
    private boolean validada;
    private boolean voluntariado;
    private boolean formacion;
    private boolean investigacion;
    private int proyecto;
    private String ID_ONG;
    private String profesor;
    private String asignatura;
    private String categoria;
    private String subcategoria;
    private String lugar;
    
    
   


	public static List<Actividad> ListaActividades()
	{
		// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
		BD miBD = new BD(BD_SERVER,BD_NAME);
		ArrayList<Actividad> lista = new ArrayList<Actividad>(); 
					
		for(Object[] tupla: miBD.Select("SELECT ID FROM Actividades;"))
		{
			int id = (Integer)tupla[0];
			Actividad act = new Actividad(id);
			lista.add(act);
		}
		return lista;
	}
	
	 public Actividad(int id) {
		 	BD miBD = new BD(BD_SERVER,BD_NAME);			
		  
			Object[] tupla = miBD.Select("SELECT * FROM Actividades " + "WHERE ID='"+id+ "';").get(0);
			
			this.ID = (Integer)tupla[0];
			
			if(tupla[1] != null) {
				this.Nombre = (String)tupla[1];
			}
			
			if(tupla[2] != null) {
				this.Descripcion = (String)tupla[2];
			}
			
			if(tupla[3] != null) {
				this.horas = (Integer)tupla[3];
			}
			
			if(tupla[4] != null) {
				if(((boolean) tupla[4]) == false) { 
		        	this.turno = false;
		        } else {
		        	this.turno = true;
		     }
			}
			
			if(tupla[5] != null) {
				this.fecha = String.valueOf(tupla[5]);
			}
			if(tupla[6] != null) {
				if(((boolean) tupla[6]) == false) { 
		        	this.validada = false;
		        } else {
		        	this.validada = true;
		     }
			}
			if(tupla[7] != null) {
				if(((boolean) tupla[7]) == false) { 
		        	this.voluntariado = false;
		        } else {
		        	this.voluntariado = true;
		     }
			}
			if(tupla[8] != null) {
				if(((boolean) tupla[8]) == false) { 
		        	this.formacion = false;
		        } else {
		        	this.formacion = true;
		     }
			}
			if(tupla[9] != null) {
				if(((boolean) tupla[9]) == false) { 
		        	this.investigacion = false;
		        } else {
		        	this.investigacion = true;
		     }
			}
			if(tupla[10] != null) {
				this.proyecto = (Integer)tupla[10];
			}
			if(tupla[11] != null) {
				this.profesor = (String)tupla[12];
			}
			if(tupla[12] != null) {
				this.asignatura = (String)tupla[13];
			}
			if(tupla[13] != null) {
				this.categoria = (String)tupla[14];
			}
			if(tupla[14] != null) {
				this.subcategoria = (String)tupla[15];
			}
			if(tupla[15] != null) {
				this.lugar = (String)tupla[16];
			}
			if(tupla[16] != null) {
				this.ID_ONG = (String)tupla[16];
			}
		}
	 
	 public Actividad(int id,String nombre, String descripcion, int horas, boolean turno, String fecha,boolean validada,boolean voluntariado, boolean formacion, boolean investigacion,int proyecto, String id_ong,String profesor,int asignatura, String categoria, String subcategoria, String lugar)
	    {
			// Crea el objeto y lo inserta en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);		
	    	miBD.Insert("INSERT INTO Actividades VALUES('"+id+"', '"+ nombre +"', '" + descripcion + "', "+ horas + ", '" + turno + "', '" + fecha + "','" + validada + "','" + voluntariado + "','" + formacion + "','" + investigacion + "', " + proyecto + ",null " + "," + asignatura + ",'" + categoria + "','" + subcategoria + "','"+ lugar + "','" + id_ong + "');" );			
	    	
	    	this.ID = id;
	    	this.Nombre = nombre;
	    	this.Descripcion = descripcion;
	    	this.horas = horas;
	    	this.turno = turno;
	    	this.fecha = fecha;
	    	this.validada = validada;
	    	this.voluntariado = voluntariado;
	    	this.formacion = formacion;
	    	this.investigacion = investigacion;
	    	this.proyecto = proyecto;
	    	this.ID_ONG = id_ong;
	    	this.profesor = profesor;
	    	this.asignatura = String.valueOf(asignatura);
	    	this.categoria = categoria;
	    	this.subcategoria = subcategoria;
	    	this.lugar = lugar;
	        
	    }
	 
	 
	 public int getID() 
	    { 
	    	return ID; 
	    }

	    public void setID(int value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Actividades SET ID = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.ID = value; 
	    }
	    
	    public String getNombre() 
	    { 
	    	return this.Nombre; 
	    }

	    public void setNombre(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Actividades SET Nombre = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.Nombre= value; 
	    }
	    
	    public String getDescripcion() 
	    { 
	    	return this.Descripcion; 
	    }

	    public void setDescripcion(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Actividades SET Descripcion = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.Descripcion= value; 
	    }
	    
	    public int getHoras() 
	    { 
	    	return this.horas; 
	    }

	    public void setHoras(int value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Actividades SET Horas = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.horas= value; 
	    }
	    public boolean getTurno() 
	    { 
	    	return this.turno; 
	    }

	    public void setTurno(boolean value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	if(!value) {
	    		miBD.Update("UPDATE Actividades SET Turno = '" + 0 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	} else {
	    		miBD.Update("UPDATE Actividades SET Turno = '" + 1
		    			+ "' WHERE ID ='"+ this.ID + "';");
	    	}
	    	
	    	this.turno = value; 
	    }
	    
	    public String getFecha() 
	    { 
	    	return this.fecha; 
	    }

	    public void setFecha(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Actividades SET Fecha = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.fecha= value; 
	    }
	    
	    public boolean getValidada() 
	    { 
	    	return this.validada; 
	    }

	    public void setValidada(boolean value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	if(!value) {
	    		miBD.Update("UPDATE Actividades SET Validada = '" + 0 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	} else {
	    		miBD.Update("UPDATE Actividades SET Validada = '" + 1
		    			+ "' WHERE ID ='"+ this.ID + "';");
	    	}
	    	
	    	this.validada = value; 
	    }
	    public boolean getVoluntariado() 
	    { 
	    	return this.voluntariado; 
	    }

	    public void setVoluntariado(boolean value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	if(!value) {
	    		miBD.Update("UPDATE Actividades SET Voluntariado = '" + 0 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	} else {
	    		miBD.Update("UPDATE Actividades SET Voluntariado = '" + 1
		    			+ "' WHERE ID ='"+ this.ID + "';");
	    	}
	    	
	    	this.voluntariado = value; 
	    }
	    
	    public boolean getFormacion() 
	    { 
	    	return this.formacion; 
	    }

	    public void setFormacion(boolean value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	if(!value) {
	    		miBD.Update("UPDATE Actividades SET Formacion = '" + 0 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	} else {
	    		miBD.Update("UPDATE Actividades SET Formacion = '" + 1
		    			+ "' WHERE ID ='"+ this.ID + "';");
	    	}
	    	
	    	this.formacion = value; 
	    }
	    
	    public boolean getInvestigacion() 
	    { 
	    	return this.investigacion; 
	    }

	    public void setInvestigacion(boolean value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	if(!value) {
	    		miBD.Update("UPDATE Actividades SET Investigacion = '" + 0 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	} else {
	    		miBD.Update("UPDATE Actividades SET Investigacion = '" + 1
		    			+ "' WHERE ID ='"+ this.ID + "';");
	    	}
	    	
	    	this.investigacion = value; 
	    }
	    
	    public int getProyecto() 
	    { 
	    	return this.proyecto; 
	    }
	    
	    public void setProyecto(int value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	//BD miBD = new BD(BD_SERVER,BD_NAME);
	    	//miBD.Update("UPDATE Actividades SET Proyecto = '" + value 
	    	//		+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.proyecto= value; 
	    }
	    
	    @Override
		public String toString() {
			return this.Nombre;
		}

		public String getid_ong() 
	    { 
	    	return this.ID_ONG; 
	    }
	    
	    public void setid_ong(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Actividades SET ID_ONG = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.ID_ONG= value; 
	    }
	    
	    public String getProfesor() 
	    { 
	    	return this.profesor; 
	    }

	    public void setProfesor(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Actividades SET Profesor = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.profesor= value; 
	    }
	    
	    public String getAsignatura() 
	    { 
	    	return this.asignatura; 
	    }
	    
	    public void setAsignatura(int value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Actividades SET Asignatura = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.asignatura= String.valueOf(value); 
	    }
	    
	    public String getCategoria() 
	    { 
	    	return this.categoria; 
	    }

	    public void setCategoria(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Actividades SET Categoria = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.categoria= value; 
	    }
	    
	    public String getsubCategoria() 
	    { 
	    	return this.subcategoria; 
	    }

	    public void setsubCategoria(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Actividades SET Subcategoria = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.subcategoria= value; 
	    }
	    
	    public String getLugar() 
	    { 
	    	return this.lugar; 
	    }

	    public void setLugar(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Actividades SET Lugar = '" + value 
	    			+ "' WHERE ID ='"+ this.ID + "';");
	    	
	    	this.lugar= value; 
	    }
	    
	    public static int saberID(String nombre) {
	    	
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	Object[] tupla = miBD.Select("SELECT ID FROM Actividades " + "WHERE Nombre='"+nombre+ "';").get(0);
	    	return (int)tupla[0];
	    }
	    
	    
	    public boolean equals(Object obj)
	    {
	        return (obj instanceof Actividad) && ((Actividad)obj).ID == this.ID;
	    }
	     
	 
	 
}
