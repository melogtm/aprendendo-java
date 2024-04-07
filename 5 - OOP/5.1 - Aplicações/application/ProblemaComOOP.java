package application;
import entities.Triangle;
import java.util.Scanner;
import java.util.Locale;

public class ProblemaComOOP {
    public static void main(String[] args) {
        // Triângulo é uma entidade, então vamos criar uma classe para representá-lo
        /*
         A classe é um tipo de dado que contém atributos (dados) e métodos (funções).
         
         Ela também pode prover outros recursos, como encapsulamento, construtores, sobrecarga, herança e polimorfismo.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        // Classe: é a definição do tipo de dado
        Triangle x, y;
        // Antes do New, todas as variáveis são declaradas na Stack, inclusive Triangle x, y; 

        // A partir do "new", a memória é alocada no Heap (objetos dinâmicos). Em x, estará o endereço de memória do objeto Triangle
        x = new Triangle(); // Objetos: x, y - instâncias da classe Triangle
        y = new Triangle();

        System.out.println("Informe os lados do primeiro triângulo: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Informe os lados do segundo triângulo: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaPrimeiro = x.calcular_area();
        double areaSegundo = y.calcular_area();

        System.out.printf("Área do Primeiro Retângulo: %.4f\n", areaPrimeiro);
        System.out.printf("Área do Segundo Retângulo: %.4f\n", areaSegundo);
        System.out.printf("Área do Maior: %s\n", areaPrimeiro > areaSegundo ? "Primeiro" : "Segundo");

        sc.close();
    }
}
