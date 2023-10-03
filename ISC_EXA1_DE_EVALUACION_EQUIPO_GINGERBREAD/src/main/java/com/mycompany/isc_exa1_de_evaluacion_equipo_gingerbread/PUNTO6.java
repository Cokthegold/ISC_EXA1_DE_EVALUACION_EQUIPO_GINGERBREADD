package com.mycompany.isc_exa1_de_evaluacion_equipo_gingerbread;

import java.util.*;
import java.lang.Math;

class PUNTO6 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int AceAn;
        int DisAR;
        int DisMet;
        int VelAprom;
        int VelMS;
        int AceMS;
        int FrecH;
        int rADIANES;
        int VELINI;
        int VELFIN;
        int TRO;
        int RADIO;

        System.out.println("Ingresa la velocidad angular inicial en radianes/s: ");
        VELINI = input.nextInt();
        System.out.println("Ingresa la velocidad angular final en radianes/s: ");
        VELFIN = input.nextInt();
        System.out.println("Ingresa el tiempo de rotación en segundos: ");
        TRO = input.nextInt();
        System.out.println("Ingresa el radio de la rueda en metros:  ");
        RADIO = input.nextInt();
        DisAR = (int) ((double) ((VELINI + VELFIN) * TRO) / 2);
        DisMet = DisAR * RADIO;
        VelAprom = (int) ((double) (VELINI + VELFIN) / 2);
        VelMS = VelAprom * RADIO;
        AceAn = (int) ((double) (VELFIN - VELINI) / TRO);
        AceMS = AceAn * RADIO;
        FrecH = (int) ((double) 1 / TRO);
        System.out.println("La distancia angular recorrida es: ");
        System.out.println(DisAR);
        System.out.println("La distancia en metros recorrida es: ");
        System.out.println(DisMet);
        System.out.println("La velocidad angular promedio recorrida es: ");
        System.out.println(VelAprom);
        System.out.println("La velocidad en metros por segundo recorrida es de: ");
        System.out.println(VelMS);
        System.out.println("La aceleración en metros por segundo es: ");
        System.out.println(AceMS);
        System.out.println("La aceleración angular es: ");
        System.out.println(AceAn);
        System.out.println("La frecuencia de giro en Hertz es: ");
        System.out.println(FrecH);
    }
}
