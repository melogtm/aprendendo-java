import java.util.Locale;
import java.util.Scanner;

public class Quarto {
    public static void main(String[] args) {
        /*
         * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
         * o valor que recebe por hora e calcula o salário desse funcionário. 
         * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horasTrabalho;
        double salarioPorHora; 
        
        numeroFuncionario = sc.nextInt(); 
        horasTrabalho = sc.nextInt(); 

        salarioPorHora = sc.nextDouble(); 

        double salarioFinal = horasTrabalho * salarioPorHora; 

        System.out.printf("NUMBER = %d%n", numeroFuncionario);
        System.out.printf("SALARY = %.2f%n", salarioFinal);

        sc.close();

    }
}
