package imperativa.ejercicios.trabajopractico1.padawan;
/*Contador: Se le solicita que guarde un número en un espacio de memoria e
incremente dicho número 20 veces sin usar asignación. ¿Que operador podría usar
para hacerlo?*/

import java.util.Scanner;

public class Contador {
       public static void main(String[] args) {
           System.out.println("El programa obtendra un incremento de 20 veces de un numero sin utilizar asignacion.");
           Scanner entrada = new Scanner(System.in);
           System.out.println("Ingrese un numero: ");
           double n = entrada.nextDouble();
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           n++;
           System.out.println("El valor del número después de incrementarlo 20 veces es: " + n + ".\n" +
                   "El operador a utilizar para incrementar un numero sin asignaiones es el operador ++.");
    }

}
