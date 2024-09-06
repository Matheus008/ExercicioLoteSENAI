package loteECamisetas.objeto;

public class Camisetas {
	
	private String tamanho;
	private String cor;
	private int quantidade;
	
	public Camisetas(String tamanho, String cor, int quantidade) {
		this.tamanho = tamanho;
		this.cor = cor;
		this.quantidade = quantidade;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
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
				+ "\n Quantidade: " + quantidade;
	}
	
	
	
}
