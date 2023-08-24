package ejercicioExtra4.comparators;

import ejercicioExtra4.entidades.Alumno;

import java.util.Comparator;

public class Comparators {

    public static Comparator<Alumno> compararCantidadVotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o2.getCantidadVotos().compareTo(o1.getCantidadVotos());
        }
    };
}
