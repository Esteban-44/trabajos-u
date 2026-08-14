import java.util.Scanner;

public class Impuesto_sueldo {
     static Scanner escaner = new Scanner (System.in);

    public static void main(String[] args) {
        double SUELDO_MAXIMO =69000000;
        System.out.println("Porfavor ingrese su sueldo (PESOS COLOMBIANOS)");
        double sueldo = escaner.nextDouble();

        if (sueldo>SUELDO_MAXIMO) {
        System.out.println("Esta persona debe abonar impuestos");
         } else {
        System.out.println("Esta persona no debe abonar impuestos");
         }
         
        escaner.close();  
    }
}