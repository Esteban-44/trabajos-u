import java.util.Scanner;

public class Punto4 {

    static class Libro {

        String Titulo;
        String Autor;
        int Paginas;

        public void info(){
            System.out.println("El libro se llama " + Titulo + " fue escrito por " + Autor + " y tiene " + Paginas + " paginas");
        }
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Scanner escaner1 = new Scanner(System.in);

        System.out.println("Ingrese el nombre del libro");
        libro1.Titulo = escaner1.nextLine();

        System.out.println("Ingrese el nombre del autor");
        libro1.Autor = escaner1.nextLine();

        System.out.println("Ingrese el numero de paginas");
        libro1.Paginas = escaner1.nextInt();

        System.out.println("----------------------------------");

        Libro libro2 = new Libro();
        Scanner escaner2 = new Scanner(System.in);  
        
        System.out.println("Ingrese el nombre del libro");
        libro2.Titulo = escaner2.nextLine();

        System.out.println("Ingrese el nombre del autor");
        libro2.Autor = escaner2.nextLine();

        System.out.println("Ingrese el numero de paginas");
        libro2.Paginas = escaner2.nextInt();

        libro1.info();
        libro2.info();

        escaner1.close();
        escaner2.close();
    }

    }

    
}
