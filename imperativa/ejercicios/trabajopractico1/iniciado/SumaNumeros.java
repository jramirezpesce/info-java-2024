package imperativa.ejercicios.trabajopractico1.iniciado;

/*Suma de dos números: Se le solicita que guarden dos números enteros y los
sumen. El resultado mostrarlo por pantalla.*/

/*Suma de dos números bis: Se les solicita que guarden dos números enteros y los
sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
indique si se trata de un número par o impar*/

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        System.out.println("El siguiente programa suma dos numeros y procede a determinar su paridad.");

        Scanner num1 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int x = num1.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int y = num1.nextInt();
        int suma = x + y;

        int division = suma % 2;
        String divisibilidad = ((division > 0) ? "impar" : "par");

        System.out.println("el resultado es: " + suma + " y es " + divisibilidad);

    }
}
