package com.jpbortolin.dragonball.model;

import java.util.Random;

public abstract class Personagem {

    private final String nome;
    private final int vidaMaxima;
    private int vidaAtual;
    private final int poder;

    protected Personagem(String nome, int vidaMaxima, int poder) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.poder = poder;
    }

    public abstract int calcularDano();

    public void receberDano(int dano) {
        vidaAtual -= dano;

        if (vidaAtual < 0) {
            vidaAtual = 0;
        }
    }

    public boolean estaVivo() {
        return vidaAtual > 0;
    }

    public void restaurarVida() {
        vidaAtual = vidaMaxima;
    }

    protected int variacaoDeDano() {
        Random random = new Random();
        return random.nextInt(201) - 100;
    }

    public String getNome() {
        return nome;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getPoder() {
        return poder;
    }

    @Override
    public String toString() {
        return nome
                + " | HP: " + vidaAtual + "/" + vidaMaxima
                + " | Poder: " + poder
                + " | Classe: " + getClass().getSimpleName();
    }
}
