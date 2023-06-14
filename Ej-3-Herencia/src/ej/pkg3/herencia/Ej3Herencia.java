package ej.pkg3.herencia;

import ej.pkg3.herencia.Entidades.Electrodomestico;
import ej.pkg3.herencia.Entidades.Lavadora;
import ej.pkg3.herencia.Entidades.Televisor;
import java.util.ArrayList;

public class Ej3Herencia {

    public static void main(String[] args) {

        double suma = 0, suma1 = 0, suma2 = 0;

        ArrayList<Electrodomestico> e = new ArrayList();
        Lavadora l = new Lavadora();
        Televisor t = new Televisor();

        e.add(l.calcularPrecio(40.8, 1205.0, "rojo", 'a', 70.5));
        e.add(l.calcularPrecio(60.5, 1300.0, "negro", 'b', 80.2));

        e.add(t.calcularPrecio(50.5, true, 1800.0, "gris", 'a', 100.0));
        e.add(t.calcularPrecio(20.5, false, 1400.0, "negro", 'd', 60.0));

        for (Electrodomestico e1 : e) {
            System.out.println(e1);
        }

        System.out.println("");
        for (int i = 0; i < e.size(); i++) {
            System.out.println("Precio del producto " + (i + 1) + ": " + e.get(i).getPrecio());
            suma += e.get(i).getPrecio();
        }

        System.out.println("");
        System.out.println("Se suman todos los electrodomésticos = " + suma);

        for (int i = 0; i < 2; i++) {
            suma1 += e.get(i).getPrecio();
        }
        System.out.println("Se suman todas las lavadoras = " + suma1);

        for (int i = 2; i < 4; i++) {
            suma2 += e.get(i).getPrecio();
        }
        System.out.println("Se suman todos los televisores = " + suma2);
    }

}
