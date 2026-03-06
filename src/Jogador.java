public class Jogador {
    private String nome;
    private Jogada jogada;

    public Jogador(String nome, Jogada jogada) {
        this.nome = nome;
        this.jogada = jogada;
    }

    public String getNome() {
        return nome;
    }

    public Jogada getJogada() {
        return jogada;
    }

    public void realizarJogada(Jogada jogador1, Jogada jogador2){
        if(jogador1.ganhaDe(jogador2)){
            System.out.println("Jogador "+getNome()+" venceu com " + jogador1);
        }else if (jogador2.ganhaDe(jogador1)) {
            System.out.println("Jogador "+getNome() +" venceu com " + jogador2);
        } else {
            System.out.println("Empate!");
        }
    }
}
