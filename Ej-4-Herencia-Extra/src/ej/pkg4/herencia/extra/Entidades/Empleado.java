package ej.pkg4.herencia.extra.Entidades;

import java.util.Objects;

public class Empleado extends Persona {
    
    protected Integer ainc;
    protected Integer numdes;
    
    public Empleado() {
        
    }
    
    public Empleado(Integer ainc, Integer numdes, String nombre, Integer num, String ecivil) {
        super(nombre, num, ecivil);
        this.ainc = ainc;
        this.numdes = numdes;
    }
    
    public Integer getAinc() {
        return ainc;
    }
    
    public Integer getNumdes() {
        return numdes;
    }
    
    public void setAinc(Integer ainc) {
        this.ainc = ainc;
    }
    
    public void setNumdes(Integer numdes) {
        this.numdes = numdes;
    }
    
    public Integer cambDespacho(Integer esid) {
        
        if (Objects.equals(esid, num)) {
            System.out.println("Ingrese el nuevo número de despacho");
            setNumdes(leer.nextInt());
        }
        return numdes;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "Año de incorporación = " + ainc + ", Número de despacho = " + numdes + '}';
    }
    
}
