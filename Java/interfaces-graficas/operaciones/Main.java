/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2"));
        
        Operaciones op = new Operaciones();
        op.suma(num1, num2);  
        op.resta(num1, num2);
        op.multiplicacion(num1, num2);
        op.division(num1, num2);
        op.potencia(num2);
        op.promedio(num1, num2);  
            
        op.mostrarResultado();
    }
}