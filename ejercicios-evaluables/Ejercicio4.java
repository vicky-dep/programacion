import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
         * Calcula la raíz cuadrada de un número natural mediante aproximaciones. 
         * En el caso de que no sea exacta, muestra el resto. Por ejemplo, para calcular 
         * la raíz cuadrada de 23,probamos 12 = 1, 22  = 4, 32  =9, 42  = 16, 52  = 25 
         * (nos pasamos), resultando 4 la raíz cuadrada de 23 con un resto (23 — 16) de 7.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número natural: ");
        int n = sc.nextInt();

        int i = 1;
        int cuadrado = 1;

        while (cuadrado <= n) {
            i++;
            cuadrado = i * i;
        }

        // Cuando salimos del bucle, i^2 > n, así que la raíz entera es i - 1
        int raiz = i - 1;
        int resto = n - (raiz * raiz);

        System.out.println("La raíz cuadrada de " + n + " es " + raiz + " con un resto de " + resto);

        sc.close();
    }
}