import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * Para dos números dados, a y b, es posible buscar el máximo común divisor 
         * (el número más grande que divide a ambos) mediante un algoritmo ineficiente 
         * pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente, 
         * el primer número que divide a ambos simultáneamente. Realiza un programa 
         * que calcule el máximo común divisor de dos números.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número (a): ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número (b): ");
        int b = sc.nextInt();

        int menor = (a < b) ? a : b;
        int mcd = 1;

        for (int i = menor; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                mcd = i;
                break;
            }
        }

        System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + mcd);

        sc.close();
    }
}