import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         * Realiza un programa para que el usuario pueda introducir un número 
         * en binario y el programa muestre su conversión a decimal.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número binario: ");
        String binario = sc.nextLine();

        int decimal = 0;
        int potencia = 1;

        for (int i = binario.length() - 1; i >= 0; i--) {
            char bit = binario.charAt(i);

            if (bit == '1') {
                decimal += potencia;
            } else if (bit != '0') {
                System.out.println("Error: el número contiene caracteres no binarios.");
                sc.close();
                return;
            }

            potencia *= 2;
        }

        System.out.println("El número binario " + binario + " equivale a " + decimal + " en decimal.");
        sc.close();
    }
}