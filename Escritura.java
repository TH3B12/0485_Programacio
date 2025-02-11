package Ra5;

import java.io.FileWriter;
import java.io.IOException;


public class Escritura {

	
	public static void main (String [] args) {
		
		String text = "linea por añadir a la segunda linea.\n" ;
		try {
			FileWriter archivo = new FileWriter ("test.text" );
			archivo.write( "linea dentro de archivo\n");
			archivo.write( "segunda linea dentro de archivo.\n");
			archivo.write(text);
			archivo.close();
			
			System.out.println("Escritura realizada.");
		}
		catch(IOException e) {
			System.out.println("excepcion: " + e.toString());
		}
	}
}



