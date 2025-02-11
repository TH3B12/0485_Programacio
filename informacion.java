package figuras;
	
		public class informacion {
		    public static void main(String[] args) {
		    
		        Forma cuadrado = new Forma("cuadrado", "amarillo", "cerca roja");
		        Forma triangulo = new Forma("Triangulo superior", "Verde", "cerca negra");
		        Forma circulo = new Forma("circulo dorado", "Negro", "cerca fucsia");

		        
		        cuadrado.imprimirInformacio();
		        System.out.println();
		        triangulo.imprimirInformacio();
		        System.out.println();
		        circulo.imprimirInformacio();
		    }
		}

	

