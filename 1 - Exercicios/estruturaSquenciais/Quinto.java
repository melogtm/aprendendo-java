import java.util.Locale;
import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        /*
         * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de 
         * cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
         * Calcule e mostre o valor a ser pago
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        int pUmCodigo, pDoisCodigo; 
        int pUm_numero, pDois_numero; 
        double preco_um, preco_dois; 

        // Para peça 1 
        pUmCodigo = sc.nextInt();
        pUm_numero = sc.nextInt();
        preco_um = sc.nextDouble(); 

        // Para peça 2 
        pDoisCodigo = sc.nextInt();
        pDois_numero = sc.nextInt(); 
        preco_dois = sc.nextDouble(); 

        // Adiantando um pouco as aulas >:]
        if (pUmCodigo == pDoisCodigo) {
            System.err.println("As peças precisam ser diferentes!");
            System.exit(-1);
        }

        // Total a Pagar

        double totalPagar = (preco_dois * pDois_numero) + (preco_um * pUm_numero); 

        System.out.printf("TOTAL A PAGAR: R$ %.2f\n", totalPagar);

        sc.close();
    }
}
