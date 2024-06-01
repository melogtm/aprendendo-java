import java.util.Locale;

public class SaídadeDados {
    public static void main(String[] args) {
        // Sem quebra de linha ao final da impressão
        System.out.print("Olá, Mundo!");
        // Com quebra de linha ao final da impressão
        System.out.println("Olá, Mundo!");

        // Escrever conteúdo de uma variável de algum tipo básico
        int numero = 42;
        System.out.println(numero);

        // Escrever conteúdo de uma variável com ponto flutuante.
        double x = 10.35784;
        // %n = quebra de linha independente de plataforma. %f = ponto flutuante, printf = print formatado
        System.out.println(x);
        System.out.printf("%.2f%n", x); // 10,36
        System.out.printf("%.4f%n", x); // 10,3578
        // Repare que printf retorna com vírgula, por pegar o formato do computador.
        // Para imprimir em formato americano (.)
        Locale.setDefault(Locale.US);

        // Para concatenar vários elementos em um mesmo comando de escrita, para print e println, basta usar +
        System.out.println("RESULTADO = " + x + " METROS");
        // Para printf: "TEXTO 1 %f TEXTO 2 %f TEXTO 3", variavel1, variavel2 
        System.out.printf("RESULTADO = %.2f metros%n", x);
        // Outro meio
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
