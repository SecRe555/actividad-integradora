package actividadfinal;

import java.util.Scanner;

/**
 * Clase que calcula la diferencia entre dos números ingresados por el usuario.
 * Los números deben ser enteros. El resultado se devuelve como una cadena de
 * texto con los números en el rango, excluyendo los extremos. El rango se
 * genera en orden ascendente si el primer número es menor que el segundo, y en
 * orden descendente si el primer número es mayor que el segundo.
 *
 * Autor: Axel Luis Daniel Manzano Rodriguez
 */
public class DiferenciaNumeros {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean salida = false;
        System.out.print("Ingrese un numero: ");
        int num1 = in.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = in.nextInt();
        System.out.println(diferenciaNumeros(num1, num2));
    }

    /**
     * Calcula la diferencia entre dos números y devuelve una cadena de texto
     * con los números en el rango, excluyendo los extremos.
     *
     * @param num1 el primer número
     * @param num2 el segundo número
     * @return una cadena de texto con los números en el rango
     */
    public static String diferenciaNumeros(int num1, int num2) {
        String resultado = "";
        if (num1 < num2) {
            for (int i = ++num1; i < num2; i++) {
                if (i % 2 != 0) {
                    resultado += i;
                    if (i < num2 - 1) {
                        resultado += " - ";
                    }
                }
            }
        } else {
            for (int i = --num1; i > num2; i--) {
                if (i % 2 != 0) {
                    resultado += i;
                    if (i > num2 + 1) {
                        resultado += " - ";
                    }
                }
            }
        }
        return resultado;
    }
}
