package Ra5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lectura {

	public static void main (String [] args) {
	
		try {
			File archivo = new File ("test.txt");
			Scanner lectura=new Scanner(archivo);
		//while (lectura.hasNextLine()){
			System.out.println(lectura.nextLine());
		//}
			lectura.close();
			System.out.println("lectura realizada.");
		}
		catch(FileNotFoundException e) {
			System.out.println("excepcion: " + e.toString());
      }
	}
}

