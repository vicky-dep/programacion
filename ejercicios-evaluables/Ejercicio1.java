import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /* 
        * Realiza un programa que convierta un número decimal(base 10) 
        * en su representación binaria. Hay que tener en cuenta que desconocemos 
        * cuántas cifras tiene el número que introduce el Usuario. 
        */

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número decimal: ");
        int numero = sc.nextInt();
        
        String binario = "";

        if (numero == 0) {
            binario = "0";
        } else {
            while (numero > 0) {
                int resto = numero % 2;
                binario = resto + binario;
                numero = numero / 2;
            }
        }

        System.out.println("El número ingresado en binario es: " + binario);
        
        sc.close();
    }
}