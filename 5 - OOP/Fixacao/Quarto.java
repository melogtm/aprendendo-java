package Fixacao;
import java.util.Scanner;
import java.util.Locale;
import Fixacao.CurrencyConverter;

public class Quarto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in); 

        double dollarPrice, quantity; 

        System.out.printf("Preço do dólar: "); 
        dollarPrice = sc.nextDouble(); 

        System.out.printf("Valor em dólar: "); 
        quantity = sc.nextDouble(); 

        System.out.printf("Quantidade a ser paga em reais = R$ %.2f\n", CurrencyConverter.converter(dollarPrice, quantity));

        sc.close();
    }
}
