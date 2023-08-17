package ejercicioExtra2.entidades;

import java.util.Arrays;

public class Sala {
    private Espectador[][] espectadores = new Espectador[8][6];
    private Pelicula pelicula;


    public Espectador[][] getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(Espectador[][] espectadores) {
        this.espectadores = espectadores;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "espectadores=" + Arrays.toString(espectadores) +
                ", pelicula=" + pelicula +
                '}';
    }
}
