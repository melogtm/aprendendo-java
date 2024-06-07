package alocacao.models.entities;
import java.time.LocalDateTime;

public class AluguelCarro {
    private LocalDateTime start;
    private LocalDateTime finish;

    private Veiculo veiculo;
    private Invoice invoice;


    public AluguelCarro() {
    }

    public AluguelCarro(LocalDateTime start, LocalDateTime finish, Veiculo veiculo) {
        this.start = start;
        this.finish = finish;
        this.veiculo = veiculo;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

}
