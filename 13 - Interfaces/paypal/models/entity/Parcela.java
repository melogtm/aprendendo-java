package models.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import models.interfaces.TaxService;

public class Parcela {
    private LocalDate data_parcela; 
    private Double valor_parcela; 
    private TaxService servico_taxa; 
    
    public Parcela(LocalDate data_parcela, Double valor_parcela, TaxService servico_taxa) {
        this.data_parcela = data_parcela;
        this.valor_parcela = valor_parcela;
        this.servico_taxa = servico_taxa; 
    };

    public LocalDate getData_parcela() {
        return data_parcela;
    }

    public Double getValor_parcela() {
        return valor_parcela;
    }

    public void calcular_valor_parcela(Contrato c) {
        long diferenca_meses = ChronoUnit.MONTHS.between(c.getData_contrato(), this.data_parcela);

        double jurosSimples = servico_taxa.simple_tax(valor_parcela) * diferenca_meses;
        double jurosPorPagamento = servico_taxa.pay_tax(this.valor_parcela + jurosSimples); 

        this.valor_parcela += jurosPorPagamento + jurosSimples;
    }

}
