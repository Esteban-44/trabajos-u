import java.util.Scanner;

public class Arreglo10 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int [] arreglo = new int [10];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            arreglo[i] = escaner.nextInt();
           
        }
        System.out.println("Los numeros son: ");
        for (int i = 0; i < arreglo.length; i++) {
            if (i < arreglo.length - 1) {
            System.out.print(arreglo[i] + ", ");
        } else {
            
        System.out.print(arreglo[i]);
    }
}
        escaner.close();
    }
}
