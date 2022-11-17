package jokenpo;

public class Jokenpo {
    
    private byte jogada;
    
    public Jokenpo(byte jogada) {
        this.jogada = jogada;
    }
    
    public byte getJogada() {
        return jogada;
    }
    
    @Override
    public String toString() {
        switch(this.jogada) {
            case 1: return "Pedra";
            case 2: return "Papel";
            default: return "Tesoura";
        }
    }
    
}
