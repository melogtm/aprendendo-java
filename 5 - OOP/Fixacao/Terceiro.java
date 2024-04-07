package Fixacao;
import java.util.Scanner;
import java.util.Locale;
import Fixacao.Estudante; 

public class Terceiro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        Estudante e = new Estudante(); 

        e.name = sc.nextLine(); 
        e.p1 = sc.nextDouble();
        e.p2 = sc.nextDouble();
        e.p3 = sc.nextDouble();

        double fG = e.calculate_average();

        System.out.println("FINAL GRADE = " + fG);

        System.out.println(e.result(fG));

    }
}
