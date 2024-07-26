package imperativa.ejercicios.trabajopractico1.maestro;

/* Cálculo de la energía cinética:
Escribir un programa en Java que calcule la energía cinética de un objeto en
movimiento, dados su masa y su velocidad.
Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa
del objeto y v es la velocidad.
Muestre el resultado por pantalla */

import java.util.Scanner;

public class EnergiaCinetica {
    public static void main(String[] args) {
        System.out.println("El programa calculara la energia cinetica de un objeto a partir de su masa y velocidad.");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa la masa del objeto : ");
        double m = entrada.nextDouble();
        System.out.print("Ingresa la velocidad del objeto : ");
        double v = entrada.nextDouble();
        double e = (1/2) * m * Math.pow(v, 2);
        System.out.println("La energia cinetica del objeto es: " + e);
    }
}
