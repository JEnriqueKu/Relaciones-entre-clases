package desafio1.comparators;

import desafio1.entidades.Tienda;

import java.util.Comparator;

public class Comparators {
    public static Comparator<Tienda> compararId = new Comparator<Tienda>() {
        @Override
        public int compare(Tienda o1, Tienda o2) {
            return o2.getId().compareTo(o1.getId());
        }
    };
}
