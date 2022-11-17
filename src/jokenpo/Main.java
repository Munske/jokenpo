package jokenpo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);
    
    byte escolha;
    
    do{
    	System.out.println("\n----------------------");
        System.out.println("1 - jogar");
        System.out.println("0 - sair");
        escolha = ler.nextByte();
        
        switch (escolha) {
            case 1:
                System.out.println("ESCOLHA SUA JOGADA !");
                System.out.println("(1) Pedra");
                System.out.println("(2) Papel");
                System.out.println("(3) Tesoura");
                byte jogadaUsuario = ler.nextByte();
                Jogo j1 = new Jogo(jogadaUsuario);
                System.out.println(j1);
                System.out.println("Resultado: " + j1.VerificarVencedor());
                break;
            case 0:
                System.out.println("JOGO ENCERRADO");
                        }
            }while(escolha != 0);
    
    }
}
