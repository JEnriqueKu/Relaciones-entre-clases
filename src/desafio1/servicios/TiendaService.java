package desafio1.servicios;

import desafio1.entidades.Producto;
import desafio1.entidades.Tienda;

import java.util.ArrayList;
import java.util.Scanner;

public class TiendaService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void crearTienda(ArrayList<Tienda> tiendas){
        Tienda tienda1 = new Tienda();
        System.out.println("Ingrese la dirección de la tienda");
        tienda1.setDireccion(scanner.next());
        System.out.println("Ingrese el representante de la tienda");
        tienda1.setRepresentanteTienda(scanner.next());

        tiendas.add(tienda1);
    }
    public void crearTienda(ArrayList<Tienda> tiendas, Integer id, String direccion, String representante){
        tiendas.add(new Tienda(id,direccion,representante));
    }
    public void mostrarTiendas(ArrayList<Tienda> tiendas){
        for (Tienda tienda : tiendas) {
            System.out.println(tienda);
        }
    }
    public void modificarTienda(ArrayList<Tienda> tiendas, Tienda tienda){
        //Recorre las tiendas
        for (Tienda tienda1 : tiendas) {
            //Ubica la tienda
            if (tienda1.equals(tienda)){
                System.out.println("¿Cuál valor desea modificar del tienda?");
                System.out.println("1.-  Dirección");
                System.out.println("2.-  Nombre");
                int opc = scanner.nextByte();
                if (opc==1){
                    System.out.println("Ingrese la nueva dirección");
                    tienda.setDireccion(scanner.next());
                    break;
                } else if (opc==2) {
                    System.out.println("Ingrese el nuevo/a representante de la tienda");
                    tienda.setRepresentanteTienda(scanner.next());
                    break;
                } else{
                    System.out.println("Valor inválido");
                    break;
                }
            }
        }

    }
    public void eliminarTienda(ArrayList<Tienda> tiendas, Tienda tienda){
        //Recorre las tiendas
        for (Tienda tienda1 : tiendas) {
            //Ubica la tienda
            if (tienda1.equals(tienda)){
                tiendas.remove(tienda1);
                break;
            }
        }
    }

    public void agregarProducto(Tienda tienda, Producto producto, int stock){
        producto.setStock(stock);
        tienda.getProductos().add(producto);
    }
    public void venderProductos(Tienda tienda, Producto producto, int cantidad){
        /*for (Producto tiendaProducto : tienda.getProductos()) {
            if (tiendaProducto.equals(producto)) tiendaProducto.setStock(tiendaProducto.getStock()-cantidad);;
        }
         */
        tienda.getProductos().stream().filter(producto1 -> producto1.equals(producto)).
                forEach(producto1 -> producto1.setStock(producto1.getStock()-cantidad));
    }
    public void eliminarProducto(Tienda tienda, Producto producto){
        tienda.getProductos().remove(producto);
    }
    public int stockProducto(Tienda tienda, Producto producto){
        return tienda.getProductos().stream().filter(producto1 -> producto1.equals(producto)).
                map(Producto::getStock).findFirst().get();
    }
    public void mostrarStockGeneral(ArrayList<Tienda> tiendas){
        //Muestra el stock de todas las tiendas de la cadena de tiendas
        for (Tienda tienda : tiendas) {
            System.out.println("Tienda "+tienda.getId());
            for (Producto producto : tienda.getProductos()) {
                System.out.println(producto);
            }
        }
    }
    public void mostrarStockTienda(ArrayList<Tienda> tiendas, int numTienda){
        //Muestra el stock de la tienda indicada
        for (Producto producto : tiendas.get(numTienda).getProductos()) {
            System.out.println(producto);
        }
    }

    public void venta(ArrayList<Tienda> tiendas, int numeroTienda){
        numeroTienda--;
        System.out.println("Estos productos están disponibles");
        mostrarStockTienda(tiendas,numeroTienda);

        System.out.println("¿Qué producto va a vender? (nombre)");
        String producto = scanner.next();
        System.out.println("¿Cuántos productos va a vender?");
        int cantidadVenta = scanner.nextInt();

        if (stockDisponible(tiendas,numeroTienda,producto,cantidadVenta)){
            disminuirStock(tiendas,numeroTienda,producto,cantidadVenta);
        } else System.out.println("No hay stock suficiente");

    }
    public boolean stockDisponible(ArrayList<Tienda> tiendas, int numeroTienda, String producto, int cantidadVenta){
        int stock=0;
        //Recorre los productos dentro de la tienda y al encontrar el producto le da el valor a su stock
        for (Producto producto1 : tiendas.get(numeroTienda).getProductos()) {
            if (producto1.getNombre().equalsIgnoreCase(producto)) stock = producto1.getStock();
        }
        return stock>=cantidadVenta;
    }
    public void disminuirStock(ArrayList<Tienda> tiendas, int numeroTienda, String producto, int cantidadVenta){
        //Recorre los productos dentro de la tienda y al encontrar el producto le resta la cantidad vendida
        for (Producto producto1 : tiendas.get(numeroTienda).getProductos()) {
            if (producto1.getNombre().equalsIgnoreCase(producto)) producto1.setStock(producto1.getStock()-cantidadVenta);
        }
    }
}
