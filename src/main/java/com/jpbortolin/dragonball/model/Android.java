package com.jpbortolin.dragonball.model;

public class Android extends Personagem {

    public Android(String nome, int vidaMaxima, int poder) {
        super(nome, vidaMaxima, poder);
    }

    @Override
    public int calcularDano() {
        int dano = (int) (getPoder() * 1.1) + variacaoDeDano();
        return Math.max(1, dano);
    }
}
