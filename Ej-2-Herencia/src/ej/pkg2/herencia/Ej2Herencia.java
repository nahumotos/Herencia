package ej.pkg2.herencia;

import ej.pkg2.herencia.Entidades.Lavadora;
import ej.pkg2.herencia.Entidades.Televisor;

public class Ej2Herencia {

    public static void main(String[] args) {

        Lavadora l1 = new Lavadora();
        l1.crearLavadora();
        l1.precioFinal();
        System.out.println(l1.toString());
        
        Televisor t1 = new Televisor();
        t1.crearTelevisor();
        t1.precioFinal();
        System.out.println(t1.toString());

    }

}
