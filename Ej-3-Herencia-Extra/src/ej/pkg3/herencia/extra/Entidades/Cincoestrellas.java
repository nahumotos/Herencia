package ej.pkg3.herencia.extra.Entidades;

import ej.pkg3.herencia.extra.Interfaces.Precio;

public class Cincoestrellas extends Hotel implements Precio {

    private String gimnasio;
    private String nomrestau;
    private Integer caprestau;
    private Integer cantsalon;
    private Integer cantsuites;
    private Integer cantlimo;

    public Cincoestrellas() {

    }

    public Cincoestrellas(String gimnasio, String nomrestau, Integer caprestau, Integer cantsalon, Integer cantsuites, Integer cantlimo, Integer canthab, Integer numcamas, Integer cantpisos, Integer preciohab, String nombre, String direccion, String localidad, String gerente) {
        super(canthab, numcamas, cantpisos, preciohab, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nomrestau = nomrestau;
        this.caprestau = caprestau;
        this.cantsalon = cantsalon;
        this.cantsuites = cantsuites;
        this.cantlimo = cantlimo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public String getNomrestau() {
        return nomrestau;
    }

    public Integer getCaprestau() {
        return caprestau;
    }

    public Integer getCantsalon() {
        return cantsalon;
    }

    public Integer getCantsuites() {
        return cantsuites;
    }

    public Integer getCantlimo() {
        return cantlimo;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public void setNomrestau(String nomrestau) {
        this.nomrestau = nomrestau;
    }

    public void setCaprestau(Integer caprestau) {
        this.caprestau = caprestau;
    }

    public void setCantsalon(Integer cantsalon) {
        this.cantsalon = cantsalon;
    }

    public void setCantsuites(Integer cantsuites) {
        this.cantsuites = cantsuites;
    }

    public void setCantlimo(Integer cantlimo) {
        this.cantlimo = cantlimo;
    }

    @Override
    public String toString() {
        return "Cincoestrellas{ Nombre " + nombre + " Gimnasio = " + gimnasio + ", Nombre restaurante = " + nomrestau + ", Capacidad restaurante = " + caprestau + ", Cantidad de salones p/conferencias = " + cantsalon + ", Cantidad de suites = " + cantsuites + ", Cantidad de limosinas = " + cantlimo + '}';
    }

    @Override
    public int calcularPrecio() {

        this.preciohab = super.preciohab + (cantlimo * 15);
        return preciohab;
    }

}
