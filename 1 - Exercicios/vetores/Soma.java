import java.util.Locale;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        /*
         * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        System.out.printf("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt(); 

        while ((n > 10) || (n <= 0)) {
            System.out.printf("Entrada inválida! Por favor, informe um número natural positivo menor que 10: ");
            n = sc.nextInt(); 
        }

        double[] vect = new double[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite um valor: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0; 

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i]; 
        }

        System.out.printf("VALORES = ");

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }
        
        System.out.println();

        System.out.printf("SOMA = %.2f\n", sum);
        System.out.printf("SOMA = %.2f\n", sum / vect.length);    
        sc.close(); 
    }
}
