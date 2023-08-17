/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioExtra2Jordan.servicios;



import ejercicioExtra2Jordan.entidades.Cine;
import ejercicioExtra2Jordan.entidades.Espectador;
import ejercicioExtra2Jordan.entidades.Pelicula;
import ejercicioExtra2Jordan.enumeradores.NombresPersonas;

import java.util.Random;

/**
 *
 * @author Jordan
 */
public class CineService {

    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");

    Cine cine = new Cine();
    

    public void asignarAsiento() {
        
        crearCartelera();
        double r = Math.random() * 48;

        System.out.println(r);

        for (int i = 0; i < r; i++) {

            Espectador e1 = crearEspectador();

            System.out.println(e1);

            if (verificarRequisitos(e1)) {
                int fila;
                int columna;

                
                //verifico asiento libre
                do {
                   fila  = (int) (Math.random() * 8);
                   columna = (int) (Math.random() * 6);


                   // La condicion era != no ==
                } while (cine.getSala()[fila][columna] != null);

                cine.setSala(e1, fila, columna);
                
            }else{
                System.out.println(e1 + " no cumple con los requisitos");
            }

        }

    }

    public boolean verificarRequisitos(Espectador e1) {
        return (e1.getEdad() >= (cine.getPelicula().getEdadMinima())) && (e1.getDinero() >= cine.getPrecio());
    }

    public Espectador crearEspectador() {
        NombresPersonas[] nombres = NombresPersonas.values();
        NombresPersonas nombre = nombres[new Random().nextInt(nombres.length)];

        int edad = new Random().nextInt(50) + 10; // Edad entre 10 y 59

        double dinero = new Random().nextDouble() * 50; // Dinero entre 0 y 50

        return new Espectador(nombre.toString(), edad, dinero);

    }

    public void crearCartelera() {
        //completar

        cine.setPelicula(crearPelicula());

        cine.setPrecio(15.55);

    }

    public Pelicula crearPelicula() {

       // System.out.println("Ingresa el titulo de la pelicula");
        //String titulo = leer.next();
        String titulo = "Los Vengadores";

        //System.out.println("Ingresa la duracion de la pelicula");
        //Integer duracion = leer.nextInt();
        Integer duracion = 126;

       // System.out.println("Ingresa la edad minima de la pelicula");
        //Integer edadMinima = leer.nextInt();
        Integer edadMinima = 12;

       // System.out.println("Ingresa el director de la pelicula");
        //String director = leer.next();
        String director = "Josh Brolin";

        return new Pelicula(titulo, duracion, edadMinima, director);

    }

    public void mostrarSala() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                // Cambia la columna por letras
                char letra = switch (j) {
                    case 0 -> 'A';
                    case 1 -> 'B';
                    case 2 -> 'C';
                    case 3 -> 'D';
                    case 4 -> 'E';
                    case 5 -> 'F';
                    default -> ' ';
                };

                if (cine.getSala()[i][j] == null) {
                    System.out.print("|"+(8-i) + "" + letra + "   |");
                } else {
                    System.out.print("|"+(8-i) + "" + letra + " X |");
                }
            }
            System.out.println();
        }

    }
}
