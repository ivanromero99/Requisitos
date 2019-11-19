package Implementacion;

import java.util.List;

public class Login {
	
	private static String BD_SERVER = "localhost";
    private static String BD_NAME = "REQUISITOS";
    private static BD miBD = new BD(BD_SERVER, BD_NAME);
    
    private static Usuario usuario;
    private static ONG ONG;
    
    public static boolean loginUsuario(String nick, String contraseña) {
    	
    	List<Object[]> resultado = miBD.Select("SELECT * FROM Usuarios WHERE ID='" + nick + "';");
    	if(resultado.size()!=0) {
    		//usuario = new Usuario(nick);
    		System.out.println("Usuario sí existe");
    		return true;
    	} else {
    		System.out.println("Usuario no existe");
    		return false;
    	}
    }
    
    public static boolean loginONG(int nick, String contraseña) {
    	
    	List<Object[]> resultado = miBD.Select("SELECT * FROM ONG WHERE ID=" + nick + ";");
    	if(resultado.size()!=0) {
    		//ONG = new ONG(nick);
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public static void cerrarSesion() {
		usuario = null;
	}

}
