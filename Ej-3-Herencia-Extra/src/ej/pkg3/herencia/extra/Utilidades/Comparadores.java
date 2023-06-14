package ej.pkg3.herencia.extra.Utilidades;

import ej.pkg3.herencia.extra.Entidades.Hotel;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Hotel> comparar1 = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel h1, Hotel h2) {
            return h2.getPreciohab().compareTo(h1.getPreciohab());
        }
    };

}
