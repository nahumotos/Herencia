package ej.pkg3.herencia.extra.Entidades;


public class Hotel extends Alojamiento {

    protected Integer canthab;
    protected Integer numcamas;
    protected Integer cantpisos;
    protected Integer preciohab;

    public Hotel() {

    }

    public Hotel(Integer canthab, Integer numcamas, Integer cantpisos, Integer preciohab, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.canthab = canthab;
        this.numcamas = numcamas;
        this.cantpisos = cantpisos;
        this.preciohab = preciohab;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public Integer getCanthab() {
        return canthab;
    }

    public Integer getNumcamas() {
        return numcamas;
    }

    public Integer getCantpisos() {
        return cantpisos;
    }

    public Integer getPreciohab() {
        return preciohab;
    }

    public void setCanthab(Integer canthab) {
        this.canthab = canthab;
    }

    public void setNumcamas(Integer numcamas) {
        this.numcamas = numcamas;
    }

    public void setCantpisos(Integer cantpisos) {
        this.cantpisos = cantpisos;
    }

    public void setPreciohab(Integer preciohab) {
        this.preciohab = preciohab;
    }

    @Override
    public String toString() {
        return "Hotel{ Nombre" + nombre + " Cantidad de habitaciones = " + canthab + ", Número de camas = " + numcamas + ", Cantidad de pisos = " + cantpisos + ", Precio de habitaciones = " + preciohab + '}';
    }

}
