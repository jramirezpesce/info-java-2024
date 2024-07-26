package imperativa.ejercicios.trabajopractico1.maestro;

/* Cálculo de la media aritmética:
Escribir un programa en Java que calcule la media aritmética de un conjunto de
números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
los números y k es el número total de elementos. Utilicen variables y constantes
según corresponda.*/

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        System.out.println("El programa calcula la media de aritmetica de un conjunto de tres numeros ingresados.");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer valor numerico: ");
        double n1 = entrada.nextDouble();
        System.out.print("Ingrese el segundo valor numerico: ");
        double n2 = entrada.nextDouble();
        System.out.print("Ingrese el tercer valor numerico: ");
        double n3 = entrada.nextDouble();
        double media = (n1 + n2 + n3) / 3;
        System.out.println("La media de aritmetica es: " + media);
    }
}
