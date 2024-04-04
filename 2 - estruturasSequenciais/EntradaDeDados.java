import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        // Para ler dados do teclado, usamos a classe Scanner
        Scanner sc = new Scanner(System.in); // Tipo especial para entrada de dados. 
        // System.in é o teclado

        // Para ler uma palavra sem espaços
        String x;
        x = sc.next();

        System.out.println("Você digitou: " + x);

        // Para ler um número inteiro
        int y;
        y = sc.nextInt();

        System.out.println("Você digitou: " + y);

        // Para ler um número ponto flutuante
        double z;
        z = sc.nextDouble(); // Pega a localidade do sistema, você deve informar o separador decimal de acordo com a localidade

        System.out.println("Você digitou: " + z); // O println será no formato US
        // O printf imprimirá de acordo com a localidade
        System.out.printf("Você digitou: %.2f%n", z); // Imprimirá de acordo com a localidade
        
        // Para considerar a vírgula como separador decimal, você deve usar o Locale antes do Scanner

        // Para ler um caracter
        char w;
        w = sc.next().charAt(0); // Lê a primeira letra da palavra

        System.out.println("Você digitou: " + w);

        // Para ler vários dados na mesma linha
        String s1;
        int s2;
        double s3;
        s1 = sc.next();
        s2 = sc.nextInt();
        s3 = sc.nextDouble();

        System.out.println("Você digitou: " + s1);
        System.out.println("Você digitou: " + s2);
        System.out.println("Você digitou: " + s3);

        // Para ler até a quebra de linha
        String s4;
        s4 = sc.nextLine(); // Lê até a quebra de linha

        System.out.println("Você digitou: " + s4);

        // Quebra de linha pendente
        int s5;
        String s6;

        s5 = sc.nextInt();
        s6 = sc.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Você digitou: " + s5);
        System.out.println("Você digitou: " + s6); // Imprimirá uma string vazia

        // Para resolver, dê um sc.nextLine() antes para que ele consuma a quebra de linha 


        sc.close(); // Fechar o Scanner
    }
}
