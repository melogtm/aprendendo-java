import java.util.Locale;
import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {
        /*
         * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma 
         * desses números com uma mensagem explicativa
         */

        Locale.setDefault(Locale.US);         
        Scanner sc = new Scanner(System.in);

        int a, b; 

        a = sc.nextInt(); 
        b = sc.nextInt(); 

        System.out.println("SOMA = " + (a + b));

        sc.close(); 
        }    
}
