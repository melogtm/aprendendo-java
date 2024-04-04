import java.util.Locale;
import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
    /*
     * Faça um programa para ler o valor do raio de um círculo, e depois 
     * mostrar o valor da área deste círculo com quatro casas decimais.
    */

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in); 

    double r; 
    r = sc.nextDouble(); 

    double PI = 3.14159;

    double resultado = Math.pow(r, 2) * PI; 

    System.out.printf("A=%.4f%n", resultado);

    sc.close(); 
    
    }
}
