import java.util.Scanner;

public class Numeromayor {
    static Scanner escaner = new Scanner (System.in);
     
public static void main(String[] args) {
    System.out.println("Porfavor ingrese el primer numero");
    int numero1 = escaner.nextInt();

    System.out.println("Porfavor ingrese el segundo numero");
    int numero2 = escaner.nextInt();

    if (numero1==numero2) {
        System.out.println("Los dos numeros son iguales");
    } else {
        if (numero1>numero2) {
        System.out.println("El numero mayor es " + numero1);
    } else {
        System.out.println("El numero mayor es " + numero2);
    }

    }
}
}
