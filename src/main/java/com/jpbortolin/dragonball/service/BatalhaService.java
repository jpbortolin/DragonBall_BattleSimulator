package com.jpbortolin.dragonball.service;

import com.jpbortolin.dragonball.model.Personagem;

import java.util.ArrayList;
import java.util.List;

public class BatalhaService {

    private final List<String> historico = new ArrayList<>();

    public void iniciar(Personagem primeiro, Personagem segundo) {
        primeiro.restaurarVida();
        segundo.restaurarVida();

        System.out.println("\n BATALHA INICIADA! ");
        System.out.println(primeiro.getNome() + " VS " + segundo.getNome());

        Personagem atacante = primeiro;
        Personagem defensor = segundo;

        int turno = 1;

        while (primeiro.estaVivo() && segundo.estaVivo()) {
            int dano = atacante.calcularDano();
            defensor.receberDano(dano);

            System.out.println("\nTurno " + turno);
            System.out.println(atacante.getNome() + " atacou " + defensor.getNome()
                    + " causando " + dano + " de dano.");
            System.out.println(defensor.getNome() + " HP: "
                    + defensor.getVidaAtual() + "/" + defensor.getVidaMaxima());

            Personagem temporario = atacante;
            atacante = defensor;
            defensor = temporario;

            turno++;
        }

        Personagem vencedor = primeiro.estaVivo() ? primeiro : segundo;

        String resultado = vencedor.getNome() + " venceu "
                + (vencedor == primeiro ? segundo.getNome() : primeiro.getNome());

        System.out.println("\n VENCEDOR: " + vencedor.getNome() + "!");
        historico.add(resultado);

        // Reseta os personagens para que a próxima batalha comece com HP máximo.
        primeiro.restaurarVida();
        segundo.restaurarVida();
    }

    public void exibirHistorico() {
        System.out.println("\n--- HISTÓRICO ---");

        if (historico.isEmpty()) {
            System.out.println("Nenhuma batalha realizada.");
            return;
        }

        for (int i = 0; i < historico.size(); i++) {
            System.out.println((i + 1) + " - " + historico.get(i));
        }
    }
}
