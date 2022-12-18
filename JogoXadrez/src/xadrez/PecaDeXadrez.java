package xadrez;

import jogoTabuleiro.Peca;
import jogoTabuleiro.Posicao;
import jogoTabuleiro.Tabuleiro;

public abstract class PecaDeXadrez extends Peca{
	
	private Cor cor;
	private Integer contadorDeMovimento;
	
	public PecaDeXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
		contadorDeMovimento = 0;
	}
	
	public PosicaoXadrez getPosicaoXadrez() {
		return PosicaoXadrez.daPosicao(posicao);
	}

	public Cor getCor() {
		return cor;
	}
	
	public int getContadorDeMovimento() {
		return contadorDeMovimento;
	}
	
	protected void aumentarContadorDeMovimento() {
		contadorDeMovimento++;
	}
	protected void diminuirContadorDeMovimento() {
		contadorDeMovimento--;
	}
	
	protected boolean existePecaOponente(Posicao posicao) {
		PecaDeXadrez p = (PecaDeXadrez)getTabuleiro().peca(posicao);
		return p != null && p.getCor() != cor;
	}
	
}
