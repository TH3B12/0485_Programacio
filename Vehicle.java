package vehiculo;

public class Vehicle {
	
	    private String matricula;
	    private String marca;
	    private String modelo;
	    private String tipoCombustible;
	    private int cilindrada;

	    public Vehicle(String matricula, String marca, String modelo, String tipoCombustible, int cilindrada) {
	        this.matricula = matricula;
	        this.marca = marca;
	        this.modelo = modelo;
	        this.tipoCombustible = tipoCombustible;
	        this.cilindrada = cilindrada;
	    }

	  
	    public String toString() {
	        return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", tipoCombustible=" + tipoCombustible + ", cilindrada=" + cilindrada + "]";
	    }
	}

	class Coche extends Vehiculo {
	    private int numeroPuertas;
	    private boolean adblue;

	    public Coche(String matricula, String marca, String modelo, String tipoCombustible, int cilindrada, int numeroPuertas, boolean adblue) {
	        super(matricula, marca, modelo, tipoCombustible, cilindrada);
	        this.numeroPuertas = numeroPuertas;
	        this.adblue = adblue;
	    }


	    public String toString() {
	        return super.toString() + ", Coche [numeroPuertas=" + numeroPuertas + ", adblue=" + adblue + "]";
	    }
	}

	class Camion extends Vehiculo {
	    private int numeroEjes;
	    private String tipoRemolque;

	    public Camion(String matricula, String marca, String modelo, String tipoCombustible, int cilindrada, int numeroEjes, String tipoRemolque) {
	        super(matricula, marca, modelo, tipoCombustible, cilindrada);
	        this.numeroEjes = numeroEjes;
	        this.tipoRemolque = tipoRemolque;
	    }

	    public String toString() {
	        return super.toString() + ", Camion [numeroEjes=" + numeroEjes + ", tipoRemolque=" + tipoRemolque + "]";
	    }
	}

	class Motocicleta extends Vehiculo {
	    private int numeroTiempos;
	    private boolean caballeteCromado;

	    public Motocicleta(String matricula, String marca, String modelo, String tipoCombustible, int cilindrada, int numeroTiempos, boolean caballeteCromado) {
	        super(matricula, marca, modelo, tipoCombustible, cilindrada);
	        this.numeroTiempos = numeroTiempos;
	        this.caballeteCromado = caballeteCromado;
	    }

	    public String toString() {
	        return super.toString() + ", Motocicleta [numeroTiempos=" + numeroTiempos + ", caballeteCromado=" + caballeteCromado + "]";
	    }
	}

	
	

	

