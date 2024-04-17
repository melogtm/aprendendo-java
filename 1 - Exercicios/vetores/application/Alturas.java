package app;

import app.entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 


        System.out.printf("Quantas pessoas serão digitadas? ");

        int n = sc.nextInt(); 
        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Dados da %da pessoa: \n", (i + 1));

            String pName; 
            int pAge;
            double pHeight; 

            sc.nextLine();

            System.out.printf("Nome: ");
            pName = sc.nextLine(); 

            System.out.printf("Idade: ");
            pAge = sc.nextInt(); 

            System.out.printf("Altura: ");
            pHeight = sc.nextDouble(); 

            pessoas[i] = new Pessoa(pName, pAge, pHeight);
        }

        System.out.println();

        System.out.printf("Altura média: %.2f\n", average_height(pessoas)); 

        System.out.printf("Pessoas com menos de 16 anos: %.1f%% \n", ((double) howManyMinors(pessoas) / pessoas.length) * 100.0);

        String[] minors = nameMinors(pessoas, howManyMinors(pessoas)); 

        for(int i = 0; i < minors.length; i++ ){
            System.out.printf("%s\n", minors[i]); 
        }

        sc.close(); 
    }

    public static double average_height(Pessoa[] pessoas) {
        double sum = 0.0; 

        for (int i = 0; i < pessoas.length; i++) {
            sum += pessoas[i].getHeight(); 
        }

        return sum / pessoas.length; 
    }

    public static int howManyMinors(Pessoa[] pessoas) {
        int quantity = 0; 

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAge() < 16 ) {
                quantity++; 
            }
        }

        return quantity; 
    }

    public static String[] nameMinors(Pessoa[] pessoas, int quantity) {
        String[] names = new String[quantity];
        int j = 0; 

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAge() < 16) {
                names[j] = pessoas[i].getName(); 
                j++; 
            }
        }

        return names; 
    }
}
