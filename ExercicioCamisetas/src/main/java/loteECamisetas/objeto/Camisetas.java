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

	@Override
	public String toString() {
		return "Tamanho:" + tamanho 
				+ "\nCor: " + cor 
				+ "\nQuantidade: " + quantidade;
	}
	
	
	
}
