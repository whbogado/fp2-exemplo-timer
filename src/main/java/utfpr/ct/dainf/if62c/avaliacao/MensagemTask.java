package utfpr.ct.dainf.if62c.avaliacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * Tarefa que exibe a hora atual na saída padrão.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class MensagemTask extends TimerTask {
    
    private final Date currentTime = new Date();
    private final SimpleDateFormat sdf = new SimpleDateFormat("'Hora:' HH:mm:ss");

    @Override
    public void run() {
        currentTime.setTime(System.currentTimeMillis());
        System.out.println(sdf.format(currentTime));
    }
    
}
