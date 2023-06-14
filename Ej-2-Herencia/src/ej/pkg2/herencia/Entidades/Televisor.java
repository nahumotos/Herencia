package ej.pkg2.herencia.Entidades;

public class Televisor extends Electrodomestico {

    private Double resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(Double resolucion, Boolean tdt) {
        this.resolucion = resolucion;
        this.tdt = false;
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

    public Televisor crearTelevisor() {
        super.crearElectrodomestico();
        String r;
        System.out.println("Ingrese la resolucion");
        setResolucion(leer.nextDouble());
        
        System.out.println("Si el televisor tiene sintonizador TDT escriba si");
        r = leer.next();

        if (r.equalsIgnoreCase("si")) {
                tdt = true;
            }
        
        return new Televisor(resolucion, tdt);
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            super.precio *= 1.3;
        }

        if (tdt) {
            super.precio += 500;
        }

    }

    @Override
    public String toString() {
        return "Televisor{" + "Precio = " + precio + ", Color = " + color + ", Consumo Energético = " + consumoener + ", Peso = " + peso + " Resolucion = " + resolucion + ", TDT = " + tdt + '}';
    }

    
}
