package ej.pkg1.extra.herencia.Entidades;

import ej.pkg1.extra.herencia.Interfaces.calculosBarco;

public class Bamotor extends Barco implements calculosBarco {

    private Integer potenciacv;

    public Bamotor() {

    }

    public Bamotor(Integer potenciacv, String nombre, Integer dni, Integer amarre, Integer dif, Barco ba, Integer matricula, Integer eslora, Integer fabricacion) {
        super(nombre, dni, amarre, dif, ba, matricula, eslora, fabricacion);
        this.potenciacv = potenciacv;
    }

    public Integer getPotenciacv() {
        return potenciacv;
    }

    public void setPotenciacv(Integer potenciacv) {
        this.potenciacv = potenciacv;
    }

    @Override
    public void precio() {
        super.crearBarcos();
        System.out.println("Ingrese la Potencia CV para el barco a motor");
        setPotenciacv(leer.nextInt());
        int precio = (dif * (eslora * 10)) + potenciacv;
        System.out.println("El precio del alquiler del barco a motor es de $" + precio);
    }

}
