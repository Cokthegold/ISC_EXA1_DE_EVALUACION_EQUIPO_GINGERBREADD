package com.mycompany.isc_exa1_de_evaluacion_equipo_gingerbread;

/**
 *
 * @author Isaac
 */
import java.util.Scanner;
public class PUNTO3 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
      
        int radio;
        double agua;
        double m3;
        int area;
        
       
       
        System.out.println("Introduce radio de la tuberia");
        radio = scanner.nextInt();
        System.out.print("Introduce el flujo del agua");
        agua = scanner.nextDouble();
        area = (int) (3.1416 * radio * radio);
        m3 = (agua * area);
        System.out.println("La cantidad de agua que fluye es" + m3 + "metros cubicos");
     }
    
    
}
