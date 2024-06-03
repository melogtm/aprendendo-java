package entities;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import entities.enums.OrderStatus;

public class Order {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static DateTimeFormatter birth = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Client client; 
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>(); 

    public Order(Client client, LocalDateTime moment, OrderStatus status) {
        this.client = client;
        this.moment = moment; 
        this.status = status; 
    }

    public void addItem(OrderItem item) {
        items.add(item);
    };

    public void removeItem(OrderItem item) {
        items.remove(item);
    };

    public Double total() {
        double sum = 0.0; 

        for (OrderItem o : items) {
            sum += o.subTotal();
        }

        return sum; 
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(); 
        sb.append("Order moment ").append(dtf.format(moment))
          .append("\nOrder Status: ").append(status)
          .append("\nClient: ").append(client.getName())
          .append(" ").append(birth.format(client.getBirthDate()))
          .append(" ").append(client.getEmail())
          .append("\nOrder items:\n");

        for (OrderItem o : items) {
            sb.append(o.getProduct().getName())
              .append(", $").append(o.getProduct().getPrice())
              .append(", Quantity: ").append(o.getQuantity())
              .append(", Subtotal: $").append(o.subTotal())
              .append("\n");
        }

        sb.append("Total price: $").append(total());

        return sb.toString();
    }

}
