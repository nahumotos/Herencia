package ej.pkg3.herencia.Entidades;

public class Televisor extends Electrodomestico {

    private Double resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(Double resolucion, Boolean tdt) {
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Televisor(Double resolucion, boolean tdt, Double precio, String color, char consumoener, Double peso) {
        super(precio, color, consumoener, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public boolean getTdt() {
        return tdt;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public Televisor calcularPrecio(Double resolucion, boolean tdt, Double precio, String color, char consumoener, Double peso) {
        super.precio(precio, color, consumoener, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;

        if (resolucion > 40) {
            super.precio *= 1.3;
        }

        if (tdt) {
            super.precio += 500;
        }

        return new Televisor(resolucion, tdt, super.precio, color, consumoener, peso);
    }

    @Override
    public String toString() {
        return "Televisor{Resolucion = " + resolucion + ", SintonizadorTDT = " + tdt + " " + super.toString();
    }

}
