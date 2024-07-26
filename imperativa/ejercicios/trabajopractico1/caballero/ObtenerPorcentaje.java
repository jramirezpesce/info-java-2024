package imperativa.ejercicios.trabajopractico1.caballero;

/* Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el
porcentaje que indique el segundo número del primer número. */

import java.util.Scanner;

public class ObtenerPorcentaje {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el valor de un numero entero: ");
        int e = entrada.nextInt();
        System.out.println("Ingresa el valor de un numero real: ");
        double r = entrada.nextDouble();

        double porcentaje = (r * 100) / e;
        System.out.println("El porcentaje obtenido es: " + porcentaje + "%.");
    }
}
