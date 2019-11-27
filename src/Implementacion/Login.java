package Implementacion;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.json.JSONException;

public class Login {
	
	private static String BD_SERVER = "localhost";
    private static String BD_NAME = "REQUISITOS";
    private static BD miBD = new BD(BD_SERVER, BD_NAME);
    
    public static Usuario usuario;
    
    public static boolean loginUsuario(String nick, String contraseña) {
    	
    	List<Object[]> resultado = miBD.Select("SELECT * FROM Usuarios WHERE ID='" + nick + "' AND Rol!='ONG';");
    	if(resultado.size()!=0 && resultado.get(0)[1].equals(contraseña)) {
    		usuario = new Usuario(nick);
    		System.out.println("Usuario sí existe en nuesta BD");
    		return true;
    	} else {
    		System.out.println("Usuario no existe en nuestra BD, miramos fake iDUMA");
    		Usuario u = null;
			try {
				u = parteJSON.getUsuarioSiExiste(nick, contraseña);
			} catch (JSONException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		if(u==null) {
    			System.out.println("Usuario tampoco existe en fake iDuma");
    			return false;
    		} else {
    			usuario = u;
    			Interfaz.LoginControlador.redireccion = true;
    			return true;
    		}
    	}
    }
    
public static boolean loginONG(String nick, String contraseña) {
    	
	List<Object[]> resultado = miBD.Select("SELECT * FROM Usuarios WHERE ID='" + nick+ "' AND Rol='ONG';");
    	if(resultado.size()!=0 && resultado.get(0)[1].equals(contraseña)) {
    		usuario = new Usuario(nick);
    		System.out.println("Usuario sí existe");
    		return true;
    	} else {
    		System.out.println("Usuario no existe");
    		return false;
    	}
    }
    

}
