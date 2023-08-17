package ejercicioExtra2.entidades;

public class Espectador {
    private String nombre;
    private int edad;
    private double dineroDisponible;

    public Espectador(String nombre, int edad, double dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }

    @Override
    public String toString() {
        return "Espectador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dineroDisponible=" + dineroDisponible +
                '}';
    }
}
