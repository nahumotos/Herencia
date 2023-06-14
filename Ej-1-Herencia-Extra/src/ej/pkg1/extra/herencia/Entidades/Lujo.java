package ej.pkg1.extra.herencia.Entidades;

import ej.pkg1.extra.herencia.Interfaces.calculosBarco;

public class Lujo extends Barco implements calculosBarco {

    private Integer potenciacv;
    private Integer numcam;

    public Lujo() {

    }

    public Lujo(Integer potenciacv, Integer numcam) {
        this.potenciacv = potenciacv;
        this.numcam = numcam;
    }

    public Lujo(Integer potenciacv, Integer numcam, String nombre, Integer dni, Integer amarre, Integer dif, Barco ba, Integer matricula, Integer eslora, Integer fabricacion) {
        super(nombre, dni, amarre, dif, ba, matricula, eslora, fabricacion);
        this.potenciacv = potenciacv;
        this.numcam = numcam;
    }

    public Integer getPotenciacv() {
        return potenciacv;
    }

    public Integer getNumcam() {
        return numcam;
    }

    public void setPotenciacv(Integer potenciacv) {
        this.potenciacv = potenciacv;
    }

    public void setNumcam(Integer numcam) {
        this.numcam = numcam;
    }

    @Override
    public void precio() {
        super.crearBarcos();
        System.out.println("Ingrese la Potencia CV para el barco de lujo");
        setPotenciacv(leer.nextInt());
        System.out.println("Ingrese número de camarotes para el barco de lujo");
        setNumcam(leer.nextInt());
        int precio = (dif * (eslora * 10)) + potenciacv + numcam;
        System.out.println("El precio del alquiler del barco de lujo es de $" + precio);
    }

}
