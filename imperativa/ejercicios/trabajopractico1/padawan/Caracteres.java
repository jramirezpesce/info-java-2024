package imperativa.ejercicios.trabajopractico1.padawan;

/* Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
¿Qué es unicode? */

public class Caracteres {
    public static void main(String[] args) {
        System.out.println("El siguiente propgrama devuelve los caracteres de mi nombre en unicode.");

        char J = '\u004A';
        char u = '\u0075';
        char a = '\u0061';
        char n = '\u006E';

        System.out.println("Mi nombre en unicode es: " + J + u + a + n);
    }
}
