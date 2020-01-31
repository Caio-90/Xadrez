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
public class Bispo extends PecaXadrez {

    public Bispo( Tabuleiro tabuleiro,Cor cor) {
        super(tabuleiro,cor);
    }
    @Override
    public String toString(){
        return "B";
    } 

    @Override
    public boolean[][] Movimentos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
