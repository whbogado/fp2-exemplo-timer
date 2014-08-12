
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import utfpr.ct.dainf.if62c.avaliacao.MensagemTask;


/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * Escreve uma mensagem na saída padrão a cada minuto cheio, isto é,
 * inicia no primeiro minuto cheio e repete a cada minuto cheio, por exemplo,
 * às 10h20min, 10h21min, ...
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class ExemploTimer {

    private static final long HORA_CHEIA = 60000; // 60s
    private static final long INTERVALO_CHEIO = 60000; // 60s
    private static final SimpleDateFormat sdf = new SimpleDateFormat("'Hora atual:' HH:mm:ss");
    
    public static void main(String[] args) throws IOException {
        System.out.println("Execução iniciada");
        System.out.println(sdf.format(new Date()));
        long atraso = HORA_CHEIA - new Date().getTime() % HORA_CHEIA;
        
        Timer timer = new Timer("hora-cheia-timer");
        timer.scheduleAtFixedRate(new MensagemTask(), atraso, INTERVALO_CHEIO);
        
        System.out.println("Pressione Enter para terminar...");
        System.in.read();
        timer.cancel();
        
        System.out.println("Execução finalizada");
        System.out.println(sdf.format(new Date()));
    }

}
