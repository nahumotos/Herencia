package ej.pkg1.extra.herencia.Entidades;

import ej.pkg1.extra.herencia.Interfaces.calculosBarco;

public class Velero extends Barco implements calculosBarco {

    private Integer mastiles;

    public Velero() {

    }

    public Velero(int mastiles, String nombre, Integer dni, Integer amarre, Integer dif, Barco ba, Integer matricula, Integer eslora, Integer fabricacion) {
        super(nombre, dni, amarre, dif, ba, matricula, eslora, fabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public void precio() {
        super.crearBarcos();
        System.out.println("Ingrese cantidad de mástiles del velero");
        setMastiles(leer.nextInt());
        int precio = (dif * (eslora*10)) + mastiles;
        System.out.println("El precio del alquiler del velero es de $" + precio);
    }

}
