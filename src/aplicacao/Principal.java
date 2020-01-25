package aplicacao;
import java.util.Scanner;
import xadrez_.Partida;
import xadrez_.PecaXadrez;
import xadrez_.PosicaoXadrez;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Partida part = new Partida();
        while(true){
            UI.printTabuleiro(part.getPecas());
            System.out.println("");
            System.out.print("Origem: ");
            PosicaoXadrez origem = UI.lerPosicaoDeXadrez(sc); 
            
            System.out.println("");
            System.out.print("Alvo: ");
            PosicaoXadrez destino = UI.lerPosicaoDeXadrez(sc);
            
            PecaXadrez pecaCapturada = part.movimentoDePeca(origem,destino);
        }
    }
    
}
