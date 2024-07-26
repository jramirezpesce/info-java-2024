package imperativa.ejercicios.trabajopractico1.caballero;

/*  Conversión de euros a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares */

import java.util.Scanner;

public class EurosaDolares {
    public static void main(String[] args) {
        System.out.println("El programa calcura el equivalente en dolares de una cantidad de euros ingresados.");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de euros que desea convertir: ");
        double euros = entrada.nextDouble();

        double dolares = 1.20;
        double total = euros * dolares;
        System.out.println("El equivalente en dolares es: " + total + "$.");
    }
}
