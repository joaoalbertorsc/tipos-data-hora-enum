package Entities;
import Enums.DiaDaSemana;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {

    private String nome;
    private LocalDateTime dataHora;
    private DiaDaSemana diaDaSemana;

    public Evento(String nome, LocalDateTime dataHora, DiaDaSemana diaDaSemana) {
        this.nome = nome;
        this.dataHora = dataHora;
        this.diaDaSemana = diaDaSemana;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void exibirEvento() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Evento: " + nome);
        System.out.println("Dia da semana: " + diaDaSemana);
        System.out.println("Data e hora: " + dataHora.format(formatter));
    }
}
