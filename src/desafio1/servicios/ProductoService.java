package desafio1.servicios;

import desafio1.entidades.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void crearProducto(ArrayList<Producto> productos){
        Producto producto1 = new Producto();
        System.out.println("Ingrese el ID del producto");
        producto1.setId(scanner.nextInt());
        System.out.println("Ingrese el nombre del producto");
        producto1.setNombre(scanner.next());
        System.out.println("Ingrese el precio del producto");
        producto1.setPrecio(scanner.nextInt());

        productos.add(producto1);
    }
    public void crearProducto(ArrayList<Producto> productos,int id, String nombre, int precio, int stock){
        productos.add(new Producto(id,nombre,precio,stock));
    }
    public void mostrarProductos(ArrayList<Producto> productos){
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    public void modificarProducto(ArrayList<Producto> productos, Producto producto){
        //Recorre los productos
        for (Producto producto1 : productos) {
            //Ubica el producto
            if (producto1.equals(producto)){
                System.out.println("¿Cuál valor desea modificar del producto?");
                System.out.println("1.-  ID");
                System.out.println("2.-  Nombre");
                System.out.println("3.-  Precio");
                int opc = scanner.nextByte();
                if (opc==1){
                    System.out.println("Ingrese el nuevo ID");
                    producto.setId(scanner.nextInt());
                    break;
                } else if (opc==2) {
                    System.out.println("Ingrese el nuevo nombre");
                    producto.setNombre(scanner.next());
                    break;
                } else if (opc==3) {
                    System.out.println("Ingrese el nuevo precio");
                    producto.setId(scanner.nextInt());
                    break;
                } else{
                    System.out.println("Valor inválido");
                    break;
                }
            }
        }

    }
    public void eliminarProducto(ArrayList<Producto> productos, Producto producto){
        //Recorre los productos
        for (Producto producto1 : productos) {
            //Ubica el producto
            if (producto1.equals(producto)){
                productos.remove(producto1);
                break;
            }
        }
    }
}
