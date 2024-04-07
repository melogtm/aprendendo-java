import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    // Método para converter a temperatura de Celsius para Fahrenheit
    // Static - O método pertence à classe, e não a instância da classe
    // Public - O método pode ser acessado por qualquer classe
    // Adiantei, o professor ainda não passou isso. Apliquei o que aprendi em Python em OOP. 
    public static double convert(double celsius) {
        double fahr = ((9*celsius) / 5) + 32; 
        
        return fahr;
    }
    public static void main(String[] args) {
        // Do-While é uma estrutura de repetição que executa o bloco de código pelo menos uma vez, pois a condição é verificada no final

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        double celsius;
        char continueLoop; 
        
        // O bloco de código é executado pelo menos uma vez, pois a condição é verificada no final
        do {
            System.out.printf("Digite a temperatura em celsius: ");
            celsius = sc.nextDouble();
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", convert(celsius)); // Chamando o método convert
            System.out.printf("Deseja continuar? (s/n) ");
            continueLoop = sc.next().charAt(0);  // O método charAt(0) pega o primeiro caractere da string
        } while (continueLoop != 'n'); // Enquanto continueLoop for diferente de 'n', o bloco de código será executado
    }


}
