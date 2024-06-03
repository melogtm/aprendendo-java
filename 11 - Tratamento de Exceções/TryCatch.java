import java.util.Scanner; 

public class TryCatch {
    /*
    Bloco try: contém o código que pode lançar uma exceção.
    
    Bloco catch: contém o código que trata a exceção lançada no bloco try.

    Exemplo: 
    try {
        // Código que pode lançar uma exceção.
    } catch (Exception e) {
        // Código que trata a exceção.
    } catch (RuntimeException e) {
        // Código que trata a exceção.
    } catch (IOException e) {
        // Código que trata a exceção.
    }
    
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();

        try {
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        } catch (RuntimeException e) {
            System.out.println("Unexpected error!");
        }

        System.out.println("End of program!"); // Será executado mesmo se ocorrer uma exceção graças ao try/catch.

        sc.close(); 
    }
}
