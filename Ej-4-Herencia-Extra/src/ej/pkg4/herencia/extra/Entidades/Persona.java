package ej.pkg4.herencia.extra.Entidades;

import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in);

    protected String nombre;
    protected Integer num;
    protected String ecivil;

    public Persona() {

    }

    public Persona(String nombre, Integer num, String ecivil) {
        this.nombre = nombre;
        this.num = num;
        this.ecivil = ecivil;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNum() {
        return num;
    }

    public String getEcivil() {
        return ecivil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setEcivil(String ecivil) {
        this.ecivil = ecivil;
    }

    public void cambioEcivil() {

        System.out.println("Ingrese el nuevo estado civil");
        setEcivil(leer.next());

    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre = " + nombre + ", Num de ID = " + num + ", Estado Civil = " + ecivil + '}';
    }

}
