package service;

import model.Jogada;
import model.Resultado;

public class Jogo {
    public Resultado verificar(Jogada jogador, Jogada jogador2) {
        if (jogador == jogador2) {
            return Resultado.EMPATE;
        } else if (jogador.ganhaDe(jogador2)) {
            return Resultado.VITORIA;
        } else {
            return Resultado.DERROTA;
        }
    }
}
