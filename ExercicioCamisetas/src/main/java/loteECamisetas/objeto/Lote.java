package loteECamisetas.objeto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Lote {

	private int numeroDoLote;
	private LocalDate dataDaFabricacao;
	private int quantidadeTotalDePecas;
	private ArrayList<Camisetas> listaDeCamisetas = new ArrayList<>();

	private boolean producaoFinalizada = false;

	public Lote() {
	}

	public Lote(int quantidadeTotalDePecas,int numeroLote) {
		this.numeroDoLote = numeroLote;
		this.dataDaFabricacao = gerarDataDeFabricacao();
		this.quantidadeTotalDePecas = quantidadeTotalDePecas;
	}

	public LocalDate gerarDataDeFabricacao() {
		return LocalDate.now();
	}

	public void adicionarCamisas(int quantidade, String tamanho, String cor) {
		listaDeCamisetas.add(new Camisetas(tamanho, cor, quantidade));
	}


	public void producaoFinalizada() {
		producaoFinalizada = true;
	}

	public String listarCamisas() {
		
		String lista = "";
		
		for(Camisetas camisetas : listaDeCamisetas) {
			lista += camisetas.toString()
			+"\n --------------------------------------------------------\n"; 
		}
		return lista;

	}

	public int getQuantidadeTotalDePecas() {
		return quantidadeTotalDePecas;
	}

	public int getNumeroDoLote() {
		return numeroDoLote;
	}

	public boolean isProducaoFinalizada() {
		return producaoFinalizada;
	}



	public LocalDate getDataDaFabricacao() {
		return dataDaFabricacao;
	}

	public ArrayList<Camisetas> getListaDeCamisetas() {
		return listaDeCamisetas;
	}

	@Override
	public String toString() {
		return "Lote: " + numeroDoLote + " data de fabricacao: " + dataDaFabricacao
				+ "\nquantidade total de peças: " + quantidadeTotalDePecas 
				+ ",\nlista de camisetas: \n" + listarCamisas();
	}
	
	
}
