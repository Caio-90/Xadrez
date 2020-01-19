package xadrez_;

import tabuleiro.Tabuleiro;
import xadrez_.pecas.Torre;
import tabuleiro.Posicao;
import xadrez_.pecas.Bispo;
import xadrez_.pecas.Cavalo;
import xadrez_.pecas.Peao;
import xadrez_.pecas.Rainha;
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
    private void ColocarNovaPeca(char coluna,int linha,PecaXadrez peca){
        tabuleiro.colocarPeca(peca,new PosicaoXadrez(coluna,linha).Converter());
    }
    private void FormacaoInicial (){
        tabuleiro.colocarPeca(new Torre(tabuleiro,Cor.BRANCO),new Posicao(0,0));
        tabuleiro.colocarPeca(new Torre(tabuleiro,Cor.BRANCO),new Posicao(0,7));
        tabuleiro.colocarPeca(new Torre(tabuleiro,Cor.PRETO),new Posicao(7,7));
        tabuleiro.colocarPeca(new Torre(tabuleiro,Cor.PRETO),new Posicao(7,0));
        tabuleiro.colocarPeca(new Rei(tabuleiro,Cor.BRANCO),new Posicao(0,3));
        tabuleiro.colocarPeca(new Rei(tabuleiro,Cor.PRETO),new Posicao(7,3));
        tabuleiro.colocarPeca(new Rainha(tabuleiro,Cor.BRANCO),new Posicao(0,4));
        tabuleiro.colocarPeca(new Rainha(tabuleiro,Cor.PRETO),new Posicao(7,4));
        tabuleiro.colocarPeca(new Bispo(tabuleiro,Cor.BRANCO),new Posicao(0,2));
        tabuleiro.colocarPeca(new Bispo(tabuleiro,Cor.BRANCO),new Posicao(0,5));
        tabuleiro.colocarPeca(new Bispo(tabuleiro,Cor.PRETO),new Posicao(7,2));
        tabuleiro.colocarPeca(new Bispo(tabuleiro,Cor.PRETO),new Posicao(7,5));
        tabuleiro.colocarPeca(new Cavalo(tabuleiro,Cor.BRANCO),new Posicao(0,1));
        tabuleiro.colocarPeca(new Cavalo(tabuleiro,Cor.BRANCO),new Posicao(0,6));
        tabuleiro.colocarPeca(new Cavalo(tabuleiro,Cor.PRETO),new Posicao(7,1));
        tabuleiro.colocarPeca(new Cavalo(tabuleiro,Cor.PRETO),new Posicao(7,6));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.BRANCO),new Posicao(1,0));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.BRANCO),new Posicao(1,1));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.BRANCO),new Posicao(1,2));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.BRANCO),new Posicao(1,3));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.BRANCO),new Posicao(1,4));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.BRANCO),new Posicao(1,5));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.BRANCO),new Posicao(1,6));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.BRANCO),new Posicao(1,7));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.PRETO),new Posicao(6,0));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.PRETO),new Posicao(6,1));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.PRETO),new Posicao(6,2));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.PRETO),new Posicao(6,3));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.PRETO),new Posicao(6,4));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.PRETO),new Posicao(6,5));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.PRETO),new Posicao(6,6));
        tabuleiro.colocarPeca(new Peao(tabuleiro,Cor.PRETO),new Posicao(6,7));
    }
}
