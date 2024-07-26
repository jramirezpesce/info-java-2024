package imperativa.ejercicios.trabajopractico1.maestro;

/* Cálculo del área de un círculo: Escribir un programa en Java que calcule el área
de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se
resuelve. */

public class Area {
    public static void main(String[] args) {
        System.out.println("El programa calcula el area de un circulo con un radio de 5 unidades.");
        double r = 5;
        double area = Math.PI * Math.pow(r, 2);

        System.out.println("El area de un circulo con un radio de 5 unidades es: " + area);
    }
}