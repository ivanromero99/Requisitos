package Implementacion;

import java.util.List;

public class Login {
	
	private static String BD_SERVER = "localhost";
    private static String BD_NAME = "REQUISITOS";
    private static BD miBD = new BD(BD_SERVER, BD_NAME);
    
    public static Usuario usuario;
    
    public static boolean loginUsuario(String nick, String contraseña) {
    	
    	List<Object[]> resultado = miBD.Select("SELECT * FROM Usuarios WHERE ID='" + nick + "' AND Rol!='ONG';");
    	if(resultado.size()!=0 && resultado.get(0)[1].equals(contraseña)) {
    		usuario = new Usuario(nick);
    		System.out.println("Usuario sí existe");
    		return true;
    	} else {
    		System.out.println("Usuario no existe");
    		return false;
    	}
    }
    
public static boolean loginONG(String nick, String contraseña) {
    	
	List<Object[]> resultado = miBD.Select("SELECT * FROM Usuarios WHERE ID='" + nick + "' AND Rol='ONG';");
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
