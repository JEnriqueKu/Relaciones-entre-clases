package ejercicioExtra4.servicios;

import ejercicioExtra4.entidades.Alumno;
import ejercicioExtra4.entidades.Voto;

import java.util.*;

import static ejercicioExtra4.comparators.Comparators.compararCantidadVotos;

public class Simulador {
    Voto voto = new Voto();
    Alumno alumno = new Alumno();
    Random random = new Random();
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    HashSet<Voto> votos = new HashSet<>();
    HashSet<Alumno> alumnos = new HashSet<>();

    public HashSet<String> crearNombres(){
        HashSet<String> nombres = new HashSet<>();
        HashSet<String> apellidos = new HashSet<>();
        HashSet<String> alumnosCreados = new HashSet<>();

        nombres.add("Enrique");
        nombres.add("Julian");
        nombres.add("Ramón");
        nombres.add("Carlos");
        nombres.add("Jordan");
        nombres.add("Cristian");
        nombres.add("Omar");
        nombres.add("Lilia");
        nombres.add("Brenda");
        nombres.add("Juan");
        nombres.add("Miguel");
        nombres.add("Luis");
        nombres.add("Felipe");
        nombres.add("Federico");
        apellidos.add("Marin");
        apellidos.add("Diaz");
        apellidos.add("España");
        apellidos.add("Contreras");
        apellidos.add("Ku");
        apellidos.add("Medina");
        apellidos.add("Yam");
        apellidos.add("Piña");
        apellidos.add("Gomez");
        apellidos.add("Fernandez");
        apellidos.add("Pacheco");
        apellidos.add("Montejo");
        apellidos.add("Garcia");
        apellidos.add("Lopez");
        apellidos.add("Alvarado");
        apellidos.add("Sanchez");
        apellidos.add("Jimenez");
        apellidos.add("Espinoza");

        for (int i = 0; i < 100; i++) {
            int nombreAzar = random.nextInt(nombres.size());
            int apellidoAzar = random.nextInt(apellidos.size());

            String nombreCompleto = nombres.stream().toList().get(nombreAzar)+ " "+ apellidos.stream().toList().get(apellidoAzar);

            alumnosCreados.add(nombreCompleto);
        }
        return alumnosCreados;
    }

    public HashSet<Integer> crearDnis(){
        HashSet<Integer> Dnis = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            Dnis.add(random.nextInt(900000) + 100000);
        }
        return Dnis;
    }

    public HashSet<Alumno> crearAlumnos(HashSet<String> nombres, HashSet<Integer> dnis){
        System.out.println("Cuantos alumnos desea crear (minimo 10)");
        int numAlumnos = scanner.nextInt();
        HashSet<Alumno> alumnos = new HashSet<>();

        for (int i = 0; i < numAlumnos; i++) {
            //Asigna un nombre al azar
            int nombreCompletoAzar = random.nextInt(nombres.size());
            int dniAzar;
            boolean creado;

            do {
                //asigna un DNI al azar
                dniAzar = random.nextInt(dnis.size());
                creado = alumnos.add(new Alumno(nombres.stream().toList().get(nombreCompletoAzar),
                        dnis.stream().toList().get(dniAzar), 0, null));
            }while (!creado); //Hasta que el DNI asignado no se repita

        }
        return alumnos;
    }

    public void mostrarAlumnos(HashSet<Alumno> alumnos){
        for (Alumno alumno1 : alumnos) {
            System.out.println(alumno1);
        }
    }

    public void votacion(HashSet<Alumno> alumnos){
        int alumnoAzar;

        for (Alumno alumno1 : alumnos) {
            int posicionAlumnoActual=alumnos.stream().toList().indexOf(alumno1);

            alumno1.setVoto(new Voto());
            alumno1.getVoto().setAlumno(alumno1);
            //Para validar si el alumno se agregó a la lista (se consiguió votar por el)
            boolean agregado;

            for (int i = 0; i < 3; i++) {
                //Valida que no se vote por la misma persona
                do {
                    //Valida que no se vote a si mismo
                    do {
                        alumnoAzar = random.nextInt(alumnos.size());
                    } while (alumnoAzar==posicionAlumnoActual);

                    agregado = alumno1.getVoto().getAlumnosVotados().add(alumnos.stream().toList().get(alumnoAzar));
                    if (agregado) aumentarVotos(alumnos.stream().toList().get(alumnoAzar));

                } while (!agregado);
            }
        }
    }

    public void aumentarVotos(Alumno alumno){
        alumno.setCantidadVotos(alumno.getCantidadVotos()+1);
    }

    public void mostrarVotos(HashSet<Alumno> alumnos){
        for (Alumno alumno1 : alumnos) {
            System.out.println("Alumno: " + alumno1.getNombreCompleto()+
                    " tiene "+ alumno1.getCantidadVotos() + " votos"+
                    " y sus votos fueron a: ");
            mostrarVotosDelAlumno(alumno1);
            System.out.println(" ");
        }
    }

    public void mostrarVotosDelAlumno(Alumno alumno){
        for (Alumno alumnosVotado : alumno.getVoto().getAlumnosVotados()) {
            System.out.println(alumnosVotado);
        }
    }

    public void recuentoDeVotos(HashSet<Alumno> alumnos){
        int sumaVotos=0;
        for (Alumno alumno1 : alumnos) {
            sumaVotos+=alumno1.getCantidadVotos();
        }

        for (Alumno alumno1 : alumnos) {
            System.out.println("Alumno: " + alumno1.getNombreCompleto()+
                    " tiene "+ alumno1.getCantidadVotos() + " votos");
            System.out.println(" ");
        }

        System.out.println("En total fueron " + sumaVotos+ " votos");

    }
    public void crearFacilitadores(HashSet<Alumno> alumnos){
        List<Alumno> alumnosLista = new ArrayList<>(alumnos.stream().toList());
        Collections.sort(alumnosLista,compararCantidadVotos);

        System.out.println("Los siguientes alumnos serán los facilitadores:");

        for (int i = 0; i < 5; i++) {
            System.out.println(alumnosLista.get(i).getNombreCompleto());
        }
        System.out.println("Los siguientes serán los facilitadores suplentes:");
        for (int i = 0; i < 10; i++) {
            if (i>4) System.out.println(alumnosLista.get(i).getNombreCompleto());
        }
    }

    public void menu(){
            int opc=0;

            alumnos = crearAlumnos(crearNombres(),crearDnis());
            do{
                System.out.println("Ingrese una opción: ");
                System.out.println("1.- Mostrar alumnos");
                System.out.println("2.- Votacion");
                System.out.println("3.- Mostrar votos");
                System.out.println("4.- Recuento de votos");
                System.out.println("5.- Crear facilitadores");
                System.out.println("6.- Salir");

                opc = scanner.nextInt();
                switch (opc){
                    case 1:
                        mostrarAlumnos(alumnos);
                        break;
                    case 2:
                        votacion(alumnos);
                        break;
                    case 3:
                        mostrarVotos(alumnos);
                        break;
                    case 4:
                        recuentoDeVotos(alumnos);
                        break;
                    case 5:
                        crearFacilitadores(alumnos);
                        break;
                    case 6:
                        break;
                }
            }while(opc != 6);
        }

}
