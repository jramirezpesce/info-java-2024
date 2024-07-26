package imperativa.ejercicios.trabajopractico1.iniciado;

/* Mi nombre y edad: Se le solicita que guarde en un espacio de memoria su nombre
y apellido, luego guarde su edad e imprimalos por pantalla. */

public class NombreyEdad {
    public static void main(String[] args) {
        System.out.println("El siguiente programa muestra por pantalla mi nombre y edad.");
        String nombre = "Juan";
        String apellido = "Ramirez";
        int edad = 29;
        System.out.println("Mi nombre es " + nombre + " " + apellido + ".\nMi edad es " + edad + "años.");
    }
}
