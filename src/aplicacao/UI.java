package aplicacao;
import xadrez_.PecaXadrez;

public class UI {
    
   public static void printTabuleiro(PecaXadrez[][] pecas){
       for(int i=0;i<pecas.length;i++){
           System.out.print((8-i)+ " ");
           for(int a=0;a<pecas.length;a++){
               printPeca(pecas [i][a]);
           }
           System.out.println("");
       }
       System.out.println("  a b c d e f g h");
   }
   private static void printPeca(PecaXadrez peca){
       if(peca == null){
           System.out.print("-");
       }else{
           System.out.print(peca);
       }
       System.out.print(" ");
   }
}
