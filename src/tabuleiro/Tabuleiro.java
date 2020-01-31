package tabuleiro;
public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        if(linhas<1 || colunas<1){
            throw new TabuleiroException("Tamanho do tabuleiro inválido");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }


    public int getColunas() {
        return colunas;
    }

    
    public Peca peca(int linha, int coluna){
        if(!posicaoExiste(linha,coluna)){
            throw new TabuleiroException("A posição "+ linha+","+coluna+" não existe");
        }
        return pecas[linha][coluna];
    }
    public Peca peca (Posicao posicao){
        if(!posicaoExiste(posicao)){
            throw new TabuleiroException("A posição "+ posicao+" não existe");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }
    public void colocarPeca(Peca peca, Posicao posicao){
        if(ocupada(posicao)){
            throw new TabuleiroException("Já há uma peça na posição "+posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }
    public Peca removerPeca (Posicao posicao){
       if (!posicaoExiste(posicao)){
           throw new TabuleiroException ("Posicao "+posicao+" inválida");
       }else{
            Peca p = peca(posicao);
            //p.posicao = null;
            pecas[posicao.getLinha()][posicao.getColuna()] = null;
            return p;
           }
       }
    private boolean posicaoExiste(int linha,int coluna){
        return linha>=0 && linha<linhas && coluna>=0 && coluna<colunas;
    } 
    public boolean posicaoExiste(Posicao posicao){
        return posicaoExiste(posicao.getLinha(),posicao.getColuna());
    }
    public boolean ocupada (Posicao posicao){
        if(!posicaoExiste(posicao)){
            throw new TabuleiroException("A posição "+ posicao+" não existe" );
        }
        return peca(posicao)!=null;
    }
         
   
}
 