package ejercicio3.entidades;

import ejercicio3.enums.Palo;

public class Carta {
    private Integer numero;
    private Palo palo;
    private Boolean dentro;

    public Carta() {
    }

    public Carta(Integer numero, Palo palo, Boolean dentro) {
        this.numero = numero;
        this.palo = palo;
        this.dentro = dentro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Boolean getDentro() {
        return dentro;
    }

    public void setDentro(Boolean dentro) {
        this.dentro = dentro;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "numero=" + numero +
                ", palo=" + palo +
                ", dentro=" + dentro +
                '}';
    }
}
