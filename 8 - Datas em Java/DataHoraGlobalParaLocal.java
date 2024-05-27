import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHoraGlobalParaLocal {
    public static void main(String[] args) {
        /*
         * Você deverá informar, além da data-hora global, o timezone que deseja converter.
         */

        // Exemplo 1: Convertendo um Instant para LocalDateTime
        Instant instante = Instant.now();
        System.out.println("Instante Global: " + instante); // 2021-12-31T23:59:59.123456789Z

        ZoneId.getAvailableZoneIds(); // Lista de todos os timezones disponíveis

        // Convertendo para um timezone específico
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instante, ZoneId.of("America/Sao_Paulo"));




    }
}
