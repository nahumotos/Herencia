
package ej.pkg4.herencia.Entidades;

import ej.pkg4.herencia.Interfaces.calculosFormas;

public class Rectangulo implements calculosFormas{
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public void area() {
        System.out.println(base*altura);
    }

    @Override
    public void perimetro() {
        System.out.println((base+altura)*2);
    }
    

}
