import java.util.Scanner;

public class BitWise {
    public static void main(String[] args) {
        // Bitwise - Operadores bit a bit 
        // & - E bit a bit
        // | - OU bit a bit
        // ^ - OU exclusivo (XOR) bit a bit - Se um for 1 e o outro 0, o resultado é 1. Se ambos forem 1 ou 0, o resultado é 0
        // ~ - Negação bit a bit - Inverte os bits
        // << - Deslocamento para a esquerda - Desloca os bits para a esquerda
        // >> - Deslocamento para a direita - Desloca os bits para a direita
        // >>> - Deslocamento para a direita sem sinal - Desloca os bits para a direita, preenchendo com 0s


        int n1 = 89; // 1011001
        int n2 = 60; // 111100

        System.out.println(n1 & n2); // 24 - 00011000
        System.out.println(n1 | n2); // 125 - 01111101
        System.out.println(n1 ^ n2); // 101 - 01100101
        System.out.println(~n1); // -90 - -90 em bits é 10101010
        System.out.println(n1 << 2); // 356 - 356 em bits é 101100100
        System.out.println(n1 >> 2); // 22 - 22 em bits é 00010110
        System.out.println(n1 >>> 2); // 22

        /*
         * Qual o uso de Bitwise? 
        Os operadores bitwise são úteis em várias situações, especialmente quando se trabalha com baixo nível de programação, manipulação de bits e otimização de desempenho. Aqui estão alguns exemplos:

            1. Controle de permissões: Você pode usar operadores bitwise para controlar um conjunto de permissões. Cada bit em um número inteiro pode representar uma permissão, e você pode usar operadores bitwise para verificar, definir ou limpar permissões individuais.
            2. Manipulação de cores: Em gráficos de computador, as cores são frequentemente representadas como um número inteiro de 32 bits, onde cada byte representa um componente de cor (alfa, vermelho, verde, azul). Os operadores bitwise podem ser usados para extrair ou modificar componentes de cor.
            3. Otimização de desempenho: Em alguns casos, os operadores bitwise podem ser usados para otimizar o desempenho, substituindo operações matemáticas mais lentas. Por exemplo, a multiplicação ou divisão por potências de 2 pode ser substituída por operações de deslocamento.
            4. Lembre-se de que o uso de operadores bitwise pode tornar o código mais difícil de entender, então use-os com cuidado e apenas quando necessário.
         */

        // Aplicando para achar se o 6 bit é 1 ou 0 de um número

        Scanner sc = new Scanner(System.in);

        int mask = 0b00100000; // 32 em binário
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true");
        } else {
            System.out.println("6th bit is false");
        }

        sc.close();

    }
}
