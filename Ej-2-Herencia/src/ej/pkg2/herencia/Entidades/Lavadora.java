package ej.pkg2.herencia.Entidades;

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

    public Lavadora crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga");
        setCarga(leer.nextDouble());
        return new Lavadora(carga);
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            super.precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + "Precio = " + precio + ", Color = " + color + ", Consumo Energético = " + consumoener + ", peso = " + peso + ", Carga = " + carga + '}';
    }

}
