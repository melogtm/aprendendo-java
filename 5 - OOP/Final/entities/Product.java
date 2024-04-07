package Final.entities;

public class Product {
    public String name; 
    public double price; 
    public int quantity; 

    public double totalValueStock() {
        return quantity * price; 
    }

    public void addProducts(int quantity) {
        this.quantity += quantity; 
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity; 
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " unit(s), Total: $ " + totalValueStock(); 
    }
}
