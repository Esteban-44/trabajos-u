/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

import java.util.LinkedList;
import java.util.Queue;

public class Acciones {

    private static Queue<String> colaLibros = new LinkedList<>();
    private static Queue<String> historial = new LinkedList<>();

    static {
        colaLibros.add("El principito");
        colaLibros.add("Cien años de soledad");
        colaLibros.add("1984");
        colaLibros.add("Harry potter ");
        colaLibros.add("El señor de los anillos");

        registrar("Sistema iniciado con libros predeterminados.");
    }
    // Agregar libro 
    public static void agregarLibro(String nombre) {
        colaLibros.add(nombre);
        registrar("Se agregó el libro: " + nombre);
    }
    // Retirar libro 
    public static void retirarLibro() {
        String retirado = colaLibros.poll();
        System.out.println("Libro retirado: " + retirado);
        registrar("Se retiro el libro: " + retirado);
        if (colaLibros.isEmpty()) {
            System.out.println("No hay libros para retirar.");
            return;
        }
        
    }
    // Mostrar libros
    public static void mostrarLibros() {
        if (colaLibros.isEmpty()) {
            System.out.println("No hay libros en la cola.");
            return;
        }

        System.out.println("Libros en cola:");
        for (String libro : colaLibros) {
            System.out.println("- " + libro);
        }
    }
    // Mostrar historial
    public static void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("Historial vacío.");
            return;
        }

        System.out.println("Historial:");
        for (String mov : historial) {
            System.out.println("- " + mov);
        }
    }
    private static void registrar(String mov) {
        historial.add(mov);
    }
}