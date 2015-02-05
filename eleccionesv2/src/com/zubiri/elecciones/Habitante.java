package com.zubiri.elecciones;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

final public class Habitante {

private String dni;
private String nombre;
private String apellido;
private Integer edad;
private Integer telefono;
private String ciudad;


public Integer getTelefono(){
	
	return telefono;
}

public void setTelefono(Integer  telf){

	telefono=telf;

}

public String  getCiudad(){
	
	return ciudad;
}

public void setCiudad(String  ciu){

	ciudad=ciu;

}

 
public Integer getEdad(){
	
	return edad;
}

public void setEdad(Integer ed){

	edad=ed;

}



public String  getDni(){
	
	return dni;
}

public void setDni(String dn){

	dni=dn;

}

public String  getNombre(){
	
	return nombre;
}

public void setNombre(String  nom){

	nombre=nom;

}

public String  getApellido(){
	
	return apellido;
}

public void setApellido(String  ape){
 
	apellido=ape;

}

public static void imprimir_censo() {
	
	String nombrefichero = "censo.txt";
	String ruta ="/root/git/java2_elecciones_v2/eleccionesv2/elecciones";
	ArrayList<Habitante> habitantes = new ArrayList<Habitante>();

	//Instanciamos el fichero donde estan los datos
	File archivo = new File(ruta, nombrefichero);
	Scanner s = null;
	try {
		// Leemos el contenido del fichero
		System.out.println("... Leemos el contenido del fichero ...");
		s = new Scanner(archivo);
		// Obtengo los datos de los partidos de fútbol del fichero
		while (s.hasNextLine()){
			String linea = s.nextLine();	// Obtengo una linea del fichero (un partido de fútbol)
			String [] cortarString = linea.split(" , ");		// Obtengo los datos del partido de futbol
			Habitante habitantese = new Habitante();	// Creo un objeto de la clase "PartidoFutbol"

			// Pongo los atributos al objeto "partido"

			habitantese.setDni(cortarString[0]);
			habitantese.setNombre(cortarString[1]);
			habitantese.setApellido(cortarString[2]);
			habitantese.setEdad(Integer.parseInt(cortarString[3]));

			// Añadimos el objeto "partido" al ArrayList
			habitantes.add(habitantese);
			
			for(int d=0; d< habitantes.size(); d++)
	    	{
				if (habitantes.get(d).getEdad()>=18){
	        	    System.out.println(" Dni: "+ habitantes.get(d).getDni() );
	        		System.out.println(" Nombre: "+ habitantes.get(d).getNombre());
	        		System.out.println(" Apellido: "+ habitantes.get(d).getApellido());
	        		System.out.println(" Edad: "+ habitantes.get(d).getEdad());
				}
	    	}	

			habitantes.clear();
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
