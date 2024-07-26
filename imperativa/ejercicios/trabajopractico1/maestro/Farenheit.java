package imperativa.ejercicios.trabajopractico1.maestro;

/* Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
la fórmula con la que se resuelve. */

import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {
        System.out.println("El siguiente programa realiza una conversion de una temperatura en grados Celsius a grados Fahrenheit.");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el valor en Celsius a convertir: ");
        double celsius = entrada.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("El valor de " + celsius + "°C equivale a " + fahrenheit + "°F.");
    }
}
