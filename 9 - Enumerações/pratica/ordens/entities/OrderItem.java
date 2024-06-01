package entities;

public class OrderItem {
    private Integer quantity; 
    private Product product; 

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product; 
    }

    public Product getProduct() {
        return product;
    }
    public Integer getQuantity() {
        return quantity;
    }

    public Double subTotal() {
        return quantity * product.getPrice(); 
    }
}
