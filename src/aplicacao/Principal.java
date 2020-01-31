package aplicacao;
import static aplicacao.UI.limparTela;
import static aplicacao.UI.printPeca;
import java.util.InputMismatchException;
import java.util.Scanner;
import xadrez_.Partida;
import xadrez_.PecaXadrez;
import xadrez_.PosicaoXadrez;
import xadrez_.Xadrez_Exception;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Partida part = new Partida();
        while(true){
            try{
                limparTela();
                UI.printTabuleiro(part.getPecas());
                System.out.println("");
                System.out.print("Origem: ");
                PosicaoXadrez origem = UI.lerPosicaoDeXadrez(sc); 

                System.out.println("");
                System.out.print("Alvo: ");
                PosicaoXadrez destino = UI.lerPosicaoDeXadrez(sc);

                PecaXadrez pecaCapturada = part.movimentoDePeca(origem,destino);
                System.out.print("[ ");
                printPeca(pecaCapturada);
                System.out.print("]");
                System.out.println("");
            }
            catch(Xadrez_Exception e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch(InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
                
            
            
        }
    }
    
}
