package ObjectstoString.entities;

public class Product {
    public String name; 
    public double price;
    public int quantity;   

    // Sobrescrevendo o método toString do Object ao nosso favor
    public String toString() {
        return name
        + ", $ "
        + String.format("%.2f", price); // String de Formatação
    }
}
