import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class App2 {
    public static void main(String[] args) {
        
        
        Instant d06 = Instant.parse("2024-07-23T01:30:23Z");

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d06 = " + fmt3.format(d06));



    }
}
