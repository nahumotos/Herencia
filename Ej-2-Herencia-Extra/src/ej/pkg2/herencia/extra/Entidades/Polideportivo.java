package ej.pkg2.herencia.extra.Entidades;

public class Polideportivo extends Edificio {

    private String nombre;
    private String tipo;

    public Polideportivo() {

    }

    public Polideportivo(String nombre, String tipo, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void crearPolideportivo() {
        super.crearEdificio();
        System.out.println("Ingrese el nombre del polideportivo");
        setNombre(leer.next());
        System.out.println("Ingrese el tipo de polideportivo");
        setTipo(leer.next());
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del polideportivo " + nombre + " es: " + (ancho * largo));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del polideportivo " + nombre + " es: " + (ancho * largo * alto));
    }

    @Override
    public String toString() {
        return "Polideportivo{" + super.toString() + " Nombre = " + nombre + ", Tipo = " + tipo + '}';
    }

}
