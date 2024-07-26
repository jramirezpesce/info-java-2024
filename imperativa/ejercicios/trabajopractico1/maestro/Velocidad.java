package imperativa.ejercicios.trabajopractico1.maestro;

/* Cálculo de la velocidad final:
Escribir un programa en Java que calcule la velocidad final de un objeto en caída
libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo
transcurrido
g = 9,80665
v_i = g * t
t = Math.sqrt(2*h/g)*/

import java.util.Scanner;

public class Velocidad {
    public static void main(String[] args) {
        System.out.println("El programa calculara la velocidad final de un objeto en caida libre.");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa la altura a la que se encuentra el  objeto: ");
        double h = entrada.nextDouble();
        double g = 9.80665;
        double t = Math.sqrt((2*h)/g);
        double v_i = g * t;
        double v_f = v_i + g * t;
        System.out.println("La velocidad final en caida libre de un objeto es: " + v_f);
    }
}
