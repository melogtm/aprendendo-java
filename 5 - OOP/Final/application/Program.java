package Final.application;
import java.util.Locale;
import java.util.Scanner;
import Final.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        Product p = new Product(); 
        int manageQuantity; 

        System.out.println("Informe os dados do Produto: ");
        System.out.printf("Nome: ");
        p.name = sc.nextLine(); 
        System.out.printf("Preço: ");
        p.price = sc.nextDouble(); 
        System.out.printf("Quantidade: ");
        p.quantity = sc.nextInt(); 

        System.out.println("Product data: " + p.toString());

        System.out.printf("Informe quantos produtos serão adicionados: "); 
        manageQuantity = sc.nextInt(); 

        p.addProducts(manageQuantity);

        System.out.println("Updated data: " + p.toString());

        System.out.printf("Informe quantos produtos serão retirados: "); 
        manageQuantity = sc.nextInt(); 
        
        p.removeProducts(manageQuantity);

        System.out.println("Updated data: " + p.toString());

        sc.close();
    }
}
