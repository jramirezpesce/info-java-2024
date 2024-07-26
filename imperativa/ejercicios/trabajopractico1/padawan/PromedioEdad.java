package imperativa.ejercicios.trabajopractico1.padawan;
/*  Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades. */

import java.util.Scanner;

public class PromedioEdad {
    public static void main(String[] args) {
        System.out.println("El siguiente programa toma los nombres y edades de dos personas y muestra su promedio.");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = entrada.nextInt();

        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre2 = entrada2.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad2 = entrada2.nextInt();

        System.out.println("Nombre: " + nombre + ".\n" +
                "Edad: " + edad + ". \n" +
                "\nNombre: " + nombre2 + ".\n" +
                "Edad: " + edad2 + ". \n" +
                "\nEl promedio de las edades es: " + (edad + edad2) / 2 + ".");
    }
}
