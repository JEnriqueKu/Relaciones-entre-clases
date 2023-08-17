package ejercicioExtra2.entidades;

import java.util.Arrays;

public class Cine {
    private Sala[] salas;
    private double precioEntrada;
    private Pelicula[] peliculas = new Pelicula[5];

    public Cine(){

    }

    public Cine( int numeroSalas, double precioEntrada) {
        this.salas = new Sala[numeroSalas];
        this.precioEntrada = precioEntrada;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    @Override
    public String toString() {
        return "Cine{" +
                "salas=" + Arrays.toString(salas) +
                ", precioEntrada=" + precioEntrada +
                '}';
    }
}
