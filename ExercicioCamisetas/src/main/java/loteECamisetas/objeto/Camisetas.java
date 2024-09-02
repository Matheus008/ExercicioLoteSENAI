package loteECamisetas.objeto;

public class Camisetas {
	
	private char tamanho;
	private String cor;
	
	public Camisetas(char tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
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
	
}
