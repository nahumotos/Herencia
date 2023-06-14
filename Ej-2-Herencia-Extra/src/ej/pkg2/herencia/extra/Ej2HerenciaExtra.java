package ej.pkg2.herencia.extra;

import ej.pkg2.herencia.extra.Entidades.EdificioDeOficinas;
import ej.pkg2.herencia.extra.Entidades.Polideportivo;
import java.util.ArrayList;

public class Ej2HerenciaExtra {

    public static void main(String[] args) {

        Polideportivo p1 = new Polideportivo();
        Polideportivo p2 = new Polideportivo();

        EdificioDeOficinas e1 = new EdificioDeOficinas();
        EdificioDeOficinas e2 = new EdificioDeOficinas();

        ArrayList<Polideportivo> po = new ArrayList<>();
        ArrayList<EdificioDeOficinas> eo = new ArrayList<>();

        System.out.println("Polideportivos:");
        p1.crearPolideportivo();
        p1.calcularSuperficie();
        p1.calcularVolumen();
        po.add(p1);

        p2.crearPolideportivo();
        p2.calcularSuperficie();
        p2.calcularVolumen();
        po.add(p2);

        System.out.println("Edificios de Oficina:");
        e1.crearEdificioDeOficinas();
        e1.calcularSuperficie();
        e1.calcularVolumen();
        eo.add(e1);

        e2.crearEdificioDeOficinas();
        e2.calcularSuperficie();
        e2.calcularVolumen();
        eo.add(e2);

        int acu1 = 0;
        int acu2 = 0;

        
        System.out.println("");
        for (Polideportivo aux : po) {
            if (aux instanceof Polideportivo) {
                Polideportivo p = (Polideportivo) aux;
                if (p.getTipo().equals("abierto")) {
                    System.out.println("El polideportivo " + p.getNombre() + " es abierto");
                    acu1++;
                }
            }
        }

        for (Polideportivo aux : po) {
            if (aux instanceof Polideportivo) {
                Polideportivo p = (Polideportivo) aux;
                if (p.getTipo().equals("cerrado")) {
                    System.out.println("El polideportivo " + p.getNombre() + " es cerrado");
                    acu2++;
                }
            }
        }

        System.out.println("Hay " + acu1 + " polideportivo/s abierto/s");
        System.out.println("Hay " + acu2 + " polideportivo/s cerrado/s");

        System.out.println("");
        System.out.println("Edificio de Oficinas 1");
        e1.cantPersonas();
        System.out.println("Edificio de Oficinas 2");
        e2.cantPersonas();
        for (EdificioDeOficinas aux : eo) {
            System.out.println(aux.toString());
        }

    }

}
