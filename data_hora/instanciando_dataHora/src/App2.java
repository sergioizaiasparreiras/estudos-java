import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class App2 {
    public static void main(String[] args) {
        
        LocalDate d04 = LocalDate.parse("2022-11-23");
        LocalDateTime d05 = LocalDateTime.parse("2022-11-23T01:30:23");
        Instant d06 = Instant.parse("2024-07-23T01:30:23Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        
        System.out.println("d04 = " + d04.format(fmt1)); // -> passando o formato como parametro

        System.out.println("d04 = " + fmt1.format(d04)); // -> passando a hora instanciada como parametro

        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); 
        // -> passando a instanciação de dateTimeFormatter como parametro

        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + fmt2.format(d05));



    }
}
