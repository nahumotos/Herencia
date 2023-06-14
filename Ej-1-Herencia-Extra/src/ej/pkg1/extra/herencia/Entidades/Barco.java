package ej.pkg1.extra.herencia.Entidades;

import ej.pkg1.extra.herencia.Interfaces.calculosBarco;

public class Barco extends Alquiler implements calculosBarco {

    protected Integer matricula;
    protected Integer eslora;
    protected Integer fabricacion;

    public Barco() {

    }

    public Barco(String nombre, Integer dni, Integer amarre, Integer dif, Barco ba, Integer matricula, Integer eslora, Integer fabricacion) {
        super(nombre, dni, amarre, dif, ba);
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public Integer getFabricacion() {
        return fabricacion;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public void setFabricacion(Integer fabricacion) {
        this.fabricacion = fabricacion;
    }

    public void crearBarcos() {
        super.crearAlquiler();
        super.diasOcupacion();
        System.out.println("Ingrese matrícula del barco");
        setMatricula(leer.nextInt());
        System.out.println("Ingrese metros de eslora del barco");
        setEslora(leer.nextInt());
        System.out.println("Ingrese año de fabricación del barco");
        setFabricacion(leer.nextInt());
    }

    @Override
    public void precio() {
        int precio = dif * (eslora * 10);
        System.out.println("El precio del alquiler del barco es de $" + precio);
        
    }

    @Override
    public String toString() {
        return "Barco{" + "Matricula = " + matricula + ", Eslora = " + eslora + ", Año de Fabricacion = " + fabricacion + '}';
    }

}
