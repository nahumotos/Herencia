package ej.pkg2.herencia.extra.Entidades;

import java.util.Scanner;

public abstract class Edificio {

    protected Integer ancho;
    protected Integer alto;
    protected Integer largo;

    public Edificio() {

    }

    public Edificio(Integer ancho, Integer alto, Integer largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Integer getAncho() {
        return ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    Scanner leer = new Scanner(System.in);

    public void crearEdificio() {
        System.out.println("Ingrese el alto del edificio");
        setAncho(leer.nextInt());
        System.out.println("Ingrese el ancho del edificio");
        setAlto(leer.nextInt());
        System.out.println("Ingrese el largo del edificio");
        setLargo(leer.nextInt());
    }

    @Override
    public String toString() {
        return "Edificio{" + " Ancho = " + ancho + ", Alto = " + alto + ", Largo = " + largo + '}';
    }

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();

}
