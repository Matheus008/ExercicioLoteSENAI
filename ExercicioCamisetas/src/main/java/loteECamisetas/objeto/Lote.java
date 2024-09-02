package loteECamisetas.objeto;

public class Lote {
	
	private int numeroDoLote;
	private int quantidadeDePeças;
	private Camisetas[] camisetas = new Camisetas[quantidadeDePeças];
	
	public Lote() {
	}

	public int getNumeroDoLote() {
		return numeroDoLote;
	}

	public void setNumeroDoLote(int numeroDoLote) {
		this.numeroDoLote = numeroDoLote;
	}

	public int getQuantidadeDePeças() {
		return quantidadeDePeças;
	}

	public void setQuantidadeDePeças(int quantidadeDePeças) {
		this.quantidadeDePeças = quantidadeDePeças;
	}

	public Camisetas[] getCamisetas() {
		return camisetas;
	}

	public void setCamisetas(Camisetas[] camisetas) {
		this.camisetas = camisetas;
	}
	
}
