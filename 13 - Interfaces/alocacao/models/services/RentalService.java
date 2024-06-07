package alocacao.models.services;
import java.time.Duration;

import alocacao.models.entities.AluguelCarro;
import alocacao.models.entities.Invoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(AluguelCarro cr) {
        long minutes = Duration.between(cr.getStart(), cr.getFinish()).toMinutes();
        double hours = minutes / 60.0; 

        double basicPayment;

        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours);
        }

        double tax = taxService.tax(basicPayment); 


        cr.setInvoice(new Invoice(basicPayment, tax));
    }

}
