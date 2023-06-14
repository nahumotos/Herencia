package ej.pkg4.herencia.extra.Entidades;

public class Estudiante extends Persona {

    protected String curso;

    public Estudiante() {

    }

    public Estudiante(String curso, String nombre, Integer num, String ecivil) {
        super(nombre, num, ecivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Curso = " + curso + " - Persona{" + "Nombre = " + nombre + ", Num de ID = " + num + ", Estado Civil = " + ecivil + '}';
    }

}
