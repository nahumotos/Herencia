
package ej.pkg4.herencia.extra.Entidades;

public class Profesor extends Empleado {
    
    private String dep;

    public Profesor() {
        
    }

    public Profesor(String dep, Integer ainc, Integer numdes, String nombre, Integer num, String ecivil) {
        super(ainc, numdes, nombre, num, ecivil);
        this.dep = dep;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Profesor{" + "Departamento = " + dep + " - Empleado{" + "Año de incorporación = " + ainc + ", Número de despacho = " + numdes + " - Persona{" + "Nombre = " + nombre + ", Num de ID = " + num + ", Estado Civil = " + ecivil + '}';
    }

}
