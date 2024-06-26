package entities;
import java.time.LocalDate;

public class HourContract {
    private LocalDate date; 
    private Double valuePerHour; 
    private Integer hours ; 

    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date; 
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }
    public Integer getHours() {
        return hours;
    }
    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double totalValue() {
        return valuePerHour * hours; 
    }
}
