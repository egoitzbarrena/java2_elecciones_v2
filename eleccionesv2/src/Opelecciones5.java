import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.zubiri.elecciones.*;

import java.util.*;
import java.io.*;

/*
CLASSPATH=:/home/zubiri/Elecciones; export CLASSPATH
 *Programa para visualizar en pantalla el area y la circunferencia de un circulo 
 */
public class Opelecciones5 {

	private static Scanner sc;

	public static void main (String args[]) {
				
		char palabra='T';
		String palabra2="ant";

		System.out.print("\ningresa la palabra depende de lo que quieras hacer: Ayuntamiento(A),EspacioPublico(E),Inmueble(I),Habitante(H),Partido(P) ?: ");
		sc = new Scanner(System.in);
		palabra2 = sc.nextLine();
		palabra=palabra2.charAt(0);
		//palabra2 = sc.next().charAt(0);
		
		switch (palabra) {
	       case 'A':
	       case 'a':
	   		System.out.print("\nHAS ELEGIDO Ayuntamiento ");
	   		System.out.print("\n-----------------------------------------------------------------------------------------");
	   				String calle,ciudad;
	   				Integer telefono;
	   				Ayuntamiento ayuntamiento = new Ayuntamiento();

	   			System.out.print("\ningresa la calle del ayuntamiento: ");
	   				calle = sc.next();
	   				ayuntamiento.setCalle(calle);
	   				System.out.print("\ningresa el telefono del ayuntamiento: ");
	   				telefono = sc.nextInt();
	   				ayuntamiento.setTelefono(telefono);
	   				System.out.print("\ningresa la ciudad del ayuntamiento: ");
	   				ciudad = sc.next();
	   				ayuntamiento.setCiudad(ciudad);
	   				
	   				System.out.println("\nDatos del AYUNTAMIENTO de " + ayuntamiento.getCiudad());
	   				System.out.println("\nCiudad: " + ayuntamiento.getCiudad());
	   				System.out.println("\nCalle: " + ayuntamiento.getCalle());
	   				System.out.println("\nTelefono: " + ayuntamiento.getTelefono());
	          break;
	       case 'E':
	       case 'e':
	    	   System.out.print("\nHAS ELEGIDO EspacioPublico ");
	    	   System.out.print("\n***********************************************************************************");
	    	   		String calle2,ciudad2,nombre;
	    	   		Integer telefono2;

	    	   		EspacioPublico espacio = new EspacioPublico();

	    	   		System.out.print("\ningresa el nombre del Espacio Publico: ");
	    	   		nombre = sc.next();
	    	   		espacio.setNombre(nombre);
	    	   		
	    	   		System.out.print("\ningresa la ciudad del Espacio Publico: ");
	    	   		ciudad2 = sc.next();
	    	   		espacio.setCiudad(ciudad2);

	    	   		System.out.print("\ningresa la calle del Espacio Publico: ");
	    	   		calle2 = sc.next();
	    	   		espacio.setCalle(calle2);

	    	   		
	    	   				
	    	   		System.out.println("\nDatos del ESPACIO PUBLICO " );
	    	   		System.out.println("\nNombre: " + espacio.getNombre());
	    	   		System.out.println("\nCiudad: " + espacio.getCiudad());
	    	   		System.out.println("\nCalle: " + espacio.getCalle());
	          break;
	       case 'I':
	       case 'i':
	    	   System.out.print("\nHAS ELEGIDO Inmueble ");
	    	   System.out.print("\n***********************************************************************************");
	    	   		String calle1,ciudad1;

	    	   		Inmueble inmueble = new Inmueble();
	    	   		
	    	   		System.out.print("\ningresa la ciudad del Espacio Publico: ");
	    	   		ciudad1 = sc.next();
	    	   		inmueble.setCiudad(ciudad1);

	    	   		System.out.print("\ningresa la calle del Espacio Publico: ");
	    	   		calle1 = sc.next();
	    	   		inmueble.setCalle(calle1);

	    	   				
	    	   		System.out.println("\nDatos del INMUEBLE " );
	    	   		System.out.println("\nCiudad: " + inmueble.getCiudad());
	    	   		System.out.println("\nCalle: " + inmueble.getCalle());
	          break;
	       case 'H':
	       case 'h':
	    		System.out.print("\nHAS ELEGIDO Habitante ");
	    		System.out.print("\n***********************************************************************************");

	    		String nombrefichero = "censo.txt";
	    		String ruta ="/home/zubiri/elecciones";
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
	          break;
	       case 'P':
	       case 'p':
	    	   System.out.print("\nHAS ELEGIDO PARTIDO ");
	    	   System.out.print("\n***************************************************");

	    	   String nombrefichero1 = "listapartidos.txt";
	    	   String ruta1 ="/home/zubiri/elecciones";
	    	   ArrayList<Partido> partidos = new ArrayList<Partido>();

	    	   //Instanciamos el fichero donde estan los datos
	    	   File archivo1 = new File(ruta1, nombrefichero1);
	    	   Scanner s1 = null;
	    	   try {
	    	   	// Leemos el contenido del fichero
	    	   	System.out.println("... Leemos el contenido del fichero ...");
	    	   	s1 = new Scanner(archivo1);
	    	   	// Obtengo los datos de los partidos de fútbol del fichero
	    	   	while (s1.hasNextLine()){
	    	   		String linea = s1.nextLine();	// Obtengo una linea del fichero (un partido de fútbol)
	    	   		String [] cortarString = linea.split(" , ");		// Obtengo los datos del partido de futbol
	    	   		Partido partidose = new Partido();	// Creo un objeto de la clase "PartidoFutbol"

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
	    	   			if (s1 != null)
	    	   				s1.close();
	    	   		} catch (Exception e2) {
	    	   			e2.printStackTrace();
	    	   		}
	    	   	}
	          break;
	       default:
	           System.out.println("no has elegido la letra correcta" );
	           break;
	          
	
	}
	}
	
}
