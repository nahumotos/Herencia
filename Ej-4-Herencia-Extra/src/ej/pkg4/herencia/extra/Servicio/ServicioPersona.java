package ej.pkg4.herencia.extra.Servicio;

import ej.pkg4.herencia.extra.Entidades.Empleado;
import ej.pkg4.herencia.extra.Entidades.Estudiante;
import ej.pkg4.herencia.extra.Entidades.Persona;
import ej.pkg4.herencia.extra.Entidades.Profesor;
import ej.pkg4.herencia.extra.Entidades.Pservicio;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in);

    Estudiante es1 = new Estudiante("Constitucional", "Julian Castro", 13695, "Casado");
    Estudiante es2 = new Estudiante("Civil", "Alicia Fernandez", 69873, "Soltera");
    Estudiante es3 = new Estudiante("Penal", "Alberto Perez", 44621, "Soltero");
    Estudiante es4 = new Estudiante("Constitucional", "Pedro Castillo", 56731, "Soltero");
    Estudiante es5 = new Estudiante("Penal", "Silvina Gutierrez", 93651, "Casada");
    Estudiante es6 = new Estudiante("Civil", "Ramiro Sanchez", 19632, "Casado");

    Profesor pro1 = new Profesor("Penal", 2013, 2, "Raul Mestre", 69512, "Casado");
    Profesor pro2 = new Profesor("Civil", 2018, 1, "Teresa Velasco", 11963, "Soltera");
    Profesor pro3 = new Profesor("Penal", 2013, 3, "Jotge Luis Marteli", 45462, "Soltero");

    Pservicio ps1 = new Pservicio("Biblioteca", 2018, 4, "Josefina Fascia", 68984, "Casada");
    Pservicio ps2 = new Pservicio("Secretaria", 2019, 5, "Andres Racamato", 17102, "Soltero");
    Pservicio ps3 = new Pservicio("Decanato", 2019, 6, "Laura Cardone", 88983, "Soltera");

    public void sistema() {
        ArrayList<Persona> ap = new ArrayList();
        ap.add(es1);
        ap.add(es2);
        ap.add(es3);
        ap.add(es4);
        ap.add(es5);
        ap.add(es6);
        ap.add(pro1);
        ap.add(pro2);
        ap.add(pro3);
        ap.add(ps1);
        ap.add(ps2);
        ap.add(ps3);

        String r;

        do {

            System.out.println("Bienvenido al sistema de gestion de la Facultad de Derecho");
            System.out.println("1 para cambio de estado civil");
            System.out.println("2 para reasignación de despacho de empleado");
            System.out.println("3 para matriculación de estudiante a un nuevo curso");
            System.out.println("4 para cambio de departamento de un profesor");
            System.out.println("5 traslado de sección de un empleado del personal de servicio");
            System.out.println("6 Ver todas las personas de la facultad");

            int opcion = leer.nextInt();
            int esid;

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese número de identificacion de la persona que desee cambiar su estado civil");
                    esid = leer.nextInt();

                    for (Persona aux : ap) {
                        if (esid == aux.getNum()) {
                            aux.cambioEcivil();
                            System.out.println(aux.toString());

                        }
                    }

                    break;
                case 2:
                    System.out.println("Ingrese número de identificacion de empleado para reasignación de despacho");
                    esid = leer.nextInt();
                    for (Persona aux : ap) {
                        if (aux instanceof Empleado) {
                            Empleado em = (Empleado) aux;
                            if (esid == aux.getNum()) {
                                System.out.println(aux.toString());
                                System.out.println("Por que numero desea cambiar?");
                                ((Empleado) aux).setNumdes(leer.nextInt());
                                System.out.println(aux.toString());
                            }

                        }
                    }

                    break;

                case 3:

                    System.out.println("Ingrese número de identificacion del estudiante para la matriculacion a un nuevo curso");
                    esid = leer.nextInt();
                    for (Persona aux : ap) {
                        if (aux instanceof Estudiante) {
                            if (esid == aux.getNum()) {
                                System.out.println(aux.toString());
                                System.out.println("A que nuevo curso quiere matricular?");
                                ((Estudiante) aux).setCurso(leer.next());
                                System.out.println(aux.toString());
                            }

                        }
                    }

                    break;
                case 4:
                    System.out.println("Ingrese número de identificacion de profesor para cambio de departamento");
                    esid = leer.nextInt();
                    for (Persona aux : ap) {
                        if (aux instanceof Profesor) {
                            if (esid == aux.getNum()) {
                                System.out.println(aux.toString());
                                System.out.println("A cual departamento quiere cambiarse?");
                                ((Profesor) aux).setDep(leer.next());
                                System.out.println(aux.toString());
                            }

                        }
                    }

                    break;

                case 5:

                    System.out.println("Ingrese número de identificacion de personal de servicio para traslado de seccion");
                    esid = leer.nextInt();
                    for (Persona aux : ap) {
                        if (aux instanceof Pservicio) {
                            Pservicio ps = (Pservicio) aux;
                            if (esid == aux.getNum()) {
                                System.out.println(aux.toString());
                                System.out.println("A cual seccion quiere trasladarse?");
                                ((Pservicio) aux).setSeccion(leer.next());
                                System.out.println(aux.toString());
                            }

                        }
                    }

                    break;

                case 6:

                    System.out.println(es1);
                    System.out.println(es2);
                    System.out.println(es3);
                    System.out.println(es4);
                    System.out.println(es5);
                    System.out.println(es6);

                    System.out.println("");
                    System.out.println(pro1);
                    System.out.println(pro2);
                    System.out.println(pro3);

                    System.out.println("");
                    System.out.println(ps1);
                    System.out.println(ps2);
                    System.out.println(ps3);

                    break;

            }

            System.out.println("");
            System.out.println("Si desea averiguar algo mas escriba si");
            r = leer.next();
        } while ("si".equalsIgnoreCase(r));

    }

}
