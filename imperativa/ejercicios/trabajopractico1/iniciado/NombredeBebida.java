package imperativa.ejercicios.trabajopractico1.iniciado;

/* Nombre de bebida: Se le solicita que guarde en espacios de memoria distinta la
información de: El nombre de su última mascota y nombre de la última película
vista. Por último mostrarlo por pantalla*/

import java.util.Scanner;

public class NombredeBebida {
    public static void main(String[] args) {
        System.out.println("El siguiente programa generara un nombre de bebida a partir del nombre de tu ultima mascota y de tu ultima pelicula vista.");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el nombre de tu ultima mascota: ");
        String mascota = entrada.nextLine();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la ultima pelicula vista: ");
        String pelicula = entrada2.nextLine();

        System.out.println("Nombre de la proxima bebida: " + mascota + " " + pelicula);
    }
}
