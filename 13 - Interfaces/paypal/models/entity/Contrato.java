package models.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private Integer numero; 
    private LocalDate data_contrato;
    private Double valor_contrato; 
    private List<Parcela> parcelas = new ArrayList<>();

    public Contrato(Integer numero, LocalDate data_contrato, Double valor_contrato) {
        this.numero = numero;
        this.data_contrato = data_contrato;
        this.valor_contrato = valor_contrato; 
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getValor_contrato() {
        return valor_contrato;
    }

    public LocalDate getData_contrato() {
        return data_contrato;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void adicionarParcela(Parcela p) {
        this.parcelas.add(p); 
    }
}
