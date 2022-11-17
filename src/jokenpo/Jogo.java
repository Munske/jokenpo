package jokenpo;

public class Jogo {
    
    private Jokenpo usuario;
    private Jokenpo computador;
    
    public Jogo(byte jogadaUsuario) {
        /*definir jogada do usuario*/
        this.usuario = new Jokenpo(jogadaUsuario);
        /*sortear e definir a jogada do computador*/
        byte sorteio = (byte)(Math.random()*3+1);
        this.computador = new Jokenpo (sorteio);
    }
    
    public String VerificarVencedor() {
        byte usu = this.usuario.getJogada();
        byte comp = this.computador.getJogada();
        if(usu == comp) {
            return "Empate";
        } else if (usu == 1 && comp == 3 || usu == 2 && comp == 1 || usu == 3 && comp == 2) {
           return "Usu�rio Venceu !"; 
        } else {
            return "Computador Venceu !";
        }
    }
    
    @Override
    public String toString() {
        return "Usuario jogou " + this.usuario + "\nComputador jogou " + this.computador;
    }
    
}
