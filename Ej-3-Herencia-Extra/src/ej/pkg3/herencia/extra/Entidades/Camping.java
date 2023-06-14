package ej.pkg3.herencia.extra.Entidades;

public class Camping extends Extrahoteleros {

    private Integer capcarpas;
    private Integer cantbanos;
    private String rest;

    public Camping() {

    }

    public Camping(Integer capcarpas, Integer cantbanos, String rest, String privadoono, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(privadoono, m2, nombre, direccion, localidad, gerente);
        this.capcarpas = capcarpas;
        this.cantbanos = cantbanos;
        this.rest = rest;
    }

    public Integer getCapcarpas() {
        return capcarpas;
    }

    public Integer getCantbanos() {
        return cantbanos;
    }

    public String getRest() {
        return rest;
    }

    public void setCapcarpas(Integer capcarpas) {
        this.capcarpas = capcarpas;
    }

    public void setCantbanos(Integer cantbanos) {
        this.cantbanos = cantbanos;
    }

    public void setRest(String rest) {
        this.rest = rest;
    }

    @Override
    public String toString() {
        return "Camping{ Nombre = " + nombre + ", Capacidad max de carpas = " + capcarpas + ", Cantidad de baños = " + cantbanos + ", Tiene restaurante = " + rest + '}';
    }

}
