package Ra5;

import java.io.File;
import java.io.IOException;

public class Creacion {

	public static void main (String [] args) {
	
	try {
		File archivo = new File (pathname "test.txt");
		System.out.println(archivo.getAbsolutePath());
		
		System.out.println("hemos podido crear un archivo"+ archivo.createNewFile());
	}
		catch(IOException e) {
			System.out.println("excepcion: " + e.toString());
		}
	}
}


	
	

