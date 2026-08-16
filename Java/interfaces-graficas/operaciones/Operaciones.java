/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

/**
 *
 * @author JuanEstebanRamirezPi
 */
public class Operaciones {
    int suma;
    int resta;
    int multiplicacion;
    double division;
    double potencia;
    double promedio;
    
    
    public void suma(int num1, int num2) {
        this.suma = num1 + num2;
    }
    public void resta(int num1, int num2) {
        this.resta = num1 - num2;
    }
    public void multiplicacion(int num1, int num2) {
        this.multiplicacion = num1 * num2;
    }
    public void division(int num1, int num2) {
        this.division = (double) num1 / num2;    
    }
    public void potencia(int num2) {
        this.potencia = Math.pow(10, num2);
    }
    public void promedio(int num1, int num2) {
        this.promedio = (num1 + num2) /2.0;
    }
    
    public void mostrarResultado() {
        System.out.println("La suma da: " + suma);
        System.out.println("La resta da: " + resta);
        System.out.println("La multiplicacion da: " + multiplicacion);
        System.out.println("La division da: " + division);
        System.out.println("La potencia da: " + potencia);
        System.out.println("El promedio da: " + promedio);
    }
}
