package ejercicio2;

public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" +
                "posicionActual=" + posicionActual +
                ", posicionAgua=" + posicionAgua +
                '}';
    }

    public void llenarRevolver(RevolverDeAgua r){
        int posicionActual = (int) (Math.random()*6)+1;
        r.setPosicionActual(posicionActual);
        System.out.println(r.getPosicionActual());
        int posicionAgua = (int) (Math.random()*6)+1;
        r.setPosicionAgua(posicionAgua);
        System.out.println(r.getPosicionAgua());
    }

    public boolean mojar(){
        return getPosicionAgua() == getPosicionActual();
    }

    public void siguienteChorro(){

        if (getPosicionActual() == 6){
            setPosicionActual(1);
        } else {
            setPosicionActual(getPosicionActual() + 1);
        }
    }

    public void mostrarRevolver(){
        System.out.println(toString());
    }
}
