import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public void timeExperiment(){
        LocalDateTime myDate=  LocalDateTime.now();
        System.out.println("дата э така: "+myDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:ms:ns");
        System.out.println("формат дата эт така: "+myDate.format(dateTimeFormatter));

    }
}
