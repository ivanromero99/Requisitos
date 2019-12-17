package Implementacion;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {

	private static String BD_SERVER = "localhost";
    private static String BD_NAME = "REQUISITOS";
    
    private String ID_Usuario;
    private int ID_Actividad;
    private boolean confirmada;
    private boolean terminada;
    private int nota;
    private String informe;
    private int horas;
    
    
    public static List<Inscripcion> ListaInscripcionesUsuario(String id_usuario)
	{
		// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
		BD miBD = new BD(BD_SERVER,BD_NAME);
		ArrayList<Inscripcion> lista = new ArrayList<Inscripcion>();
		int id_ac = -1;
		String id_u = id_usuario;
					
		for(Object[] tupla: miBD.Select("SELECT * FROM Inscripcion WHERE ID_Usuario ='" + id_usuario +"';"))
		{
				if(tupla[0]!=null) {
					id_ac = (Integer)tupla[1];
				}
				if(id_ac!=-1) {
					Inscripcion ins = new Inscripcion(id_u,id_ac);
					lista.add(ins);
				}
		}
		return lista;
	}
    
    public static List<Inscripcion> ListaInscripcionesActividad(int id_act)
	{
		// Retorna una lista con todos los obejtos de la clase almacenados en la base de datos
		BD miBD = new BD(BD_SERVER,BD_NAME);
		ArrayList<Inscripcion> lista = new ArrayList<Inscripcion>(); 
					
		for(Object[] tupla: miBD.Select("SELECT ID_Usuario FROM Inscripcion WHERE ID_Actividad ='" + id_act +" ;"))
		{
			String id_u = (String)tupla[0];
			int id_ac = (Integer)tupla[1];
			Inscripcion ins = new Inscripcion(id_u,id_ac);
			lista.add(ins);
		}
		return lista;
	}
    
    public Inscripcion(String id_usuario, int id_actividad) {
	 	BD miBD = new BD(BD_SERVER,BD_NAME);			
	  
		Object[] tupla = miBD.Select("SELECT * FROM Inscripcion " + "WHERE ID_Usuario='"+id_usuario+ "' AND ID_Actividad = " + id_actividad + ";").get(0);
		
		this.ID_Usuario = (String)tupla[0];
		this.ID_Actividad = (Integer)tupla[1];
		this.confirmada = (Boolean) tupla[2];
		this.terminada = (Boolean) tupla[3];
		if(tupla[4]!=null) {
			this.nota = (Integer) tupla[4];
		}
		if(tupla[5]!=null) {
			this.informe = (String) tupla[5];
		}
		if(tupla[6]!=null) {
			this.horas = (Integer) tupla[6];
		}		
    }
    
    public Inscripcion(String id_usuario, int id_actividad, boolean confirm) {
    	
    	BD miBD = new BD(BD_SERVER,BD_NAME);		
    	miBD.Insert("INSERT INTO Inscripcion VALUES('"+id_usuario+"', "+ id_actividad+", '" + confirm + "','false',NULL,NULL,NULL);" );			
    	
    	this.ID_Usuario = id_usuario;
		this.ID_Actividad = id_actividad;
		this.confirmada = confirm;
		this.terminada = false;
    	
    }
    
    
    public String getID_Usuario() 
    { 
    	return ID_Usuario; 
    }

    public void setID_Usuario(String value) 
    { 
    	
		// Actualiza el atributo en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	miBD.Update("UPDATE Inscripcion SET ID_Usuario = '" + value 
    			+ "' WHERE ID_Usuario ='"+ this.ID_Usuario + " AND WHERE ID_Actividad = "+ this.ID_Actividad +"';");
    	
    	this.ID_Usuario = value; 
    }
    
    public String getInforme() 
    { 
    	return informe; 
    }

    public void setInforme(String value) 
    { 
    	
		// Actualiza el atributo en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	miBD.Update("UPDATE Inscripcion SET Informe = '" + value 
    			+ "' WHERE ID_Usuario ='"+ this.ID_Usuario + " AND WHERE ID_Actividad = "+ this.ID_Actividad +"';");
    	
    	this.informe = value; 
    }
    
    
    public int getID_Actividad() 
    { 
    	return ID_Actividad; 
    }

    public void setID_Actividad(int value) 
    { 
    	
		// Actualiza el atributo en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	miBD.Update("UPDATE Inscripcion SET ID_Actividad = '" + value 
    			+ "' WHERE ID_Usuario ='"+ this.ID_Usuario + " AND WHERE ID_Actividad = "+ this.ID_Actividad +"';");
    	
    	this.ID_Actividad = value; 
    }
    
    public int getNota() 
    { 
    	return nota; 
    }

    public void setNota(int value) 
    { 
    	
		// Actualiza el atributo en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	miBD.Update("UPDATE Inscripcion SET Nota = '" + value 
    			+ "' WHERE ID_Usuario ='"+ this.ID_Usuario + " AND WHERE ID_Actividad = "+ this.ID_Actividad +"';");
    	
    	this.nota = value; 
    }
    
    
    public int getHoras() 
    { 
    	return horas; 
    }

    public void setHoras(int value) 
    { 
    	
		// Actualiza el atributo en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	miBD.Update("UPDATE Inscripcion SET Horas = '" + value 
    			+ "' WHERE ID_Usuario ='"+ this.ID_Usuario + " AND WHERE ID_Actividad = "+ this.ID_Actividad +"';");
    	
    	this.horas = value; 
    }
    
    public boolean getConfirmada() 
    { 
    	return confirmada; 
    }

    public void setConfirmada(boolean value) 
    { 
    	
		// Actualiza el atributo en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	if(!value) {
    		miBD.Update("UPDATE Inscripcion SET Confirmada = '" + 0 
    			+ "' WHERE ID_Usuario ='"+ this.ID_Usuario + " AND WHERE ID_Actividad = "+ this.ID_Actividad +"';");
    	} else {
    		miBD.Update("UPDATE Inscripcion SET Confirmada = '" + 1
	    			+ "' WHERE ID_Usuario ='"+ this.ID_Usuario + " AND WHERE ID_Actividad = "+ this.ID_Actividad +"';");
    	}
    	
    	this.confirmada = value; 
    }
    
    
    public boolean getTerminada() 
    { 
    	return terminada; 
    }

    public void setTerminada(boolean value) 
    { 
    	
		// Actualiza el atributo en memoria y en la base de datos
    	BD miBD = new BD(BD_SERVER,BD_NAME);
    	if(!value) {
    		miBD.Update("UPDATE Inscripcion SET Terminada = '" + 0 
    			+ "' WHERE ID_Usuario ='"+ this.ID_Usuario + " AND WHERE ID_Actividad = "+ this.ID_Actividad +"';");
    	} else {
    		miBD.Update("UPDATE Inscripcion SET Terminada = '" + 1
	    			+ "' WHERE ID_Usuario ='"+ this.ID_Usuario + " AND WHERE ID_Actividad = "+ this.ID_Actividad +"';");
    	}
    	
    	this.terminada = value; 
    }
	
    
    
}
