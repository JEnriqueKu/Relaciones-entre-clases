package ejercicio3.services;

import ejercicio3.entidades.Baraja;
import ejercicio3.entidades.Carta;
import ejercicio3.enums.Palo;

import java.util.ArrayList;
import java.util.Collections;

public class BarajaService {

    Baraja baraja = new Baraja();

    public void crearBaraja(){
        for (int i = 1; i < 13; i++) {
            for (Palo palo : Palo.values()) {
                if (i!=8&&i!=9){
                    baraja.getCartas().add(new Carta(i,palo,true));
                }
            }
        }
    }

    public void barajar(){
        Collections.shuffle(baraja.getCartas());
    }

    public void mostrarBaraja(){
        int contador = 0;
        for (Carta carta : baraja.getCartas()) {
            if (carta.getDentro().equals(true)){
                System.out.println(carta);
                contador++;
            }
        }

        if (contador==0) System.out.println("No hay cartas en la baraja");
    }

    public Carta siguienteCarta(){
        for (Carta carta : baraja.getCartas()) {
            if (carta.getDentro().equals(true)) return carta;
        }
        System.out.println("No hay cartas disponibles");
        return null;
    }

    public ArrayList<Carta> darCartas(int cartasPedidas){
        ArrayList<Carta> cartasParaDar = new ArrayList<>();
        if (cartasPedidas<=cartasDisponibles()){
            int contador=0;
            do {
                if (baraja.getCartas().get(contador).getDentro().equals(true)){
                    baraja.getCartas().get(contador).setDentro(false);
                    cartasParaDar.add(baraja.getCartas().get(contador));
                    contador++;
                }
            } while (contador<cartasPedidas);
            return cartasParaDar;
        }
        System.out.println("No hay suficientes cartas");
        return null;
    }

    public int cartasDisponibles(){
        int contador = 0;
        for (Carta carta : baraja.getCartas()) {
            if (carta.getDentro().equals(true)) contador++;
        }
        return contador;
    }

    public void mostrarMonton(){
        int contador = 0;
        for (Carta carta : baraja.getCartas()) {
            if (carta.getDentro().equals(false)){
                System.out.println(carta);
                contador++;
            }
        }

        if (contador==0) System.out.println("No hay cartas en el monton");
    }
}
