package problemaExemploEntities;

public class Product {
    private String name; 
    private double price; 
    private int quantity; 

    // Permite instanciar um objeto sem passar argumentos
    public Product() {
    }

    // Construtor, sem tipo de retorno
    public Product(String name, double price, int quantity) {
        // O this é utilizado para referenciar o atributo da classe
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        // O this é utilizado para referenciar o atributo da classe
        this.name = name;
        this.price = price;
        // O this é opcional, pois não está na lista de parâmetros
        this.quantity = 0; // o Java, por padrão, inicializa os atributos numéricos com 0, então é opcional
    }

    // Por convenção, métodos get e set são públicos e depois dos construtores
    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name; 
    }

    public double getPrice() {
        return price; 
    }

    public void setPrice(double price) {
        this.price = price; 
    }

    public int getQuantity() {
        return quantity; 
    }

    // Não faz sentido criar um setQuantity, pois a quantidade não pode ser alterada diretamente - apenas por meio de addProducts e removeProducts
    // Protegemos :D

    public double totalValueInStock() {
        return price * quantity; 
    }

    public void addProducts(int quantity) {
        this.quantity += quantity; 
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity; 
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock()); 
    }
}
