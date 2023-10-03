package com.mycompany.isc_exa1_de_evaluacion_equipo_gingerbread;

/**
 *
 * @author Julian
 */
import java.util.Scanner;
public class PUNTO5 {

    public static void main(String[] args) {
        System.out.println("Programa para calcular la distancia y altura máxima que alcanza un objeto lanzado por un cañón a 45°");
        double g = 9.8; // Gravedad en m/s^2 (debe ser un valor decimal)
        int angulo = 45;
        double radianes = Math.toRadians(angulo); // Convierte grados a radianes
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la velocidad inicial en m/s: ");
        double VI = input.nextDouble();

        double distanciaAlcanzada = (VI * VI * Math.sin(2 * radianes)) / g;
        double h = (VI * VI * Math.pow(Math.sin(radianes), 2)) / (2 * g);

        System.out.println("La distancia alcanzada es: " + distanciaAlcanzada + " metros");
        System.out.println("La Altura máxima alcanzada es: " + h + " metros");
    }
}
