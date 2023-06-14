package ej.pkg3.herencia.extra.Entidades;

public class Extrahoteleros extends Alojamiento {

    protected String privadoono;
    protected Integer m2;

    public Extrahoteleros() {

    }

    public Extrahoteleros(String privadoono, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privadoono = privadoono;
        this.m2 = m2;
    }

    public String getPrivadoono() {
        return privadoono;
    }

    public Integer getM2() {
        return m2;
    }

    public void setPrivadoono(String privadoono) {
        this.privadoono = privadoono;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "Extrahoteleros{" + " Es privado o no = " + privadoono + ", Metros cuadrados = " + m2 + '}';
    }

}
