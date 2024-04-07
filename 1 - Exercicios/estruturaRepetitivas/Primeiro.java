import java.util.Locale;
import java.util.Scanner;

// Imprimir em qual quadrante as coordenadas estão. 
public class Primeiro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in); 

        int x = sc.nextInt(); // Variável para armazenar o valor de x
        int y = sc.nextInt(); // Variável para armazenar o valor de y

        while ((x != 0) && (y != 0)) { // Enquanto x e y forem diferentes de 0
            if (x > 0) { // Se x for maior que 0
                if (y > 0) { // Se y for maior que 0
                    System.out.println("Primeiro");
                } else {
                    System.out.println("Quarto");
                }
            } else { // Se x for menor que 0
                if (y > 0) { // Se y for maior que 0
                    System.out.println("Segundo");
                } else {
                    System.out.println("Terceiro");
                }
            }
            x = sc.nextInt(); // Lê o valor de x de novo
            y = sc.nextInt(); // Lê o valor de y de novo
        } 

        // Utilizando in-line condition - Dá para fazer 2, mas preferi por 1 para simplificar leitura

        String quadrante; 

        while ((x != 0) && (y != 0)) {

            if (x > 0) {
                quadrante = y > 0 ? "primeiro" : "quarto"; 
                System.out.println("QUADRANTE = " + quadrante);
            } else {
                quadrante = y > 0 ? "segundo" : "terceiro"; 
                System.out.println("QUADRANTE = " + quadrante);
            }
            
            x = sc.nextInt();
            y = sc.nextInt(); 
        }

        sc.close(); 
    }    
}
