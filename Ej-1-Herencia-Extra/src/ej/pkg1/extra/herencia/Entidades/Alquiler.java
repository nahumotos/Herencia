package ej.pkg1.extra.herencia.Entidades;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Alquiler {

    protected String nombre;
    protected Integer dni;
    protected Integer amarre;
    protected Integer dif;
    protected Barco b;

    public Alquiler() {

    }

    public Alquiler(String nombre, Integer dni, Integer amarre, Integer dif, Barco b) {
        this.nombre = nombre;
        this.dni = dni;
        this.amarre = amarre;
        this.dif = dif;
        this.b = b;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public Integer getAmarre() {
        return amarre;
    }

    public Integer getDif() {
        return dif;
    }

    public Barco getBa() {
        return b;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setAmarre(Integer amarre) {
        this.amarre = amarre;
    }

    public void setDif(Integer dif) {
        this.dif = dif;
    }

    public void setBa(Barco ba) {
        this.b = ba;
    }

    
    Scanner leer = new Scanner(System.in);

    public Alquiler crearAlquiler() {
        System.out.println("Ingrese su Nombre");
        setNombre(leer.next());
        System.out.println("Ingrese su DNI");
        setDni(leer.nextInt());
        System.out.println("Ingrese lugar de amarre del barco");
        setAmarre(leer.nextInt());
        return new Alquiler();
    }

    public void diasOcupacion() {
        System.out.println("Ingrese año, mes y día de comienzo del alquiler");
        System.out.println("yyyy/m/dd");
        LocalDate fechaalq = LocalDate.of(leer.nextInt(), leer.nextInt(), leer.nextInt());
        System.out.println("Ingrese año, mes y día de devolución del barco");
        System.out.println("yyyy/m/dd");
        LocalDate fechadev = LocalDate.of(leer.nextInt(), leer.nextInt(), leer.nextInt());
        Period dias = Period.between(fechaalq, fechadev);
        setDif(Math.abs(dias.getDays()));
        
        System.out.println("Cantidad de días de alquiler: " + dif);
        
    }

    
    @Override
    public String toString() {
        return "Alquiler{" + " Nombre = " + nombre + ", DNI = " + dni + ", Lugar de Amarre = " + amarre + ", N° días de Ocupación = " + dif + ", Barco = " + b + '}';
    }

}
