package ejercicioExtra2Jordan.entidades;


import java.util.Arrays;

public class Cine {
    private Pelicula pelicula;
    private Double precio;
    private Espectador[][] sala = new Espectador[8][6];
  
    public Cine() {
    }

    public Cine(Pelicula pelicula, Double precio) {
        this.pelicula = pelicula;
        this.precio = precio;
        
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Espectador[][] getSala() {
        return sala;
    }

    public void setSala(Espectador espectador, int fila, int columna) {
        this.sala[fila][columna] = espectador;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", precio=" + precio + ", sala=" + Arrays.deepToString(sala).replace("], ", "]\n").replace("[","").replace("]","");
    }
    
    
    
}
