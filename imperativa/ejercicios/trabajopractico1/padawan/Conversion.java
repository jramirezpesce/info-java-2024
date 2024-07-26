package imperativa.ejercicios.trabajopractico1.padawan;

/* Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
una constante de los valores que no van a cambiar en esta conversión. Muestre el
resultado por pantalla */

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        System.out.println("El programa convierte un valor ingresado en libras a kilogramos.");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el valor en libras: ");
        double libras = entrada.nextDouble();

        double kilo = 0.453592;
        double conversion = kilo * libras;
        System.out.println("El valor de la conversacion de libras a kilos es: " + conversion);
    }
}
