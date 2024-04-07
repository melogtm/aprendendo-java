package ObjectstoString.app;
import ObjectstoString.entities.Product;

public class ObjectToString {
    // Toda classe em Java é filha da classe Object
    /*
     Object possui alguns métodos:
        - toString(): retorna uma representação da instância em forma de String
        - equals(Object obj): compara se a instância é igual a outra
        - hashCode(): retorna um número inteiro que representa a instância
        - getClass(): retorna a classe da instância
        - finalize(): é chamado pelo Garbage Collector quando a instância é removida da memória
        - clone(): cria uma cópia da instância
        - wait(): faz a thread esperar
        - notify(): acorda uma thread que está esperando
        - notifyAll(): acorda todas as threads que estão esperando
    */

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "TV";
        p1.price = 900.00;
        p1.quantity = 10;

        System.out.println(p1); // Teoria.entities.Product@15db9742
        System.out.println(p1.toString()); // TV, dependerá de como iremos manipular o toString() na classe Product
    }
  
}
