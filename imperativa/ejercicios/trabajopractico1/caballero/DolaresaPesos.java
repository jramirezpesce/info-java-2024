package imperativa.ejercicios.trabajopractico1.caballero;

/*Conversión de dólares a pesos: Escribir un programa en Java que solicite al
usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos*/

import java.util.Scanner;

public class DolaresaPesos {
    public static void main(String[] args) {
        System.out.println("El programa calcura el equivalente en pesos de una cantidad de dolares ingresados.");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de dolares que desea convertir: ");
        double dolares = entrada.nextDouble();

        int pesos = 20;
        double total = dolares * pesos;
        System.out.println("El equivalente en pesos es: " + total + "$.");
    }
}
