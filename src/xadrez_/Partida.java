package xadrez_;

import tabuleiro.Tabuleiro;

public class Partida {
    private Tabuleiro tabuleiro;
    
    public Partida(){
        tabuleiro = new Tabuleiro (8,8);
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
}
