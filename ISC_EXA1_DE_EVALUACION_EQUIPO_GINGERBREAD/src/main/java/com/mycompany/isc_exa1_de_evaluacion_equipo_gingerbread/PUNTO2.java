package com.mycompany.isc_exa1_de_evaluacion_equipo_gingerbread;

/**
 *
 * @author Kenneth
 */
import java.util.Scanner;

public class PUNTO2 {
    public static void main(String[] args) {
        double faren;
        double cel;
        double kelvin;
        Scanner input = new Scanner(System.in);
        System.out.print("Escribe los grados en farenheit");
        faren = input.nextDouble();
        cel = (faren - 32) * (0.555);
        System.out.print("Los grados en celcius son: ");
        System.out.println(cel);
        kelvin = 0.555 * (faren - 32) + 273.15;
        System.out.print("LOs grados en kelvin son: ");
        System.out.println(kelvin);
           
    }
   
   
}
