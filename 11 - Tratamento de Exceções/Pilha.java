import java.util.Scanner;

public class Pilha {
    public static void main(String[] args) {
        

        metodo1();

        System.out.println("End of program!");
    }

    public static void metodo1(){
        System.out.println("***METHOD 1 START***");
        metodo2();
        System.out.println("***METHOD 1 END***");
    }


    public static void metodo2() {
        System.out.println("***METHOD 2 START***");
        Scanner sc = new Scanner(System.in);
    
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
    
        try {
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace(); 
            /*
             *  java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
             * at Pilha.metodo2(Pilha.java:42)
             * at Pilha.metodo1(Pilha.java:30)
             * at Pilha.main(Pilha.java:15)
             
             */
        } catch (RuntimeException e) {
            System.out.println("Unexpected error!");
        }

        sc.close(); 
        System.out.println("***METHOD 2 END***");
    }
}
