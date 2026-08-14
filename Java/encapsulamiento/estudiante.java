import java.util.Scanner;

public class estudiante {
    private String nombre;
    private int edad;
    private String carrera;

    public estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    public void estudiar() {
        System.out.println("El estudiante se llama " + nombre + ", tiene " + edad + " años y estudia " + carrera);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la edad del estudiante:");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la carrera del estudiante:");
        String carrera = sc.nextLine();

        estudiante est = new estudiante(nombre, edad, carrera);

        est.estudiar();
        sc.close();
    }
}
