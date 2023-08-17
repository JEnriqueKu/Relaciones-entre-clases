package ejercicioExtra2.service;

import ejercicioExtra2.entidades.Cine;
import ejercicioExtra2.entidades.Espectador;
import ejercicioExtra2.entidades.Pelicula;
import ejercicioExtra2.entidades.Sala;

import java.util.Random;
import java.util.Scanner;

public class CineService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    Random r = new Random();
    Cine cine = new Cine(8,30);

    public void crearPeliculas(){
        Pelicula it = new Pelicula("It", 120,18,"Manuel");
        Pelicula barbie = new Pelicula("Barbie", 140,15,"Enrique S");
        Pelicula flash = new Pelicula("Flash",80,14,"Sam");
        Pelicula avatar = new Pelicula("Avatar",200,15,"Cameron");
        Pelicula north = new Pelicula("Northman",160,18,"EEE");
        cine.getPeliculas()[0]=it;
        cine.getPeliculas()[1]=barbie;
        cine.getPeliculas()[2]=flash;
        cine.getPeliculas()[3]=avatar;
        cine.getPeliculas()[4]=north;
    }

    public void crearSalas(){
        for (int i = 0; i < cine.getSalas().length; i++) {
            cine.getSalas()[i]=llenarSala();
        }
    }

    public Sala llenarSala(){
        Sala sala = new Sala();

        int pelicula = r.nextInt(cine.getPeliculas().length);
        // Setea una pelicula al azar
        sala.setPelicula(cine.getPeliculas()[pelicula]);

        //Crea espectadores y los agrega a la sala

        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {

                int azar = r.nextInt(3)+1;

                if (azar>1){
                    int edad = r.nextInt(66)+15;
                    double dinero = r.nextInt(201);
                    String nombre = "Espectador " + (i+j);

                    if (sala.getPelicula().getEdadMinima()<edad && cine.getPrecioEntrada()<dinero){

                        sala.getEspectadores()[i][j] = new Espectador(nombre,edad,dinero);

                    }

                }
            }
        }
        return sala;
    }

    public void mostrarSala(){
        // menssaje
        String peliculasSalas = "";
        for (int i = 0; i < cine.getSalas().length; i++) {
            peliculasSalas += cine.getSalas()[i].getPelicula().getTitulo() + " ";
        }
        // Pregunta que sala se quiere mostrar
        System.out.println("En el cine hay " + cine.getSalas().length + " salas" +
                "("+ peliculasSalas +")");
        System.out.println("¿Cual sala desea mostrar?");
        int n = scanner.nextInt();

        //muestra el título
        System.out.println(cine.getSalas()[n-1].getPelicula().getTitulo());

        // muestra la tabla
        for (int i = 0; i < 8; i++) {
            System.out.println(" ");
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

                if (cine.getSalas()[n-1].getEspectadores()[i][j]==null){
                    System.out.print("|"+(8-i) + "" + letra + "   |");
                } else System.out.print("|"+(8-i) + "" + letra + " X |");
            }
        }
    }

    public void simulacion(){
        crearPeliculas();
        crearSalas();
        mostrarSala();
    }
}
