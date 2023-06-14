package ej.pkg3.herencia.Entidades;

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

    public Electrodomestico precio(double precio, String color, char consumoener, double peso) {

        switch (color) {
            case "blanco":
                setColor("blanco");
            case "negro":
                setColor("negro");
            case "rojo":
                setColor("rojo");
            case "azul":
                setColor("azul");
            case "gris":
                setColor("gris");
            default:
                setColor("blanco");
        }

        switch (consumoener) {
            case 'a':
                precio += 1000.0;
                break;
            case 'b':
                setPrecio(precio + 800.0);
                break;
            case 'c':
                precio += 600.0;
                break;
            case 'd':
                precio += 500.0;
                break;
            case 'e':
                precio += 300.0;
                break;
            case 'f':
                precio += 100.0;
                break;
            default:
                precio += 100.0;
        }

        if (peso >= 1 && peso <= 19) {
            setPrecio(precio + 100.0);
        } else if (peso <= 49) {
            setPrecio(precio + 500.0);
        } else if (peso <= 79) {
            setPrecio(precio + 800.0);
        } else {
            setPrecio(precio + 1000.0);
        }

        return new Electrodomestico(precio, color, consumoener, peso);
    }

    @Override
    public String toString() {
        return " Electrodomestico{" + "precio = " + precio + ", color = " + color + ", consumo de energía = " + consumoener + ", peso = " + peso + '}';
    }

}
