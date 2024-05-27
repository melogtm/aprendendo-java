import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataParaTexto {
    public static void main(String[] args) {
        // Iniciando exemplos
        LocalDate data = LocalDate.now();
        LocalDateTime agora = LocalDateTime.now();
        Instant instante = Instant.now();


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // Pega o Zone.Id do sistema
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        // Convertendo Data para Texto
        String dataTexto = data.format(fmt1);
        System.out.println("Data para Texto: " + dataTexto); // 31/12/2021
        //ou 
        System.out.println("Data para Texto: " + fmt1.format(data)); // 31/12/2021

        // Convertendo Data e Hora para Texto
        String agoraTexto = agora.format(fmt2);
        System.out.println("Data e Hora para Texto: " + agoraTexto); // 31/12/2021 23:59:59
        //ou
        System.out.println("Data e Hora para Texto: " + fmt2.format(agora)); // 31/12/2021 23:59:59

        // Convertendo Instante para Texto
        // É obrigado informar o fuso horário quando lidamos com Instant
        String instanteTexto = fmt3.format(instante); // Irá lidar com o TimeZone
        System.out.println("Instante para Texto: " + instanteTexto); // 31/12/2021 23:59:59

        // Há formatos já prontos, acessíveis no link: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // 2021-12-31T23:59:59.123456789
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_LOCAL_DATE; // 2021-12-31
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_LOCAL_DATE_TIME; // 2021-12-31T23:59:59.123456789
        DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT; // 2021-12-31T23:59:59.123456789Z




        
    } 
}
