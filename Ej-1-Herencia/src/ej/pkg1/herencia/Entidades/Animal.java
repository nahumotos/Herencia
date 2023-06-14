
package ej.pkg1.herencia.Entidades;

public class Animal {
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    public void alimentarse(){
        System.out.println(alimento);
    }
    
    
}
