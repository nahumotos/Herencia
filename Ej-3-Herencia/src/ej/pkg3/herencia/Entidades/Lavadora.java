package ej.pkg3.herencia.Entidades;

public class Lavadora extends Electrodomestico {

    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga) {
        this.carga = carga;
    }

    public Lavadora(Double carga, Double precio, String color, char consumoener, Double peso) {
        super(precio, color, consumoener, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public Lavadora calcularPrecio(Double carga, Double precio, String color, char consumoener, Double peso) {
        super.precio(precio, color, consumoener, peso);
        
        if (carga > 30) {
            super.precio += 500;
        }
        
        return new Lavadora(carga, super.precio, color, consumoener, peso);
    }

    @Override
    public String toString() {
        return "Lavadora{Carga " + this.carga + " " + super.toString();
    }

}
