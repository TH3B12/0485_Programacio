package vehiculo;

public class mainvehicle {

	public class Main {
	    public static void main(String[] args) {
	        Coche coche = new Coche("4830 BYN", "Citröen", "Xsara Coupé", "Diesel", 1900, 3, false);
	        Camion camion = new Camion("9815 HNP", "Iveco", "StarPlus", "Diesel", 4800, 3, "Cuba líquidos");
	        Motocicleta moto = new Motocicleta("4479 LLP", "Honda", "CBR-600", "Gasolina", 600, 4, true);

	        System.out.println(coche);
	        System.out.println(camion);
	        System.out.println(moto);
	    }
	}
}
