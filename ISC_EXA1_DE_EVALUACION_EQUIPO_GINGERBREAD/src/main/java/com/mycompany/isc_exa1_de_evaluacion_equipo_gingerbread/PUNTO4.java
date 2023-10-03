package com.mycompany.isc_exa1_de_evaluacion_equipo_gingerbread;

/**
 *
 * @author Isaac
 */
import java.util.Scanner;
public class PUNTO4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
      int R1;
      int R2;
      int R3;
      int R4;
      int R5;
      double voltaje;
      double RE;
      double IC;
      int I1;
      int I2;
      int I3;
      int I4;
      int I5;
      
     
      
      System.out.println("Introduce el valor de la resistencia 1");
      R1 = scanner.nextInt();
      System.out.println("Introduce el valor de la resistencia 2");
      R2 = scanner.nextInt();
      System.out.println("Introduce el valor de la resistencia 3");
      R3 = scanner.nextInt();
      System.out.println("Introduce el valor de la resistencia 4");
      R4 = scanner.nextInt();
      System.out.println("Introduce el valor de la resistencia 5");
      R5 = scanner.nextInt();
      System.out.println("Introduce el voltaje");
      voltaje = scanner.nextDouble();
      RE = R1 + R2 + R3 + R4 + R5;
      IC = ((1/R1)+(1/R2)+(1/R3)+(1/R4)+(1/R5));
      I1 = (int) (voltaje/R1);
      I2 = (int) (voltaje/R2);
      I3 = (int) (voltaje/R3);
      I4 = (int) (voltaje/R4);
      I5 = (int) (voltaje/R5);
      System.out.println("La resistencia equivalente es");
      System.out.println(RE);
      System.out.println("La intencidad de corriente es");
      System.out.println(IC);
      System.out.println("La intencidad de corriente en la resistencia 1 es");
      System.out.println(I1);
      System.out.println("La intencidad de corriente en la resistencia 2 es");
      System.out.println(I2);
      System.out.println("La intencidad de corriente en la resistencia 3 es");
      System.out.println(I3);
      System.out.println("La intencidad de corriente en la resistencia 4 es");
      System.out.println(I4);
      System.out.println("La intencidad de corriente en la resistencia 5 es");
      System.out.println(I5);
    
      }
}
