import java.util.Scanner;

public class Vehiculo {
    public void acelerar() {
        System.out.println("El vehiculo esta acelerando");
    }

    public static class Carro extends Vehiculo {
        @Override
        public void acelerar() {
            System.out.println("El carro esta acelerando");
        }
    }
    public static class Moto extends Vehiculo {
        @Override
        public void acelerar() {
            System.out.println("La moto esta acelerando");
        }
    }
    public static class Bicicleta extends Vehiculo {
        @Override
        public void acelerar() {
            System.out.println("La bicicleta esta acelerando");
        }
    }
    
    public static void probarAceleracion(Vehiculo v) {
        v.acelerar();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elija el vehiculo");
        System.out.println("-------------------------");
        System.out.println("1: Carro");
        System.out.println("2: Moto");
        System.out.println("3: Bicicleta");
        
        int opcion = sc.nextInt();
        Vehiculo v = null;

        switch (opcion) {
            case 1:
                v = new Carro();
                break;
            case 2:
                v = new Moto();
                break;
            case 3:
                v = new Bicicleta();
                break;
            default:
            System.out.println("Opcion invalida");
        }

        if (v != null) {
            probarAceleracion(v); 
        }
        sc.close();
    }
}