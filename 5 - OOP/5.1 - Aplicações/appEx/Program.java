package appEx;
import java.util.Locale;
import entitiesEx.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Product p1 = new Product(); 
        p1.nome = "Feijão"; 
        p1.preco = 3.10; 
        p1.quantidade = 50; 

        System.out.println(p1.mostrar_dados());

        p1.alocar(50);
        p1.retirar(20);

        System.out.println(p1.mostrar_dados());
        
    }
}
