package ej.pkg2.herencia.Entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoener;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoener, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoener = consumoener;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoener() {
        return consumoener;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoener(char consumoener) {
        this.consumoener = consumoener;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        switch (letra) {
            case 'a':
                return 'a';
            case 'b':
                return 'b';
            case 'c':
                return 'c';
            case 'd':
                return 'd';
            case 'e':
                return 'e';
            case 'f':
                return 'f';
            default:
                return 'f';
        }
    }

    public String comprobarColor(String c) {

        switch (c) {
            case "blanco":
                return "blanco";
            case "negro":
                return "negro";
            case "rojo":
                return "rojo";
            case "azul":
                return "azul";
            case "gris":
                return "gris";
            default:
                return "blanco";
        }

    }

    Scanner leer = new Scanner(System.in);

    public Electrodomestico crearElectrodomestico() {
        Electrodomestico e1 = new Electrodomestico();

        System.out.println("Ingrese precio");
        setPrecio(leer.nextDouble() + 1000);

        System.out.println("Ingrese color");
        setColor((e1.comprobarColor(leer.next())));

        System.out.println("Ingrese consumo energetico");

        setConsumoener(e1.comprobarConsumoEnergetico(leer.next().charAt(0)));

        System.out.println("Ingrese peso");
        setPeso(leer.nextDouble());
        return new Electrodomestico();
    }

    public void precioFinal() {
        switch (this.consumoener) {
            case 'a':
                this.precio += 1000;
                break;
            case 'b':
                this.precio += 800;
                break;
            case 'c':
                this.precio += 600;
                break;
            case 'd':
                this.precio += 500;
                break;
            case 'e':
                this.precio += 300;
                break;
            case 'f':
                this.precio += 100;
                break;
        }

        if (this.peso >= 1 && this.peso <= 19) {
            this.precio += 100;
        } else if (peso <= 49) {
            this.precio += 500;
        } else if (peso <= 79) {
            this.precio += 800;
        } else {
            this.precio += 1000;
        }

    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio = " + precio + ", color = " + color + ", consumo de energía = " + consumoener + ", peso = " + peso + '}';
    }

}
