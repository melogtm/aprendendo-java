import java.util.Scanner;
import java.util.Locale; 

public class Matriz {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        int countNegative = 0; 
        
        // Lendo a matriz
        for (int i = 0; i < mat.length; i++) { // Linhas
            for (int j = 0; j < mat[i].length; j++) { // Colunas
                mat[i][j] = sc.nextInt(); 
            }
        }

        System.out.println();

        System.out.println("Diagonal Principal: ");

        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        for (int i = 0; i < mat.length; i++) {
            // mat[i].length = número de colunas da linha i
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    countNegative++;
                }
            }
        }

        System.out.printf("Números negativos: %d\n", countNegative);

        sc.close(); 
    }
}