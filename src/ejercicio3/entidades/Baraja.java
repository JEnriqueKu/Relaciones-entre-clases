package ejercicio3.entidades;

import java.util.ArrayList;

public class Baraja {
    ArrayList<Carta> cartas = new ArrayList<>();

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return cartas.toString();
    }
}
