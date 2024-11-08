import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

//https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html



public class App {
    public static void main(String[] args) throws Exception {
        
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH/mm").withZone(ZoneId.systemDefault());
        

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2024-11-07");
        LocalDateTime d05 = LocalDateTime.parse("2024-11-07T19:52:03");
        Instant d06 = Instant.parse("2024-11-07T22:43:33Z");
        Instant d07 = Instant.parse("2024-11-07T22:46:23-03:00");

        LocalDate d08 = LocalDate.parse("29/11/2013", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("29/11/2023 20:23:30", fmt2);

        LocalDate d10 = LocalDate.parse("23/01/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        LocalDate d11 = LocalDate.of(2022, 9, 23);
        LocalDateTime d12 = LocalDateTime.of(2022, 9, 2, 01, 23, 12);
        



        System.out.println(d01.toString());
        System.out.println(d02.toString());
        System.out.println(d03.toString());
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
        System.out.println("d012  = " + d12.format(fmt2));
        System.out.println("d12 = " + fmt2.format(d12));
        System.out.println("d12 = " + d12.format(DateTimeFormatter.ofPattern("02/09/2022 01:23:13")));

        System.out.println("==========================================================");

        System.out.println("d13 = " );

        
        
        
    }
}
