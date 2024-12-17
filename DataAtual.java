import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataAtual {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Data e hora atual: " + agora.format(formato));
    }
}
