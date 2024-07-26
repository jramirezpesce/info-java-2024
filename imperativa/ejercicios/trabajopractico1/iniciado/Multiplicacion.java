package imperativa.ejercicios.trabajopractico1.iniciado;

/* Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
real? ¿Por qué?*/

import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        System.out.println("El siguiente programa guarda dos numeros enteros y dos reales, multiplica ambos pares de numeros y procede a sumar los resultados. Luego determina si el resultado es entero o real.");

        Scanner entero = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero: ");
        int a = entero.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int b = entero.nextInt();

        int multiplicacion = a * b;

        Scanner real = new Scanner(System.in);
        System.out.println("Ingrese el primer numero real: ");
        double c = real.nextDouble();
        System.out.println("Ingrese el segundo numero real: ");
        double d = real.nextDouble();

        double multiplicacion2 = c * d;
        double suma = multiplicacion + multiplicacion2;
        System.out.println("La resultado de la suma de las multiplicaciones es: " + suma + ".\nAl sumar un número real con un número entero, Java convierte automáticamente el número entero a un número real para realizar la operación. Por lo tanto, la suma de un número real y un número entero resulta en un número real.");
    }
}
