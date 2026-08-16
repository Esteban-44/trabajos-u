/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ucompensar.codigo;

import java.util.Scanner;

/**
 *
 * @author Janus
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner miTeclado = new Scanner(System.in);
        
        int temperatura;
        
        System.out.println("Ingrese la temperatura actual");
        temperatura = miTeclado.nextInt();
        
        if (temperatura <= 10) {
            System.out.println("Advertencia: Frio intenso");
        }
        if (temperatura >=10 && temperatura<=30) {
            System.out.println("Temperatura estable");
        }
        if (temperatura >30) {
            System.out.println("Alerta: Riesgo de sobrecalentamiento");
        }
    }
    
}
