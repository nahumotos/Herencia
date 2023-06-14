
package ej.pkg1.herencia;

import ej.pkg1.herencia.Entidades.Animal;
import ej.pkg1.herencia.Entidades.Caballo;
import ej.pkg1.herencia.Entidades.Gato;
import ej.pkg1.herencia.Entidades.Perro;

public class main {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.alimentarse();
        
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.alimentarse();
        
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();
        
    }
    
}
