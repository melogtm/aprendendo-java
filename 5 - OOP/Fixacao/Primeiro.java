package Fixacao;
import Fixacao.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        Retangulo r = new Retangulo(); 


        System.out.println("Informe o comprimento e altura do retângulo: ");
        r.w = sc.nextDouble(); 
        r.h = sc.nextDouble(); 

        System.out.printf("AREA = %.2f\n", r.area());
        System.out.printf("PERIMETER = %.2f\n", r.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", r.diagonal());

        sc.close();
    }
}
