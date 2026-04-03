package player;

import model.Jogada;

import java.util.Scanner;

public class Jogador {
    private Scanner sc = new Scanner(System.in);

    public Jogada escolher(){
        System.out.println("Escolha:");
        System.out.println("PEDRA");
        System.out.println("PAPEL");
        System.out.println("TESOURA");

        String escolha = sc.nextLine();

        if(escolha.equalsIgnoreCase("PEDRA")){
            return Jogada.PEDRA;
        } else if (escolha.equalsIgnoreCase("PAPEL")) {
            return  Jogada.PAPEL;
        } else if (escolha.equalsIgnoreCase("TESOURA")) {
            return Jogada.TESOURA;
        }else {
            System.out.println("Jogada inválida");
            return null;
        }
    }
}
