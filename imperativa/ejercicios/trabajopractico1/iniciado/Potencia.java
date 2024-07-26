package imperativa.ejercicios.trabajopractico1.iniciado;

/* Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y
luego haga la potencia de ese número al cuadrado y al cubo.*/

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        System.out.println("El siguiente programa potencia al cuadrado y al cubo un numero.");
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        double n = numero.nextDouble();

        double cuadrado = Math.pow(n, 2);
        double cubo = Math.pow(n, 3);

        System.out.println("El cuadrado de " + n + " es: " + cuadrado + ".\nEl cubo de " + cubo + " es: " + cubo + ".");
    }
}
