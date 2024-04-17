/*
"Vetor" é o nome dado a arranjos unidimensionais em Java. 

Arranjo é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo. Alocada de uma vez só, em um bloco contíguo de memória.

Vantagem: 
O(1) para acessar um elemento pelo índice.
Desvantagem:
O(n) para inserir ou remover um elemento no início ou meio do arranjo.
Tamanho fixo.

*/

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exemplo de cálculo de média de alturas para Vetores Tipo Valor.
        int n = sc.nextInt(); // Tamanho do vetor

        // Vetor para guardar as alturas
        // O new garante que a variável "vect" vai apontar para um novo objeto no Heap (memória dinâmica) 
        double[] vect = new double[n]; // Valor-padrão para double: 0.0 [0.0, 0.0, 0.0, ...]
        /*
        stack    heap
         vect -> [0x61ff] -> [0.0, 0.0, 0.0, ...]
        */

        // Lendo as alturas
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        // Soma das alturas
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        // Média das alturas
        double avg = sum / n;

        System.out.printf("Average height: %.2f%n", avg);

        // Vamos criar um problema onde o vetor é um vetor de objetos (Tipo Referência)

        n = sc.nextInt();

        Product[] vectObj = new Product[n]; // Valor-padrão para referência: null
        /*
        Stack   Heap
        n = 3 
        vect -> [0x61ff] -> [null, null, null]
        
        A jogada está aí, como o valor padrão para referência é null, não podemos acessar os elementos do vetor sem instanciá-los.
        */

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vectObj[i] = new Product(name, price);
        }

        double sumPrices = 0.0;

        for (int i = 0; i < n; i++) {
            sumPrices += vectObj[i].getPrice();
        }

        double avgPrices = sumPrices / n;

        System.out.printf("Average price: %.2f%n", avgPrices);

        sc.close();
    }
}
