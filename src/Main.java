import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador jogador1 = new Jogador("Gabriel",Jogada.PAPEL);
        Jogador jogador2 = new Jogador("Carlos", Jogada.TESOURA);

        jogador1.realizarJogada(jogador1.getJogada(),jogador2.getJogada());
    }
}