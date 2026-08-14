import java.util.Scanner;

public class Calculadora_ahorro {
     static Scanner escaner = new Scanner (System.in);

      public static void main(String[] args) {
        System.out.println("Ingrese la potencia de la bombilla tradicional");
         double potencia_tr = escaner.nextDouble();

        System.out.println("Ingrese la potencia de la bombilla LED");
         double potencia_led = escaner.nextDouble();

        System.out.println("Ingrese las horas diarias de uso de cada bombilla");
         int horas = escaner.nextInt();

         double energia_tr = (potencia_tr * horas);
         double energia_led = (potencia_led * horas);

         double ahorro = (energia_tr - energia_led);
         double porcentaje_ahorro = (ahorro/energia_tr) * 100;

         System.out.println("Consumo tradicional diario:"+ energia_tr+ " Wh");
         System.out.println("Consumo LED diario:"+ energia_led+ " Wh");
         System.out.println("Porcentaje ahorro:"+ porcentaje_ahorro+"%");

         double diferencia = Math.abs(energia_tr - energia_led);

         double diferenciaPorcentual = (diferencia / energia_tr) * 100;

         diferenciaPorcentual = Math.ceil(diferenciaPorcentual);
         

          if (porcentaje_ahorro >= 30) {
            System.out.println("¡Recomendación:Cambiar a bombillas LED");
         } else {
            System.out.println("No es necesario cambiar a LED por ahora");
         }


        escaner.close();  
    }
}
