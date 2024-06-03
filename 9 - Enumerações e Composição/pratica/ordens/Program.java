import entities.*;
import entities.enums.OrderStatus;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter Cliente Data: ");
        String name, email; 
        LocalDate birthDate; 

        System.out.printf("Name: ");
        name = sc.nextLine(); 

        System.out.printf("Email: ");
        email = sc.nextLine(); 

        System.out.printf("Birth date (DD/MM/YYYY): ");
        birthDate = LocalDate.parse(sc.nextLine(), fmt);

        Client client = new Client();
        client.setName(name);
        client.setEmail(email);
        client.setBirthDate(birthDate);

        System.out.println("Enter order data: "); 
        OrderStatus status; 
        short howManyItems; 

        System.out.printf("Status: ");
        status = OrderStatus.valueOf(sc.nextLine()); 
        
        System.out.print("How many items to this order? "); 
        howManyItems = sc.nextShort(); 

        Order order = new Order(client, LocalDateTime.now(), status); 

        for (int i = 0; i < howManyItems; i++) {
            sc.nextLine(); 
            System.out.printf("Enter #%d item data\n", i + 1); 

            String pName;
            double pPrice;
            int quantity; 

            System.out.print("Product name: "); 
            pName = sc.nextLine(); 

            System.out.print("Product price: ");
            pPrice = sc.nextDouble(); 

            System.out.print("Quantity: "); 
            quantity = sc.nextInt(); 

            Product productInfo = new Product(pName, pPrice);

            OrderItem ordemItem = new OrderItem(quantity, productInfo);

            order.addItem(ordemItem);
        }

        System.out.println();

        System.out.println(order);

        sc.close();
    }
}