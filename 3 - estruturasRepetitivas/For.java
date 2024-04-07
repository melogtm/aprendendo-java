import java.util.Locale;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantosNum = sc.nextInt(); // Variável para armazenar a quantidade de números que serão informados
        int n = 0; // Variável para armazenar o número que será informado 
        int soma = 0; // Variável para armazenar a soma dos números


        for (int i = 0; i < quantosNum; i++) {
            n = sc.nextInt(); 
            soma += n; 
        }

        System.out.println("SOMA = " + soma);

        sc.close();

    }    
}
