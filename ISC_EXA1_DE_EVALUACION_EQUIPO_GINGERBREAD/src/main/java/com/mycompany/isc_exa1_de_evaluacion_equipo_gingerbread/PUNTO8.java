package com.mycompany.isc_exa1_de_evaluacion_equipo_gingerbread;

/**
 *
 * @author Julian
 */
import java.util.Scanner;
public class PUNTO8 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
     
        String c;
        int eMAY;
        int eMEN;
        int dF;
        int cV;
        int cF;

        System.out.println("Ingresa las coordenadas del centro");
        c = input.nextLine();
        System.out.println("A continuación ingresa las medidas de los divisores Eje mayor y Eje menor");
        System.out.println("Eje Mayor");
        eMAY = input.nextInt();
        System.out.println("Eje menor");
        eMEN = input.nextInt();
        dF = (int) Math.pow(Math.pow((double) eMAY, (double) 2) + Math.pow((double) eMEN, (double) 2), 0.5);
        cV = (int) ((double) eMAY / 2);
        cF = dF;
        System.out.println("Los resultados son: ");
        System.out.println("Distancia focal");
        System.out.println(dF);
        System.out.println("Coordenadas de los vertices");
        System.out.println(cV);
        System.out.println("Coordenadas de los focos");
        System.out.println(cF);
    }
}
