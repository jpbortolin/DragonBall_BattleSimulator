package com.jpbortolin.dragonball.model;

public class Humano extends Personagem {

    public Humano(String nome, int vidaMaxima, int poder) {
        super(nome, vidaMaxima, poder);
    }

    @Override
    public int calcularDano() {
        int dano = (int) (getPoder() * 0.9) + variacaoDeDano();
        return Math.max(1, dano);
    }
}
