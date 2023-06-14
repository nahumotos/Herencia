package ej.pkg4.herencia.extra.Entidades;

public class Pservicio extends Empleado {

    private String seccion;

    public Pservicio() {

    }

    public Pservicio(String seccion, Integer ainc, Integer numdes, String nombre, Integer num, String ecivil) {
        super(ainc, numdes, nombre, num, ecivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Personal de Servicio{" + "Seccion = " + seccion + " - Empleado{" + "Año de incorporación = " + ainc + ", Número de despacho = " + numdes + " - Persona{" + "Nombre = " + nombre + ", Num de ID = " + num + ", Estado Civil = " + ecivil + '}';
    }

}
