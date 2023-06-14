package ej.pkg2.herencia.extra.Entidades;

public class EdificioDeOficinas extends Edificio {

    private Integer numo;
    private Integer cantp;
    private Integer nump;

    public EdificioDeOficinas() {

    }

    public EdificioDeOficinas(Integer numo, Integer cantp, Integer nump, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.numo = numo;
        this.cantp = cantp;
        this.nump = nump;
    }

    public Integer getNumo() {
        return numo;
    }

    public Integer getCantp() {
        return cantp;
    }

    public Integer getNump() {
        return nump;
    }

    public void setNumo(Integer numo) {
        this.numo = numo;
    }

    public void setCantp(Integer cantp) {
        this.cantp = cantp;
    }

    public void setNump(Integer nump) {
        this.nump = nump;
    }

    public void crearEdificioDeOficinas() {
        super.crearEdificio();
        System.out.println("Ingrese el número de oficinas del edificio de oficinas");
        setNumo(leer.nextInt());
        System.out.println("Ingrese la cantidad de personas por piso del edificio de oficinas");
        setCantp(leer.nextInt());
        System.out.println("Ingrese el número de pisos del edificio de oficinas");
        setNump(leer.nextInt());
    }

    public void cantPersonas() {
        int pxpiso = numo * cantp;
        int pedif = numo * cantp * nump;
        System.out.println("Hay " + pxpiso + " personas por piso en el eficio");
        System.out.println("Hay " + pedif + " personas en todo el edifico");
        System.out.println("");
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del edificio de oficinas es: " + (ancho * largo));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del edificio de oficinas es: " + (ancho * largo * alto));
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + super.toString() + " Número de oficinas = " + numo + ", Personas por piso = " + cantp + ", Número de pisos = " + nump + '}';
    }

}
