import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {
    public static void main(String[] args) {
        // Lembrar que Data-hora é imutável, então sempre que fizermos uma operação, devemos guardar o resultado em uma nova variável
        // Data-hora +/- tempo -> Data-hora

        LocalDate data = LocalDate.now();
        LocalDate pastWeekLocalDate = data.minusWeeks(1);
        LocalDate pastMonthLocalDate = data.minusMonths(1);
        LocalDate pastYearLocalDate = data.minusYears(1);

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime nextMinuteLocalDateTime = agora.plusMinutes(1);
        LocalDateTime pastHourLocalDateTime = agora.minusHours(1);
        LocalDateTime pastDayLocalDateTime = agora.minusDays(1);

        Instant instante = Instant.now();
        Instant nextSecondInstant = instante.plusSeconds(1);
        Instant pastMillisecondInstant = instante.minusMillis(1);
        // Instant possui o método minus que aceita ChronoUnit, que é uma unidade de tempo
        Instant pastYearInstant = instante.minus(1, ChronoUnit.DAYS);

        // Duração entre duas datas
        Duration t1 = Duration.between(agora, pastHourLocalDateTime);
        System.out.println("Duração entre duas datas: " + t1); // PT1H

        // Não podemos calcular o tempo de duração entre dois LocalDate, precisamos
        // converter para LocalDateTime
        // Gambiarra
        Duration t2 = Duration.between(data.atTime(0, 0), pastWeekLocalDate.atTime(0, 0));
        // ou 
        Duration t3 = Duration.between(data.atStartOfDay(), pastWeekLocalDate.atStartOfDay());
    }    
}
