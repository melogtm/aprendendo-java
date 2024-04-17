import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    /*
     * Faça um programa que leia um número inteiro positivo N (máximo = 10) e 
     * depois N números inteiros e armazene-os em um vetor. 
     * Em seguida, mostrar na tela todos os números negativos lidos.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        System.out.printf("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt(); 

        while ((n > 10) || (n <= 0)) {
            System.out.printf("Entrada inválida! Por favor, informe um número natural positivo menor que 10: ");
            n = sc.nextInt(); 
        }

        int[] vect = new int[n];     
        
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite um número: ");
            vect[i] = sc.nextInt(); 
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }

        sc.close(); 
    }
}
