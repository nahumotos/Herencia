package ej.pkg1.extra.herencia;


import ej.pkg1.extra.herencia.Entidades.Bamotor;
import ej.pkg1.extra.herencia.Entidades.Barco;
import ej.pkg1.extra.herencia.Entidades.Lujo;
import ej.pkg1.extra.herencia.Entidades.Velero;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner leer = new Scanner(System.in);

        Barco b = new Barco();
        Velero v = new Velero();
        Bamotor ba = new Bamotor();
        Lujo l = new Lujo();

        System.out.println("Bienvenido al sistema de Alquiler de barcos");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Barco común");
        System.out.println("2. Velero");
        System.out.println("3. Barco a motor");
        System.out.println("4. Barco de lujo");

        int opcion = leer.nextInt();


        switch (opcion) {
            case 1:
                b.crearBarcos();
                b.precio();
                break;
            case 2:
                v.precio();
                break;
            case 3:
                ba.precio();
                break;
            case 4:
                l.precio();
                break;
        }

    }

}
