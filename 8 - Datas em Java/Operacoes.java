import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

public class Operacoes {
    /* Principais tipos de Data e Hora em Java 8+
     
    1. LocalDate: Representa uma data no formato ano-mês-dia sem fuso horário
    2. LocalTime: Representa uma hora no formato hora:minuto:segundo sem fuso horário
    3. Instant: Representa um instante no tempo em milissegundos desde 1970-01-01T00:00:00Z
    4. Duration: Representa uma duração entre dois pontos no tempo
    5. ZoneId: Representa um fuso horário
    6. ChronoUnit: Representa uma unidade de tempo

    */
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        // Instanciando Data e Hora do agora
        LocalDate data = LocalDate.now();
        System.out.println("Data de hoje: " + data); // 2021-12-31

        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Data e Hora de agora: " + agora); // 2021-12-31T23:59:59.123456789

        Instant instante = Instant.now();
        System.out.println("Instante de agora: " + instante); // 2021-12-31T23:59:59.123456789Z

        // Pegar um texto ISO 8601 e converter para um objeto de data e hora
        LocalDate dataIso = LocalDate.parse("2021-12-31");
        System.out.println("Data ISO: " + dataIso); // 2021-12-31

        LocalDateTime agoraIso = LocalDateTime.parse("2021-12-31T23:59:59");
        System.out.println("Data e Hora ISO: " + agoraIso); // 2021-12-31T23:59:59

        Instant instanteIso = Instant.parse("2021-12-31T23:59:59Z");
        System.out.println("Instante ISO: " + instanteIso); // 2021-12-31T23:59:59Z
        
        // Se quisermos trabalhar em uma timezone diferente de Zulu, basta especificar-lo no parse, no caso, ele fará a conversão para Zulu (01/01/2022 as 2:59:59)
        Instant instateTZIso = Instant.parse("2021-12-31T23:59:59-03:00");
        
        // Podemos especificar um formato customizado graças ao DateTimeFormatter!
        LocalDate specialDate = LocalDate.parse("20/07/2014", fmt1);
        System.out.println("Formato Especial: " + specialDate); // 2014-07-2

        LocalDateTime specialDateTime = LocalDateTime.parse("20/07/2014 15:30:00", fmt2);
        System.out.println("Formato Especial: " + specialDateTime); // 2014-07-20T15:30:00

        LocalDate dataFutura = LocalDate.of(2022, 1, 1);
        System.out.println("Data Futura: " + dataFutura); // 2022-01-01

        LocalDateTime dataHoraFutura = LocalDateTime.of(2022, 1, 1, 2, 59, 59);
        System.out.println("Data e Hora Futura: " + dataHoraFutura); // 2022-01-01T02:59:59
                                                                
                                                                       

        // Obs: quando concatenamos um objeto de data e hora com uma String, o Java chama o método toString() automaticamente



    }
}
