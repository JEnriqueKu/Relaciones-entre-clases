package desafio1;

import desafio1.comparators.Comparators;
import desafio1.entidades.Producto;
import desafio1.entidades.Tienda;
import desafio1.servicios.ProductoService;
import desafio1.servicios.TiendaService;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class CadenaDeTiendas {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    TiendaService tiendaService = new TiendaService();
    ProductoService productoService = new ProductoService();

    private ArrayList<Tienda> tiendas = new ArrayList<>();
    private ArrayList<Producto> productos = new ArrayList<>();

    public void crearTiendas(){
        tiendaService.crearTienda(tiendas,1,"Mérida Centro","J.P.");
        tiendaService.crearTienda(tiendas,2,"Mérida Juan Pablo","C.J.");
        tiendaService.crearTienda(tiendas,3,"Mérida Francisco de Montejo","B.P.");
    }
    public void crearProductos(){
        productoService.crearProducto(productos,1,"Arroz",6,0);
        productoService.crearProducto(productos,2,"frijol",8,0);
        productoService.crearProducto(productos,3,"Azucar",12,0);
        productoService.crearProducto(productos,4,"Lentejas",5,0);
        productoService.crearProducto(productos,5,"Tomate",4,0);
        productoService.crearProducto(productos,6,"Cebolla",5,0);
        productoService.crearProducto(productos,7,"Manzana",12,0);
        productoService.crearProducto(productos,8,"Sandia",15,0);
        productoService.crearProducto(productos,9,"Jabon",10,0);
        productoService.crearProducto(productos,10,"Shampoo",17,0);
        productoService.crearProducto(productos,11,"Papel",15,0);
        productoService.crearProducto(productos,12,"Pan",6,0);
        productoService.crearProducto(productos,13,"Agua",30,0);
        productoService.crearProducto(productos,14,"Aceite",27,0);
        productoService.crearProducto(productos,15,"Leche",29,0);
    }
    public void mostrarTiendas(){
        tiendaService.mostrarTiendas(tiendas);
    }
    public void mostrarProductos(){
        productoService.mostrarProductos(productos);
    }

    public void agregarProductos(){
        tiendaService.agregarProducto(tiendas.stream().toList().get(0),productos.stream().toList().get(5),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(0),productos.stream().toList().get(8),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(0),productos.stream().toList().get(7),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(0),productos.stream().toList().get(9),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(0),productos.stream().toList().get(0),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(1),productos.stream().toList().get(5),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(1),productos.stream().toList().get(1),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(1),productos.stream().toList().get(12),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(1),productos.stream().toList().get(14),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(1),productos.stream().toList().get(2),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(2),productos.stream().toList().get(4),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(2),productos.stream().toList().get(3),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(2),productos.stream().toList().get(10),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(2),productos.stream().toList().get(14),15);
        tiendaService.agregarProducto(tiendas.stream().toList().get(2),productos.stream().toList().get(6),15);
    }
    public void mostrarStockGeneral(){
        tiendaService.mostrarStockGeneral(tiendas);
    }

    public void venta(){
        System.out.println("¿En que tienda va a realizar la venta?");
        int numeroTienda=scanner.nextByte();

        tiendaService.venta(tiendas,numeroTienda);
    }

}
