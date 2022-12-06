package jogoTabuleiro;

public class Tabuleiro {
	
	private Integer linhas;
	private Integer colunas;
	private Peca[][] pecas;
	
	
	public Tabuleiro(Integer linhas, Integer colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroException("Erro ao criar tabuleiro: É necessário que haja uma linha ou uma coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public Integer getLinhas() {
		return linhas;
	}

	public Integer getColunas() {
		return colunas;
	}

	public Peca peca(Integer linha, Integer coluna) {
		if (!posicaoExiste(linha, coluna)) {
			throw new TabuleiroException("A posição não existe no tabuleiro!");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new TabuleiroException("A posição não existe no tabuleiro!");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if (temUmaPeca(posicao)) {
			throw new TabuleiroException("Já existe uma peça na posição " + posicao + "!");
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temUmaPeca(Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new TabuleiroException("A posição não existe no tabuleiro!");
		}
		return peca(posicao) != null;
	}
	
	public Peca removerPeca(Posicao posicao) {
		Peca peca = pecas[posicao.getLinha()][posicao.getColuna()];
		pecas[posicao.getLinha()][posicao.getColuna()] = null;
		return peca;
	}
	
	
}