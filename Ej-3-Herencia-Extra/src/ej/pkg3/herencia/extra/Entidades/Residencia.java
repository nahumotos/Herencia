package ej.pkg3.herencia.extra.Entidades;

public class Residencia extends Extrahoteleros {

    private Integer canthab;
    private String desc;
    private String campodep;

    public Residencia() {

    }

    public Residencia(Integer canthab, String desc, String campodep, String privadoono, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(privadoono, m2, nombre, direccion, localidad, gerente);
        this.canthab = canthab;
        this.desc = desc;
        this.campodep = campodep;
    }

    public Integer getCanthab() {
        return canthab;
    }

    public String getDesc() {
        return desc;
    }

    public String getCampodep() {
        return campodep;
    }

    public void setCanthab(Integer canthab) {
        this.canthab = canthab;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCampodep(String campodep) {
        this.campodep = campodep;
    }

    @Override
    public String toString() {
        return "Residencia{ Nombre = " + nombre + ", Cantidad de habitaciones = " + canthab + ", Hacen descuento o no = " + desc + ", Tiene campo deportivo o no = " + campodep + '}';
    }

}
