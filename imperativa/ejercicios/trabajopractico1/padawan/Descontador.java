package imperativa.ejercicios.trabajopractico1.padawan;

/* Descontador: Se le solicita que guarde un número en un espacio de memoria y
discretamente dicho número 20 veces sin usar asignación. ¿Que operador podría
usar para hacerlo? */

import java.util.Scanner;

public class Descontador {
    public static void main(String[] args) {
        System.out.println("El programa obtendra el decremento de 20 veces de un numero sin utilizar asignacion.");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        double n = entrada.nextDouble();
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        n--;
        System.out.println("El valor del número después de decrementarlo 20 veces es: " + n + ".\nEl operador a utilizar para incrementar el numero sin asignaiones es el operador --");
    }
}
