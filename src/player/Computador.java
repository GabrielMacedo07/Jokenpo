package player;

import model.Jogada;

import java.util.Random;

public class Computador {
    private Random random = new Random();

    public Jogada escolher(){
        int escolha = random.nextInt(3);

        return Jogada.values()[escolha];

    }

}
