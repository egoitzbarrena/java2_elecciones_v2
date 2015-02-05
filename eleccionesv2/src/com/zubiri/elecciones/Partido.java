package com.zubiri.elecciones;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


final public class Partido {

private String direccionsede;
private String nombre;
private String ciudad;
private String email;
private Integer telefono;

public Integer getTelefono(){
	
	return telefono;
}

public void setTelefono(Integer  telf){

	telefono=telf;

}
public String  getDirecciones(){
	
	return direccionsede;
}

public void setDirecciones(String direc){

	direccionsede=direc;

} 

public String  getNombre(){
	
	return nombre;
}

public void setNombre(String  nom){

	nombre=nom;

}

public String  getCiudad(){
	
	return ciudad;
}

public void setCiudad(String  ciu){

	ciudad=ciu;

}

public String  getEmail(){
	
	return email;
}

public void setEmail(String  ema){

	email=ema;

}

public static void imprimir_partido(){
	
	   String nombrefichero = "listapartidos.txt";
	   String ruta ="/root/git/java2_elecciones_v2/eleccionesv2/elecciones";
	   ArrayList<Partido> partidos = new ArrayList<Partido>();
	   

	   //Instanciamos el fichero donde estan los datos
	   File archivo = new File(ruta, nombrefichero);
	   Scanner s = null;
	   try {
	   	// Leemos el contenido del fichero
	   	System.out.println("... Leemos el contenido del fichero ...");
	   	s = new Scanner(archivo);
	   	// Obtengo los datos de los partidos de fútbol del fichero
	   	while (s.hasNextLine()){
	   		String linea = s.nextLine();	// Obtengo uuna linea del fichero
	   		String [] cortarString = linea.split(" , ");		// Obtengo los datos del partido
	   		Partido partidose = new Partido();	// Creo un objeto de la clase Partido

	   		// Pongo los atributos al objeto "partido"
	   		partidose.setNombre(cortarString[0]);
	   		partidose.setDirecciones(cortarString[1]);
	   		partidose.setCiudad(cortarString[2]);
	   		partidose.setEmail(cortarString[3]);
	   		partidose.setTelefono(Integer.parseInt(cortarString[4]));

	   		// Añadimos el objeto "partido" al ArrayList
	   		partidos.add(partidose);
	   		
	   		for(int d=0; d< partidos.size(); d++)
	       	{
	           	    System.out.println(" nombre: "+ partidos.get(d).getNombre() );
	           		System.out.println(" Direccion: "+ partidos.get(d).getDirecciones());
	           		System.out.println(" Ciudad: "+ partidos.get(d).getCiudad());
	           		System.out.println(" Email: "+ partidos.get(d).getEmail());
	           		System.out.println(" Telefono: "+ partidos.get(d).getTelefono());
	       	}	

	   partidos.clear();
	   	}
	   	

	   	} 
	   catch (Exception e) {
	   		e.printStackTrace();
	   	} finally{
	   		try {
	   			if (s != null)
	   				s.close();
	   		} catch (Exception e2) {
	   			e2.printStackTrace();
	   		}
	   	}
}

}
