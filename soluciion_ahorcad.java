package snippet;

import java.util.Scanner;

public class soluciion {
  
	public static void main ( Strings [] args) {
		
		int intentos=0;// intentos antes de llegar a 9;
		char letras= ' '; //letra usada en cada intento
		char[][]palabra; // palabra a acertar 
		char[] letres; // letres no acertadas 
		boolean seguir=true; // para poder seguir el while 
		ahorcado prog= new ahorcado();
		
		prog.pidePalabra();
		while (seguir) {
			prog.imprimirEstado(palabra,letras,intentos);
		}
	}
	
	/*
	 * pedirPalabra 
	 * el metodo pedira la palabra que usaremos por el programa y iniciara el array que retornara
	 * @return array iniciar sin ser ciertos 
	 * 
	 */
	 public char [][] pidePalabra(){
		 // este  metodo pedira al suario y la retornara
	 }
	 
	/*
	 * imprimirEstado
	 * @param palaimpr- array bidimensional por acertar palavra
	 * @param fallos - array char para saber los fallos intentados
	 * @param provado- int y los intentos hechos
	 * 
	 * 
	 */
     public void imprimirEstado(char[][] palaimpr, char [] fallos, int provar ) {
    	 // imprimir por pantalla  guiones o letras , los intentos que has fallado
     }
     
     public char retornavocal() {
    	 String vocales="aeiou";
    	 char [] vocales= {'a','e','i','o','u'}
    	 int alleatoria =(int)(math.random() *5);
    	 
    	 vocales =vocales.charAt(alleatoria);
    	 return vocales;
     }
     retorna una vocal de forma alleatoria entre a,e,i,o,u.
     @return char nomas retonara un vocal aleatoria		 
}

    
      