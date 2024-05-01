import java.util.Scanner;

public class MapearMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // Número de linhas 
        int n = sc.nextInt(); // Número de colunas

        int[][] mat = new int[m][n]; 

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt(); 
            }
        }

        int hold; 
        boolean hasLeft, hasTop, hasRight, hasBottom;
        int target = sc.nextInt(); // Nosso alvo!

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                hold = mat[i][j];
                hasLeft = hasTop = hasRight = hasBottom = true;

                if (hold == target) {
                    System.out.println("Position: " + (i + 1) + ", " + (j + 1));    
                    
                    if (i == 0) {
                        hasTop = false; 
                    }

                    if (j == 0) {
                        hasLeft = false; 
                    }

                    if (i == (m - 1)) {
                        hasBottom = false;
                    }

                    if (j == (n - 1)) {
                        hasRight = false;
                    }

                    if (hasLeft) {
                        System.out.printf("Left: %d\n", mat[i][j - 1]);
                    }
                    if (hasTop) {
                        System.out.printf("Top: %d\n", mat[i - 1][j]);
                    }
                    if (hasBottom) {
                        System.out.printf("Down: %d\n", mat[i + 1][j]); 
                    }
                    if (hasRight) {
                        System.out.printf("Right: %d\n", mat[i][j + 1]);
                    }
                }
            }
        }
        sc.close(); 
    }
}
