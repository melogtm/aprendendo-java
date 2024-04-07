package MetodosEstaticos;
import java.util.Scanner;
import java.util.Locale;
import MetodosEstaticos.CalculatorNonStatic;
import MetodosEstaticos.CalculatorStatic;

// Membros estáticos, também chamados de membros de classe, são membros que pertencem à classe em si, e não a instâncias da classe.
/*
 São membros que fazem sentido existir mesmo que não exista um objeto instanciado.

 São o exato oposto de membros de instância.

 Aplicações comuns são constantes, métodos auxiliares (que não dependem de nenhum atributo de instância) e classes utilitárias.
Uma classe que só possui membros estáticos (como Math, por exemplo) não deve ser instanciada. É uma classe estática.

    Em Java, usamos a palavra static para declarar membros estáticos.
*/

public class Program {

    // Final - constante
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Versão 1 - sem membros estáticos, métodos na própria classe do Programa

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        // Versão 2 - Sem membros estáticos, métodos em uma classe separada
        CalculatorNonStatic calc = new CalculatorNonStatic(); // Por não ser estático, sou obrigado a instanciar.

        c = calc.circumference(radius);
        v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        // Versão 3 - Com membros estáticos - não é necessário instanciar. 

        c = CalculatorStatic.circumference(radius);
        v = CalculatorStatic.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", CalculatorStatic.PI);

        sc.close();
    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
