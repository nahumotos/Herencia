package ej.pkg3.herencia.extra.Entidades;

import ej.pkg3.herencia.extra.Interfaces.Precio;

public class Cuatroestrellas extends Hotel implements Precio {

    private String gimnasio;
    private String nomrestau;
    private Integer caprestau;

    public Cuatroestrellas() {

    }

    public Cuatroestrellas(String gimnasio, String nomrestau, Integer caprestau, Integer canthab, Integer numcamas, Integer cantpisos, Integer preciohab, String nombre, String direccion, String localidad, String gerente) {
        super(canthab, numcamas, cantpisos, preciohab, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nomrestau = nomrestau;
        this.caprestau = caprestau;
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

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public void setNomrestau(String nomrestau) {
        this.nomrestau = nomrestau;
    }

    public void setCaprestau(Integer caprestau) {
        this.caprestau = caprestau;
    }

    @Override
    public String toString() {
        return "Cuatroestrellas{ Nombre = " + nombre + " Gimnasio = " + gimnasio + ", Nombre restaurante = " + nomrestau + ", Capacidad restaurante = " + caprestau + '}';
    }

    @Override
    public int calcularPrecio() {

        int var = 0;
        int vag = 0;

        if (caprestau < 30) {
            var = 10;
        }

        if (caprestau >= 30 && caprestau <= 50) {
            var = 30;
        }

        if (caprestau > 50) {
            var = 50;
        }

        if ("a".equalsIgnoreCase(gimnasio)) {
            vag = 50;
        }

        if ("b".equalsIgnoreCase(gimnasio)) {
            vag = 30;
        }

        this.preciohab = (50 + (1 * numcamas) + var + vag);
        return preciohab;
    }

}
