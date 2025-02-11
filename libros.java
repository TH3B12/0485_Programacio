package PObjectes;

 
	class Libro {
	    public String titulo;
	    public String autor;
	    public String codigo;

	    
	    public Libro(String titulo, String autor, String codigo) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.codigo = codigo;
	    }

	    public String toString() {
	        return "Título: " + titulo + "Autor: " + autor + "Codigo: " + codigo;
	    }
	}

	public class libros {
	    public static void main(String[] args) {
	       
	        Libro libro1 = new Libro("alicia en el país de las maravillas", "Lewis Carroll", "89988675");
	        Libro libro2 = new Libro("la vuelta al mundo en ochenta dias", "lulio verne", "333929947");
	        

	        System.out.println(libro1.toString());
	        System.out.println(libro2.toString());
	        
	        
	        		
	    }
	}


	



