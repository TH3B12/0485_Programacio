package herencia;

public class mainpersona {

	public static void main (String[] args) {
	persona persona = new persona( String nom ,int año);
	  trabajador trabajador= new trabajador (String especialidad, int sueldo);
		
		System.out.print(persona.tostring());
		System.out.print(trabajador.toString());
   } 
}


