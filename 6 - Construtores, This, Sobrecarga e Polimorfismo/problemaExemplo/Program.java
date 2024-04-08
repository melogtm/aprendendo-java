package problemaExemplo;
import java.util.Scanner;
import java.util.Locale; 
import problemaExemploEntities.Product;
/*
 * Proposta de melhoria: 
 *  
 */


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Quando executamos o comando abaixo, instanciamos um objeto do tipo Product com atributos vazios.
        //Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        // Quando executamos o comando abaixo, instanciamos um objeto do tipo Product com atributos preenchidos.
        Product product = new Product(name, price, quantity);

        Product product2 = new Product(name, price); // Sobrecarga, inicializa a quantidade com 0

        System.out.println();

        System.out.println("Product data: " + product);

        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");

        quantity = sc.nextInt();

        product.addProducts(quantity);

        System.out.println();

        System.out.println("Updated data: " + product);

        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");

        quantity = sc.nextInt();

        product.removeProducts(quantity);

        System.out.println();

        System.out.println("Updated data: " + product);

        sc.close();
    }
}


