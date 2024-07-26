package imperativa.ejercicios.trabajopractico1.iniciado;
/* Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
de quince multiplicaciones entre dos números enteros divididos por el número de la
multiplicación. Por ejemplo:
Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
El resultado mostrarlo por pantalla.
*/

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        System.out.println("El siguiente programa guarda en un espacio de memoria la acumulación\n" +
                "de quince multiplicaciones entre dos números enteros divididos por el número de la\n" +
                "multiplicación");

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        double n1 = numero1.nextDouble();
        System.out.println("Ingrese un numero: ");
        double n2 = numero1.nextDouble();

        double n3 = n1 * n2;
        double a = (n3 / 2) + (n3 / 3) + (n3 / 4) + (n3 / 5) + (n3 / 6) + (n3 / 7) + (n3 / 8) + (n3 / 9) + (n3 / 10) + (n3 / 11) + (n3 / 12) + (n3 / 13) + (n3 / 14) + (n3 / 15);
        System.out.println("El resultado de las multiplicaciones sucesivas es: " + a);
    }
}
