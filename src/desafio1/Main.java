package desafio1;

public class Main {
    public static void main(String[] args) {
        CadenaDeTiendas cadenaDeTiendas = new CadenaDeTiendas();

        cadenaDeTiendas.crearTiendas();
        cadenaDeTiendas.crearProductos();

        cadenaDeTiendas.mostrarTiendas();
        cadenaDeTiendas.mostrarProductos();

        System.out.println(" ");

        cadenaDeTiendas.agregarProductos();

        cadenaDeTiendas.mostrarTiendas();
        cadenaDeTiendas.mostrarStockGeneral();
        cadenaDeTiendas.venta();
        cadenaDeTiendas.mostrarStockGeneral();
    }
}
