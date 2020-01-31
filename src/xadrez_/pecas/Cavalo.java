/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez_.pecas;

import tabuleiro.Tabuleiro;
import xadrez_.Cor;
import xadrez_.PecaXadrez;

/**
 *
 * @author Cliente
 */
public class Cavalo extends PecaXadrez {

    public Cavalo( Tabuleiro tabuleiro,Cor cor) {
        super(tabuleiro,cor);
    }
    @Override
    public String toString(){
        return "C";
    }

    @Override
    public boolean[][] Movimentos() {
        boolean[][]mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
        return mat;
    }
    
}
