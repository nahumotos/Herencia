package ej.pkg3.herencia.extra;

import ej.pkg3.herencia.extra.Entidades.Alojamiento;
import ej.pkg3.herencia.extra.Entidades.Camping;
import ej.pkg3.herencia.extra.Entidades.Cincoestrellas;
import ej.pkg3.herencia.extra.Entidades.Cuatroestrellas;
import ej.pkg3.herencia.extra.Entidades.Extrahoteleros;
import ej.pkg3.herencia.extra.Entidades.Hotel;
import ej.pkg3.herencia.extra.Entidades.Residencia;
import static ej.pkg3.herencia.extra.Utilidades.Comparadores.comparar1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej3HerenciaExtra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Cuatroestrellas cuatroe1 = new Cuatroestrellas("b", "De Todo un poco", 80, 45, 90, 2, 15, "Playa Serena", "Av Bunge 526", "Pinamar", "Tadeo Ramirez");
        Cuatroestrellas cuatroe2 = new Cuatroestrellas("a", "JapanSushi", 100, 50, 120, 3, 12, "Paraiso", "Cortes 123", "Cancun", "Luis Sanchez");
        Cuatroestrellas cuatroe3 = new Cuatroestrellas("a", "World Chefs", 150, 120, 200, 3, 9, "Conrad", "Uruguay 4296", "Punta del Este", "Mirta Leblanc");
        Cuatroestrellas cuatroe4 = new Cuatroestrellas("a", "Pastas Tanas", 75, 49, 77, 1, 11, "Mar de Playa", "Constituciòn 692", "Mar del Plata", "Victor Perez");

        Cincoestrellas cincoe1 = new Cincoestrellas("a", "PerfectCousin", 250, 2, 5, 1, 95, 135, 2, 13, "Savoy", "De las Burriqueras 130", "Pinamar", "Milton Fariña");
        Cincoestrellas cincoe2 = new Cincoestrellas("b", "All Top", 175, 1, 2, 0, 150, 220, 5, 9, "CesarPalace", "Nevada653", "Las Vegas", "George Lincoln");

        Cincoestrellas cincoe3 = new Cincoestrellas("b", "Fina Hierb", 180, 2, 4, 2, 150, 180, 4, 11, "Costa Galana", "Av del Mar 336", "Mar del Plata", "Marcos Ledesma");

        Camping c1 = new Camping(15, 2, "si", "no", 600, "Camping Victoria", "Junin 920", "Gualeguaychu", "Jacobo Santamarìa");
        Camping c2 = new Camping(18, 1, "no", "no", 550, "Camping Mendoza", "San Martin 523", "Godoy Cruz", "Humberto Galindez");
        Camping c3 = new Camping(23, 1, "si", "si", 1000, "Camping Hornero", "Av Pueyrredon 1150", "San Lorenzo", "Sonia Fascia");

        Residencia r1 = new Residencia(4, "si", "no", "si", 200, "El descanso", "Av Enrique Shaw 433", "Pinamar", "Carlos Quesada");
        Residencia r2 = new Residencia(5, "si", "si", "si", 250, "Brisa de Verano", "Abedul 230", "Carilò", "Patricia Castro");
        Residencia r3 = new Residencia(3, "no", "si", "no", 450, "Saint Tropez", "Av Libertador 690", "Pinamar", "José María Capaccioli");

        ArrayList<Hotel> ho = new ArrayList();
        ArrayList<Extrahoteleros> eh = new ArrayList();

        ho.add(cuatroe1);
        ho.add(cuatroe2);
        ho.add(cuatroe3);
        ho.add(cuatroe4);
        ho.add(cincoe1);
        ho.add(cincoe2);
        ho.add(cincoe3);
        eh.add(c1);
        eh.add(c2);
        eh.add(c3);
        eh.add(r1);
        eh.add(r2);
        eh.add(r3);

        String r;
        System.out.println("Bienvenido al Sistema de consultas de alojamientos");

        do {

            System.out.println("1 para ver todos los alojamientos disponibles");
            System.out.println("2 para ver ordenados los hoteles del más caro al más barato");
            System.out.println("3 para ver los campings con restaurante");
            System.out.println("4 para ver las residencias con descuento para gremios");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("");
                    for (Alojamiento aux : ho) {
                        System.out.println(aux);
                    }

                    System.out.println("");
                    for (Alojamiento aux : eh) {
                        System.out.println(aux);
                    }

                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Hoteles ordenados del más caro al mas barato");

                    Collections.sort(ho, comparar1);

                    for (Hotel aux : ho) {
                        System.out.println(aux.getNombre() + " - Precio de la habitación $" + aux.getPreciohab());
                    }

                    break;

                case 3:

                    System.out.println("");
                    System.out.println("Los campings con restaurante son:");

                    for (Extrahoteleros aux : eh) {
                        if (aux instanceof Camping) {
                            Camping c = (Camping) aux;
                            if (c.getRest().equals("si")) {
                                System.out.println("El " + c.getNombre() + " tiene restaurante");
                            }
                        }
                    }

                    break;

                case 4:

                    System.out.println("");
                    System.out.println("Las residencias con descuento para gremios son:");
                    for (Extrahoteleros aux : eh) {
                        if (aux instanceof Residencia) {
                            Residencia re = (Residencia) aux;
                            if (re.getDesc().equals("si")) {
                                System.out.println("La residencia " + re.getNombre() + " tiene descuento para gremios");
                            }
                        }
                    }

                    break;

            }

            System.out.println("");
            System.out.println("Si desea averiguar algo mas escriba si");
            r = leer.next();
        } while ("si".equalsIgnoreCase(r));

    }

}
