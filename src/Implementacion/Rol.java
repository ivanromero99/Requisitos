package Implementacion;

import java.util.ArrayList;
import java.util.List;

public class Rol {
	
	private static String BD_SERVER = "localhost";
    private static String BD_NAME = "REQUISITOS";

    private String nombre;
    private boolean seleccionar;
    private boolean inscribir;
    private boolean calificar;
    private boolean validar;
    
    
	public static List<Rol> ListaRol()
	{
		// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
		BD miBD = new BD(BD_SERVER,BD_NAME);
		ArrayList<Rol> lista = new ArrayList<Rol>(); 
					
		for(Object[] tupla: miBD.Select("SELECT Roles FROM Rol;"))
		{
			String nombre = (String)tupla[0];
			Rol r = new Rol(nombre);
			lista.add(r);
		}
		return lista;
	}
	
	
	public Rol(String string) {
		BD miBD = new BD(BD_SERVER,BD_NAME);			
		  
		Object[] tupla = miBD.Select("SELECT * FROM Roles " + "WHERE Rol='"+string+ "';").get(0);
		
        this.nombre = (String)tupla[0];
        if((boolean) tupla[1]) {
        	this.seleccionar = false;
        } else {
        	this.seleccionar = true;
        }
        if((boolean) tupla[2]) {
        	this.inscribir = false;
        } else {
        	this.inscribir = true;
        }
        if((boolean) tupla[3]) {
        	this.calificar = false;
        } else {
        	this.calificar = true;
        }
        if((boolean) tupla[4]) {
        	this.validar = false;
        } else {
        	this.validar = true;
        }
        
	}
	
	 public Rol(String nombre, boolean selec, boolean insc, boolean calif,boolean valid)
	    {
			// Crea el objeto y lo inserta en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);	
	    	int valSelec;
	    	int valInsc;
	    	int valCalif;
	    	int valValid;
	    	
	    	if(!selec) {
	    		valSelec = 0;
	    	} else {
	    		valSelec = 1;
	    	}
	    	if(!insc) {
	    		valInsc = 0;
	    	} else {
	    		valInsc = 1;
	    	}
	    	if(!calif) {
	    		valCalif = 0;
	    	} else {
	    		valCalif = 1;
	    	}
	    	if(!valid) {
	    		valValid = 0;
	    	} else {
	    		valValid = 1;
	    	}
	    	
	    	
	    	miBD.Insert("INSERT INTO Roles VALUES(" + "'" + nombre + ", " + valSelec + ", " + valInsc + ", " + valCalif + ", " + valValid + "');" );			
	    	
	    	this.nombre = nombre;
	    	this.seleccionar = selec;
	    	this.inscribir = insc;
	    	this.validar = valid;	        
	    }
	 
	 public String getNombre() 
	    { 
	    	return nombre; 
	    }

	    public void setNombre(String value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	miBD.Update("UPDATE Roles SET Rol = '" + value 
	    			+ "' WHERE Rol ='"+ this.nombre + "';");
	    	
	    	this.nombre = value; 
	    }
	    
	    public boolean getSelec() 
	    { 
	    	return seleccionar; 
	    }

	    public void setSelec(boolean value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	if(!value) {
	    		miBD.Update("UPDATE Roles SET Seleccionar = '" + 0 
	    			+ "' WHERE Rol ='"+ this.nombre + "';");
	    	} else {
	    		miBD.Update("UPDATE Roles SET Seleccionar = '" + 1
		    			+ "' WHERE Rol ='"+ this.nombre + "';");
	    	}
	    	
	    	this.seleccionar = value; 
	    }
	    
	    public boolean getCalif() 
	    { 
	    	return calificar; 
	    }

	    public void setCalif(boolean value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	if(!value) {
	    		miBD.Update("UPDATE Roles SET Calificar = '" + 0 
	    			+ "' WHERE Rol ='"+ this.nombre + "';");
	    	} else {
	    		miBD.Update("UPDATE Roles SET Calificar = '" + 1
		    			+ "' WHERE Rol ='"+ this.nombre + "';");
	    	}
	    	
	    	this.calificar = value; 
	    }
	    
	    public boolean getValid() 
	    { 
	    	return validar; 
	    }

	    public void setValid(boolean value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	if(!value) {
	    		miBD.Update("UPDATE Roles SET Validar = '" + 0 
	    			+ "' WHERE Rol ='"+ this.nombre + "';");
	    	} else {
	    		miBD.Update("UPDATE Roles SET Validar = '" + 1
		    			+ "' WHERE Rol ='"+ this.nombre + "';");
	    	}
	    	
	    	this.validar = value; 
	    }
	    
	    public boolean getInsc() 
	    { 
	    	return inscribir; 
	    }

	    public void setInsc(boolean value) 
	    { 
	    	
			// Actualiza el atributo en memoria y en la base de datos
	    	BD miBD = new BD(BD_SERVER,BD_NAME);
	    	if(!value) {
	    		miBD.Update("UPDATE Roles SET Inscribir = '" + 0 
	    			+ "' WHERE Rol ='"+ this.nombre + "';");
	    	} else {
	    		miBD.Update("UPDATE Roles SET Inscribir = '" + 1
		    			+ "' WHERE Rol ='"+ this.nombre + "';");
	    	}
	    	
	    	this.inscribir = value; 
	    }
	    
	    

}
