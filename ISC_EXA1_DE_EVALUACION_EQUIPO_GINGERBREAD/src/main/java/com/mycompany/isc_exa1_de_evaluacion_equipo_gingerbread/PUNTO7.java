package com.mycompany.isc_exa1_de_evaluacion_equipo_gingerbread;

/**
 *
 * @author Julian
 */
import java.util.Scanner;
public class PUNTO7 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
            double xpen;
	    double x1;
	    double x2;
	    double ypen;
	    double area;
	    Scanner input = new Scanner(System.in);
	   	System.out.println("En este apartado pediremos primero valores para una pendiente y luego un area");
		System.out.println("Introduce el valor de X para la pendiente");
		xpen = input.nextDouble();
		ypen = 2 * xpen;
		System.out.print("La pendiente es: ");
		System.out.println(ypen);
		
		System.out.println("ahora buscaremos la area, proporciona 2 valores x");
		System.out.println("introduce el primer valor x");
		x1 = input.nextDouble();
		System.out.println("introduce el segundo valor x");
		x2 = input.nextDouble();
		area = x1 * x2;
		System.out.print("El valor del area usando los 2 valores x introducidos es: ");
		System.out.println(area);
  
     
     
     
     }       
}
