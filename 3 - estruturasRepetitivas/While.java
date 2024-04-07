import java.util.Locale;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        int x = sc.nextInt();
        int soma = 0; // Variável para armazenar a soma dos números

        // While Loop em Java - Enquanto a condição for verdadeira, o bloco de código será executado
        while (x != 0) {
            soma += x; // Adiciona o valor de x à variável soma
            x = sc.nextInt();
        }

        System.out.println("Soma = " + soma);
    }    
}
