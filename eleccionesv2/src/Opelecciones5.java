import java.util.Scanner;

import com.zubiri.elecciones.*;


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
	    			
	    		
	    		
	    		Habitante.imprimir_censo();
	    		
	          break;
	       case 'P':
	       case 'p':
	    	   System.out.print("\nHAS ELEGIDO PARTIDO ");
	    	   System.out.print("\n***************************************************");

	    	       	   
	    	   Partido.imprimir_partido();
	    	   
	          break;
	       default:
	           System.out.println("no has elegido la letra correcta" );
	           break;
	          
	
	}
	}
	
}
