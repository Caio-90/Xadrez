package aplicacao;
import java.util.Scanner;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez_.Partida;

public class Principal {
    public static void main(String[] args) {
        
        Partida part = new Partida();
        UI.printTabuleiro(part.getPecas());
    }
    
}
