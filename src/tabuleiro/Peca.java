package tabuleiro;
public abstract class Peca {
    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
    
    
    protected Tabuleiro getTabuleiro(){
        return tabuleiro;
    }
    public abstract boolean[][] Movimentos ();
    public boolean MovimentoPossivel (Posicao posicao){
        return Movimentos()[posicao.getLinha()][posicao.getColuna()];
    }
    public boolean HaMovimentosPossiveis(){
        // boolean [][] mat = Movimentos();
        for(int i =0;i<tabuleiro.getLinhas();i++){
            for(int a =0;a<tabuleiro.getColunas();a++){
                if(Movimentos()[i][a]==true){
                    return true;
                }
            }
        }
        return false;
    }
}
