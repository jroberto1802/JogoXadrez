package jogoTabuleiro;

public class Posicao {
	
	private Integer linha;
	private Integer coluna;
	
	public Posicao() {
	}
	
	public Posicao(Integer linha, Integer coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public Integer getLinha() {
		return linha;
	}

	public Integer getColuna() {
		return coluna;
	}
	
	public void setValores(Integer linha, Integer coluna) {
		this.coluna = coluna;
		this.linha = linha;		
	}

}
