import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicLong;

public class Exemplo5 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            AtomicLong totalTempo = new AtomicLong(0);
            br.lines()
                .takeWhile(linha -> !linha.trim().equals("FIM"))
                .map(linha -> linha.split("\\|"))
                .map(v -> AccessLog.from(v[0].trim(), v[1].trim(), v[2].trim(), v[3].trim(), v[4].trim(), v[5].trim()))
                .filter(log -> log.status() >= 400)
                .peek(log -> {
                    totalTempo.addAndGet(log.tempoResposta());
                    System.out.println("Total parcial: " + totalTempo.get());
                })
                .count();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}