import java.util.Scanner;

public class Punto1 {

    static class Persona {
        String nombre;
        int edad;
        
        public void saludar(){
            System.out.println("Hola mi nombre es " + nombre + " y tengo " + edad + " años");
        }
    }

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        persona1.nombre = escaner.nextLine();

        System.out.println("Ingrese su edad:");
        persona1.edad = escaner.nextInt();

        persona1.saludar();

        escaner.close();
    }
}
