package ejercicio1.entidades;

import ejercicio1.enumeradores.razaPerros;

public class Perro {

    private String nombre;

    private razaPerros raza;

    private int edad;

    private String tamanio;

    private Persona duenio;

    public Perro() {
    }

    public Perro(String nombre, razaPerros raza, int edad, String tamanio, Persona duenio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.duenio = duenio;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public razaPerros getRaza() {
        return raza;
    }

    public void setRaza(razaPerros raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
    
    
}
