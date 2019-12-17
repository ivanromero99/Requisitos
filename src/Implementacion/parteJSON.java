package Implementacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class parteJSON {

	// private static String appURL = "http://localhost:5000";
	private static String appURL = "http://idumamockup-env.3mca2qexfx.eu-central-1.elasticbeanstalk.com";

	public static void main(String[] args) throws JSONException, UnsupportedEncodingException, IOException {
		/*
		Usuario usuario1 = getUsuarioSiExiste("jmalveroc@uma.es","223322");
		
		if(usuario1==null)
		{
			System.out.print("El usuario existe");
		}
		else
		{
			System.out.print("El usuario NO existe");
		}
		*/
		for(String s :getAsignaturasDadoUsuario("jmalveroc@uma.es","223322"))
		{
			System.out.print(s+"/");
		}
	}

	public static Usuario getUsuarioSiExiste(String email, String contrasena) throws JSONException, UnsupportedEncodingException, IOException {
		
		URL url = new URL(appURL + "/getuser/"+email+"/"+contrasena);
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
			StringBuilder completeResponse = new StringBuilder();
			for (String line; (line = reader.readLine()) != null;) {
				completeResponse.append(line);
			}
			
		JSONObject obj = new JSONObject(new String(completeResponse));
		System.out.println(obj.toString());
		String userSituation = obj.getString("situation");
		if (userSituation.equals("ABSENT")) 
		{
			//si no existe devolvemos un usuario null
			return null;
		} 
		else 
		{
			//En otro caso,devolvemos el usuario completo
			System.out.print(obj.getString("categoryName"));
			return new Usuario(
				email,
				contrasena,
				obj.getString("nombre"),
				new StringBuilder().append(obj.getString("primerApellido")).append(obj.getString("segundoApellido")).toString(),
				new Rol(obj.getString("categoryName")));
			} 
		}
	}
	
	public static List<String> getAsignaturasDadoUsuario(String email,String contrasena) throws JSONException, UnsupportedEncodingException, IOException 
	{	
		List<String> listaAsignaturas = new ArrayList<>();
		
		URL url = new URL(appURL + "/getuser/"+email+"/"+contrasena);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			StringBuilder completeResponse = new StringBuilder();
			for (String line; (line = reader.readLine()) != null;) {
				completeResponse.append(line);
			}
			
		JSONObject obj = new JSONObject(new String(completeResponse));	
		JSONArray asignaturas = obj.getJSONArray("courses");
		
		for (int i = 0; i < asignaturas.length();i++) 
		{
			JSONObject aCourse = asignaturas.getJSONObject(i);
			listaAsignaturas.add(aCourse.getString("name"));
			//System.out.println(aCourse.getString("name"));
		}
		return listaAsignaturas;
	}
		
}
