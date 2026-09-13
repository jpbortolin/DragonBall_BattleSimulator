package com.jpbortolin.dragonball;

import com.jpbortolin.dragonball.model.Android;
import com.jpbortolin.dragonball.model.Humano;
import com.jpbortolin.dragonball.model.Personagem;
import com.jpbortolin.dragonball.model.Saiyajin;
import com.jpbortolin.dragonball.service.BatalhaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Personagem> personagens = new ArrayList<>();
    private static final BatalhaService batalhaService = new BatalhaService();

    public static void main(String[] args) {
        carregarPersonagens();

        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha: ");

            switch (opcao) {
                case 1 -> listarPersonagens();
                case 2 -> iniciarBatalha();
                case 3 -> batalhaService.exibirHistorico();
                case 4 -> System.out.println("Encerrando... Até a próxima, guerreiro!");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }

    private static void carregarPersonagens() {
        personagens.add(new Saiyajin("Goku", 5000, 900));
        personagens.add(new Saiyajin("Vegeta", 4800, 880));
        personagens.add(new Humano("Kuririn", 2800, 500));
        personagens.add(new Android("Android 18", 4200, 760));
    }

    private static void exibirMenu() {
        System.out.println("\n================================");
        System.out.println("      🐉 DRAGON BALL BATTLE");
        System.out.println("================================");
        System.out.println("1 - Listar personagens");
        System.out.println("2 - Iniciar batalha");
        System.out.println("3 - Histórico de batalhas");
        System.out.println("4 - Sair");
        System.out.println("================================");
    }

    private static void listarPersonagens() {
        System.out.println("\n--- PERSONAGENS ---");

        for (int i = 0; i < personagens.size(); i++) {
            System.out.println((i + 1) + " - " + personagens.get(i));
        }
    }

    private static void iniciarBatalha() {
        listarPersonagens();

        int primeiro = lerInteiro("Escolha o primeiro personagem: ") - 1;
        int segundo = lerInteiro("Escolha o segundo personagem: ") - 1;

        if (primeiro < 0 || primeiro >= personagens.size()
                || segundo < 0 || segundo >= personagens.size()
                || primeiro == segundo) {
            System.out.println("Escolha de personagens inválida.");
            return;
        }

        Personagem p1 = personagens.get(primeiro);
        Personagem p2 = personagens.get(segundo);

        batalhaService.iniciar(p1, p2);
    }

    private static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.print("Digite um número válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
