package xadrez;

import jogoTabuleiro.Posicao;

public class PosicaoXadrez {
	
	private Integer linha;
	private char coluna;
	
	public PosicaoXadrez(char coluna, Integer linha) {
		if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new XadrezException("Erro ao instanciar a posição de Xadrez: Posição invalida, Valores validos entre a1 até h8.");
		}
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public Integer getLinha() {
		return linha;
	}

	public char getColuna() {
		return coluna;
	}

	protected Posicao paraPosicao() {
		return new Posicao(8 - linha, coluna - 'a');
	}
	
	protected static PosicaoXadrez daPosicao(Posicao posicao) {
		return new PosicaoXadrez((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}

}
