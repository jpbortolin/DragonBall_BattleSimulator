package com.jpbortolin.dragonball.model;

public class Saiyajin extends Personagem {

    public Saiyajin(String nome, int vidaMaxima, int poder) {
        super(nome, vidaMaxima, poder);
    }

    @Override
    public int calcularDano() {
        int dano = getPoder() + variacaoDeDano();
        return Math.max(1, dano);
    }
}
