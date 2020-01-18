package xadrez_;

import tabuleiro.Tabuleiro;
import xadrez_.pecas.Torre;
import tabuleiro.Posicao;
import xadrez_.pecas.Rei;

public class Partida {
    private Tabuleiro tabuleiro;
    
    public Partida(){
        tabuleiro = new Tabuleiro (8,8);
        FormacaoInicial();
    }
    
    public PecaXadrez[][] getPecas(){
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i=0;i<tabuleiro.getLinhas();i++){
            for(int a=0;a<tabuleiro.getColunas();a++){
                mat[i][a] = (PecaXadrez) tabuleiro.peca(i,a);
            }
        }
        return mat;
    }
    private void FormacaoInicial (){
        tabuleiro.colocarPeca(new Torre(tabuleiro,Cor.BRANCO),new Posicao(0,0));
        tabuleiro.colocarPeca(new Torre(tabuleiro,Cor.BRANCO),new Posicao(0,7));
        tabuleiro.colocarPeca(new Torre(tabuleiro,Cor.PRETO),new Posicao(7,7));
        tabuleiro.colocarPeca(new Torre(tabuleiro,Cor.PRETO),new Posicao(7,0));
        tabuleiro.colocarPeca(new Rei(tabuleiro,Cor.BRANCO),new Posicao(0,3));
        tabuleiro.colocarPeca(new Rei(tabuleiro,Cor.PRETO),new Posicao(7,3));
    }
}
