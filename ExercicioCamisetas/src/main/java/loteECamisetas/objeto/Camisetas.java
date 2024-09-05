package loteECamisetas.objeto;

public class Camisetas {
	
	private char tamanho;
	private String cor;
	private int quantidade;
	
	public Camisetas(char tamanho, String cor, int quantidade) {
		this.tamanho = tamanho;
		this.cor = cor;
		this.quantidade = quantidade;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Tamanho:" + tamanho 
				+ "\n Cor: " + cor 
				+ "\n Quantidade=" + quantidade;
	}
	
	
	
}
