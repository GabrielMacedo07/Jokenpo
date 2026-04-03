package model;

public enum Jogada {
    PEDRA,
    PAPEL,
    TESOURA;

    public boolean ganhaDe(Jogada oponente) {
        switch (this) {
            case PEDRA:   return oponente == TESOURA;
            case TESOURA: return oponente == PAPEL;
            case PAPEL:   return oponente == PEDRA;
            default: return false;
        }
    }
}
