package Implementacion;

import java.util.List;

public class Login {
	
	private static String BD_SERVER = "localhost";
    private static String BD_NAME = "REQUISITOS";
    private static BD miBD = new BD(BD_SERVER, BD_NAME);
    
    private static Usuario usuario;
    private static String nombreUsuario;
    
    public static boolean loginUsuario(String nick, String contraseña) {
    	
    	List<Object[]> resultado = miBD.Select("SELECT * FROM Usuarios WHERE ID='" + nick + "' AND Rol!='ONG';");
    	if(resultado.size()!=0) {
    		//usuario = new Usuario(nick);
    		//this.nombreUsuario = usuario.getID();
    		System.out.println("Usuario sí existe");
    		return true;
    	} else {
    		System.out.println("Usuario no existe");
    		return false;
    	}
    }
    
public static boolean loginONG(String nick, String contraseña) {
    	
	List<Object[]> resultado = miBD.Select("SELECT * FROM Usuarios WHERE ID='" + nick + "' AND Rol='ONG';");
    	if(resultado.size()!=0) {
    		//usuario = new Usuario(nick);
    		//this.nombreUsuario = usuario.getID();
    		System.out.println("Usuario sí existe");
    		return true;
    	} else {
    		System.out.println("Usuario no existe");
    		return false;
    	}
    }
    

}
