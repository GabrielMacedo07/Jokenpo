import model.*;
import player.Computador;
import player.Jogador;
import service.Jogo;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        Computador computador = new Computador();
        Jogo jogo = new Jogo();

        Jogada escolhaJogador = jogador.escolher();
        Jogada escolhaJogador2 = jogador.escolher();

        System.out.println("Jogador2 escolheu: " + escolhaJogador2);

        Resultado resultado = jogo.verificar(escolhaJogador, escolhaJogador2);

        System.out.println("Resultado: " + resultado);

    }
}