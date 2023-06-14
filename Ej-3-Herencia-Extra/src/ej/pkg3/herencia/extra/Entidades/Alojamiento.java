package ej.pkg3.herencia.extra.Entidades;

public class Alojamiento {

    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamiento() {

    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + " Nombre del alojamiento = " + nombre + ", Direccion = " + direccion + ", Localidad = " + localidad + ", Gerente = " + gerente + '}';
    }

}
