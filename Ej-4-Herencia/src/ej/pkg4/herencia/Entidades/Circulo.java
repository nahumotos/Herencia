
package ej.pkg4.herencia.Entidades;

import ej.pkg4.herencia.Interfaces.calculosFormas;


public class Circulo implements calculosFormas{

    private double radio;

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public void area() {
        double p = PI * radio;
        System.out.println(Math.pow(p, 2));
    }

    @Override
    public void perimetro() {
        System.out.println(PI*(radio*2));
    }

}
