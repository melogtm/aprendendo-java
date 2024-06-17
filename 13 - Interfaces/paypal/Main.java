import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import models.entity.Contrato;
import models.entity.Parcela;
import models.services.PaypalTaxService; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        

        System.out.println("Entre os dados do contrato: ");

        System.out.print("Número: ");
        int contrato_numero = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Data (dd/MM/yyy): ");
        LocalDate data_contrato = LocalDate.parse(sc.nextLine(), fmt);

        System.out.print("Valor do contrato: ");
        double valor_contrato = sc.nextDouble(); 

        Contrato contrato = new Contrato(contrato_numero, data_contrato, valor_contrato); 

        System.out.print("Entre com o número de parcelas: ");
        short n_parcelas = sc.nextShort(); 

        for(int i = 0; i < n_parcelas; i++) {
            double valor_base_parcela = valor_contrato / n_parcelas; 
            int numero_parcela = i + 1; 

            LocalDate data_parcela = data_contrato.plusMonths(numero_parcela);

            Parcela parcela = new Parcela(data_parcela, valor_base_parcela, new PaypalTaxService()); 
            
            parcela.calcular_valor_parcela(contrato);

            contrato.adicionarParcela(parcela);
        }

        System.out.println("Parcelas: ");
        
        for (Parcela p : contrato.getParcelas()) {
            System.out.println(p.getData_parcela().format(fmt) + " - " + p.getValor_parcela()); 
        }

        sc.close(); 
    }
}