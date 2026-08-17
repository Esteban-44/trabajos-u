package punto2;

import java.util.Scanner;

class Punto2 {
    private String nombre;
    private double precio;
    private int stock;

    public String getnombre() { return nombre; }
    public void setnombre(String nombre) { this.nombre = nombre; }
    public double getprecio() { return precio; }
    public void setprecio(double precio) { this.precio = precio; }
    public int getstock() { return stock; }
    public void setstock(int stock) { this.stock = stock; }
    
    public void mostrarinformacion(){
        System.out.println("El nombre del producto es " + nombre + " Su precio es " + precio + " y  tiene " + stock + " en stock");
    }
    
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        Punto2 producto1 = new Punto2();
        
        System.out.println("Ingrese el nombre del producto");
        producto1.setnombre(escaner.nextLine());
        
        System.out.println("Ingrese el precio del producto");
        producto1.setprecio(escaner.nextDouble());
        if (producto1.getprecio() < 0) {
            System.out.println("No puede ser negativo");
            escaner.close();
            return;
        }
        
        System.out.println("Ingrese el stock del producto");
        producto1.setstock(escaner.nextInt());
        if (producto1.getstock() < 0) {
            System.out.println("No puede ser negativo");
            escaner.close();
            return;
        }
        
        producto1.mostrarinformacion();
        escaner.close();
    }
}