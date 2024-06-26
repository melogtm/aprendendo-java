import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.err.print("How many values? ");

        int howMany = sc.nextInt(); 

        // PrintService só serve para inteiros, mas imagine que eu queira lidar com Strings
        // Daí, sem generics, teria que duplicar o código e fazer as modificações necessárias.

        /*
         Você poderia dizer que basta utilizar o Object (Integer, String, Double...) como tipo de entrada.
         Mas daí pecamos no typesafety. Por isso vamos usar PrintService<T>, sendo T qualquer tipo
        */
        PrintService<Integer> ps = new PrintService<>(); 

        for (int i = 0; i < howMany; i++) {
            int value = sc.nextInt(); 
            ps.addValue(value);
        }

        ps.print(); 

        System.out.println("First value is " + ps.first());

        sc.close(); 
    }
}
