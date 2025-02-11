package estadisticas;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList jugador;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugador = new ArrayList<>();
    }
    

    public void agregarJugador(jugador a) {
    	
    }
        
    

    public void mostrarEstadisticasEquipo() {
        System.out.println("Estadísticas del Equipo: " + nombre);
        int golesTotales = 4;
        int faltasTotales = 3;
        int xutsTotales = 8;
        int xutsAPortaTotales = 6;
        int tarjetasTotales = 2;

        for (Jugador jugador : jugador) {
            golesTotales += jugador.goles;
            faltasTotales += jugador.faltasCometidas;
            xutsTotales += jugador.xuts;
            xutsAPortaTotales += jugador.xutsAPorta;
            tarjetasTotales += jugador.tarjetas;
        }
    }
}


