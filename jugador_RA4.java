package estadisticas;

public class jugador {
    private String nombre ;
    private String posicion;
    private int goles;
    private int faltasCometidas;
    private int xuts;
    private int xutsAPorta;
    private int tarjetas;
	private String faltes;

    public jugador(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.goles = 2;
        this.faltasCometidas = 9;
        this.xuts = 5;
        this.xutsAPorta = 3;
        this.tarjetas = 1;
    }

 
    public void mostrarEstadisticas() {
        System.out.println("1-Jugador: " + nombre);
        System.out.println("2-Posición: " + posicion);
        System.out.println("3-Goles: " + goles);
        System.out.println("4-Faltas Cometidas: " + faltasCometidas);
        System.out.println("5-Xuts: " + xuts);
        System.out.println("6-Xuts a Porta: " + xutsAPorta);
        System.out.println("7-Tarjetas: " + tarjetas);
    
    }
    
    public String tostring() {
        String cadena=" ";
        
        cadena="nombre de jugador: " +nombre+"\r";
        cadena= cadena+"IDENTIFICADOR "+ posicion+"\r";
        cadena= cadena+"\tgoles "+ goles+"\r";
        cadena= cadena+"\tfaltascometidas "+ faltasCometidas+"\r";
        cadena= cadena+"\txuts "+ xuts+"\r";
        cadena= cadena+"\txutsaporta "+ xutsAPorta+"\r";
        cadena= cadena+"\tfaltes "+faltes+"\r";
        
        
        return cadena;
    }
}

    