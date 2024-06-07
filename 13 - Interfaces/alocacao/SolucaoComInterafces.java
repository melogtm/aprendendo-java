package alocacao;
import java.util.Locale;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import alocacao.models.entities.AluguelCarro;
import alocacao.models.entities.Veiculo;
import alocacao.models.services.RentalService;

public class SolucaoComInterafces {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);    
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String car_model = sc.nextLine();

        System.out.print("Pick-up (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), formatter);

        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), formatter);

        AluguelCarro aluguel = new AluguelCarro(start, finish, new Veiculo(car_model));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay);

        rentalService.processInvoice(aluguel);

        System.out.println("INVOICE:");

        System.out.println("Basic payment: " + String.format("%.2f", aluguel.getInvoice().getBasicPayment()));

        System.out.println("Tax: " + String.format("%.2f", aluguel.getInvoice().getTax()));

        System.out.println("Total payment: " + String.format("%.2f", aluguel.getInvoice().totalPayment()));

        sc.close(); 
    }
}
