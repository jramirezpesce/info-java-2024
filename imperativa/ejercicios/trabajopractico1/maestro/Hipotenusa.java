package imperativa.ejercicios.trabajopractico1.maestro;

/* Cálculo de la hipotenusa de un triángulo:
Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
hipotenusa, a y b son los catetos. */

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        System.out.println("El siguiente programa caluca la hipotenusa de un triangulo dado los valorse de los catetos.");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el valor del primer de los catetos: ");
        double a = entrada.nextDouble();
        System.out.println("Ingresa el valor del segundo de los catetos: ");
        double b = entrada.nextDouble();
        double h = (Math.pow(a, 2) + Math.pow(b, 2))/2;
        System.out.println("El valor de la hipotenusa es: " + h);
    }
}
