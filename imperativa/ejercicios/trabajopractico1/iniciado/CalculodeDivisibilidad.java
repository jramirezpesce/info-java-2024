package imperativa.ejercicios.trabajopractico1.iniciado;

/*Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
sumen, determine si el primer número es divisible por el segundo número y muestre
el resultado*/

import java.util.Scanner;

public class CalculodeDivisibilidad {
    public static void main(String[] args) {
        System.out.println("Este programa suma dos numeros y determina la divisibilidad del primer numero con respecto a el segundo.");
        Scanner n1 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int x = n1.nextInt();

        Scanner n2 = new Scanner(System.in);
        System.out.println("Ingrese el segundo numero: ");
        int y = n2.nextInt();

        int suma = x + y;
        int division = x / y;

        String divisible = ((division % 2 ) == 0)? " es divisible" : " no es divisible";

        System.out.println("El resultado de la suma es: " + suma + ".\n" +  x + divisible + " por " + y + ".");
    }
}
