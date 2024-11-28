package linkedlistexamples;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

    public static void main(String[] args) {
        
        List<Persona> lista = new LinkedList<Persona>();
        
        // Agregar al final
        lista.add(new Persona(1, "Cavani", 38));
        lista.add(new Persona(2, "Tevez", 40));
        lista.add(new Persona(3, "Rojo", 36));
        lista.add(new Persona(4, "Advincula", 39));
        
        // Agregar al principio
        lista.add(0, new Persona(10, "Roman", 42));
        
        System.out.println("****** foreach ******");
        for (Persona persona:lista) {
            System.out.println("Prueba " + persona.getNombre() );
        }
    }
    
}
