import java.util.Scanner;

public class Cadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("Ingrese la letra que quiere buscar: ");
        String letra = scanner.nextLine();

        if (letra.isEmpty()) {
            System.out.println("No hay ninguna letra a analizar.");
        } else {
            char caracter = letra.charAt(0); 
            int resultado = buscarCaracter(cadena, caracter);
            System.out.println("La variable: " + caracter + "' aparece " + resultado + " veces en la cadena.");
        }

        scanner.close();
    }

    public static int buscarCaracter(String cadena, char letra) {
        return buscarCaracterRecursivo(cadena, letra, 0);
    }

    public static int buscarCaracterRecursivo(String cadena, char letra, int indice) {
        if (indice >= cadena.length()) {
            return 0;
        }

        int contar = (cadena.charAt(indice) == letra) ? 1 : 0;

        return contar + buscarCaracterRecursivo(cadena, letra, indice + 1);
    }
}


   



