package poker.java;

import java.util.Random;

public class poker {
 

public int [][] barajacartas(){
	int [][] cartas = new int [52][2];
		
		for (int i=0; i<4;i++) {
			for(int j=0; j<13;j++) {
				
				cartas[(i*13)+j][0] =i+1;
				cartas[(i*13)+j][1] =i+1;
			
			}
			
		}
	     return cartas;    
	     
}

public  int [][]baraja(int baraja){
	Random random = random Random() { 
		for (int i = baraja.length-1; i>0;i--);
		int j = (int)(Math.random()*(i+1));
		int []temp = baraja[i];
		baraja [i]= baraja [j];
		baraja [j]= temp;
		
	return baraja;
	}
}

public int [][] escapasa(int[][]baraja){
	int postal =(int)(Math.random()*51);
	int[][] comodin=new int [postal] [2];
	
	for (int i=0; i<= postal;i++) {
		comodin[i][0]=baraja[i][0];
		comodin[i][1]=baraja[i][1];
		
	}
	for(int i=postal+1;i<=51;i++) {
		baraja[i-postal+1][0]=baraja[i][0];
		baraja[i-postal+1][1]=baraja[i][1];
	}
	
	for(int i=51; i>=(51-postal); i--) {
		baraja[i][0]=comodin[postal][0];
		baraja[i][1]=comodin[postal][1];
		
	}
	
	return baraja;
}

System.out.println("el punto de inicio es :" + postal);




}
