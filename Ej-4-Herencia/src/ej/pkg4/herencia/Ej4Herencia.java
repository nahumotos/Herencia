
package ej.pkg4.herencia;

import ej.pkg4.herencia.Entidades.Circulo;
import ej.pkg4.herencia.Entidades.Rectangulo;
import java.util.Scanner;

public class Ej4Herencia {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();
        
        System.out.println("Ingrese el radio del Circulo");
        c.setRadio(leer.nextDouble());

        System.out.print("El area del Círculo es: ");
        c.area();
        System.out.print("El perímetro del Círculo es: ");
        c.perimetro();
        
        System.out.println("");
        System.out.println("Ingrese la base del Rectángulo");
        r.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del Rectángulo");
        r.setAltura(leer.nextDouble());

        System.out.print("El area del Rectángulo es: ");
        r.area();
        System.out.print("El perímetro del Rectángulo es: ");
        r.perimetro();
        
    }
    
}
