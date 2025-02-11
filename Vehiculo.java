package vehiculo;


	 public class Vehiculo {
	    private String matricula;
	    private String marca;
	    private String modelo;
	    private String tipoCombustible;
	    private int cilindrada;

	    public Vehiculo(String matricula, String marca, String modelo, String tipoCombustible, int cilindrada) {
	        this.matricula = matricula;
	        this.marca = marca;
	        this.modelo = modelo;
	        this.tipoCombustible = tipoCombustible;
	        this.cilindrada = cilindrada;
	    }

	    public String getMatricula() {
	        return matricula;
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public String getTipoCombustible() {
	        return tipoCombustible;
	    }

	    public int getCilindrada() {
	        return cilindrada;
	    }

	    // Setters
	    public void setMatricula(String matricula) {
	        this.matricula = matricula;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public void setTipoCombustible(String tipoCombustible) {
	        this.tipoCombustible = tipoCombustible;
	    }

	    public void setCilindrada(int cilindrada) {
	        this.cilindrada = cilindrada;
	    }

	    
	    public String toString() {
	        return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", tipoCombustible=" + tipoCombustible + ", cilindrada=" + cilindrada + "]";
	    }

	   
	}



