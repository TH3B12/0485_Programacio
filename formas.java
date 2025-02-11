package figuras;


	class Forma {
	    private String nom;
	    private String colorIntern;
	    private String colorVora;

	    public Forma(String nom, String colorIntern, String colorVora) {
	        this.nom = nom;
	        this.colorIntern = colorIntern;
	        this.colorVora = colorVora;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public String getColorIntern() {
	        return colorIntern;
	    }

	    public String getColorVora() {
	        return colorVora;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public void setColorIntern(String colorIntern) {
	        this.colorIntern = colorIntern;
	    }

	    public void setColorVora(String colorVora) {
	        this.colorVora = colorVora;
	    }

	    public void imprimirInformacio() {
	        System.out.println("Forma: " + nom);
	        System.out.println("Color Intern: " + colorIntern);
	        System.out.println("Color de Vora: " + colorVora);
	    }
	}
	
	
	


