import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner miTeclado = new Scanner(System.in);
        
        double monto;
        String calificacion;
        
        System.out.println("Porfavor ingrese el monto de la cuenta");
        monto = miTeclado.nextDouble();
        miTeclado.nextLine();
        
        System.out.println("¿Como califica nuestro servicio? (malo/regular/bueno/excelente)");
        calificacion = miTeclado.nextLine();
        
        if (calificacion.equals("malo")) {
            System.out.println("Este es el total: " + monto * 1.00);
        } else if (calificacion.equals("regular")) {
            System.out.println("Este es el total: " + monto * 1.10);
        } else if (calificacion.equals("bueno")) {
            System.out.println("Este es el total: " + monto * 1.15);
        } else if (calificacion.equals("excelente")) {
            System.out.println("Este es el total: " + monto * 1.20);
        } else {
            System.out.println("Calificación no reconocida");
        }
        
        miTeclado.close();
    }
}