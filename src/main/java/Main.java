import Entities.Evento;
import Enums.DiaDaSemana;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        Evento evento = new Evento("Workshop de Java", agora, DiaDaSemana.SEGUNDA);

        evento.exibirEvento();

        LocalDateTime novaData = evento.getDataHora().plusDays(5);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("\nData após +5 dias: " + novaData.format(formatter));

        ZonedDateTime emSaoPaulo = novaData.atZone(ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime emGMT = emSaoPaulo.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println("\nData e hora em São Paulo (BRT): " + emSaoPaulo.format(formatter));
        System.out.println("Data e hora em GMT: " + emGMT.format(formatter));
    }
}