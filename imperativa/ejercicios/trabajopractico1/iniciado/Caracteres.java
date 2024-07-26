package imperativa.ejercicios.trabajopractico1.iniciado;

/* Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char? */

public class Caracteres {
    public static void main(String[] args) {
        System.out.println("Este programa imprime mi nombre y responde a la siguiente pregunta: ¿Por qué no puede usar doble comillas en el char?");
        char letra = 'J';
        char letra2 = 'u';
        char letra3 = 'a';
        char letra4 = 'n';
        char letra5 = 'R';
        char letra6 = 'm';
        char letra7 = 'i';
        char letra8 = 'r';
        char letra9 = 'e';
        char letra10 = 'z';

        System.out.println("Mi nombre es: " + letra + letra2 + letra3 + letra4 + " " + letra5 + letra3 + letra6 + letra7 + letra8 + letra9 + letra10 + ".\nJava al ser un lenguaje fuertemente tipado diferencia las comillas simples de las dobles, reservando las primeras para los tipos de datos char y las segundas para los Strings.");
    }
}
