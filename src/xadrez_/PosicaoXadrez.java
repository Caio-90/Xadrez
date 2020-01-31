package xadrez_;

import tabuleiro.Posicao;

public class PosicaoXadrez {
    private char coluna;
    private int linha;

    public PosicaoXadrez(char coluna, int linha) {
        if(coluna<'a' || coluna>'h'||linha<1||linha>8){
            throw new Xadrez_Exception ("Posição ("+coluna+","+linha+") inválida"
                    + ", posições válidas de a1 até h8");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }
    
    protected Posicao Converter(){
        return new Posicao(8-linha,coluna-'a');
    }
    public static PosicaoXadrez Convercao(Posicao posicao){
        return new PosicaoXadrez((char)('a'- posicao.getColuna()),8-posicao.getLinha());
    }
    @Override
    
    public String toString(){
        return "" +coluna+linha;
    }
    
    
}
