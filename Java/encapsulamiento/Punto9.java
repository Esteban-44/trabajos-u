// Clase Ciudad

import java.util.Scanner;

class Ciudad {

    // Atributo
    String nombre;
    int edad;
    public void info(){
        System.out.println("La ciudad se llama " + nombre + " y tiene " + edad + " años de antiguedad");
    }
}

public class Punto9 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        Ciudad Ciudad1 = new Ciudad();
        
        // Creamos la primera ciudad
        System.out.println("Ingrese el nombre de la ciudad");
        Ciudad1.nombre = escaner.nextLine();
        
        // Creamos la segunda ciudad
        System.out.println("Ingrese la edad de la ciudad");
        Ciudad1.edad = escaner.nextInt();

        Ciudad1.info();
        escaner.close();
    }
}
