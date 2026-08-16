/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("==========================");
        System.out.println("BIENVENID@ A LA BIBLIOTECA");
        System.out.println("==========================");

        //Menu
        do {
            System.out.println("======== MENU ========");
            System.out.println("1. Agregar libro");
            System.out.println("2. Retirar libro");
            System.out.println("3. Mostrar libros");
            System.out.println("4. Mostrar historial");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del libro: ");
                    String libroAgregar = sc.nextLine();
                    Acciones.agregarLibro(libroAgregar);
                    break;

                case 2:
                    Acciones.retirarLibro();
                    break;

                case 3:
                    Acciones.mostrarLibros();
                    break;

                case 4:
                    Acciones.mostrarHistorial();
                    break;

                case 5:
                    System.out.println("Gracias por usar el sistema.");
                    break;

                default:
                    System.out.println("Opción inválida, intente de nuevo.");
                    break;
            }

        } while (opcion != 5);
        sc.close();
    }
}