package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSemOOP {
    public static double calcular_area(double a, double b, double c) {
        double semi_per = (a + b + c) / 2; 

        return Math.sqrt((semi_per*(semi_per - a)*(semi_per - b)*(semi_per - c))); 
    }
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        double a1, b1, c1; 
        System.out.println("Informe os lados do primeiro triângulo: ");
        a1 = sc.nextDouble();
        b1 = sc.nextDouble();
        c1 = sc.nextDouble();

        double a2, b2, c2; 
        System.out.println("Informe os lados do segundo triângulo: ");
        a2 = sc.nextDouble();
        b2 = sc.nextDouble();
        c2 = sc.nextDouble();

        double areaPrimeiro = calcular_area(a1, b1, c1);
        double areaSegundo = calcular_area(a2, b2, c2);

        System.out.printf("Área do Primeiro Retângulo: %.4f\n", areaPrimeiro);
        System.out.printf("Área do Segundo Retângulo: %.4f\n", areaSegundo);
        System.out.printf("Área do Maior: %s\n", areaPrimeiro > areaSegundo ? "Primeiro" : "Segundo");

        sc.close();
    }
}