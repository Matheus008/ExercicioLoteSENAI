package loteECamisetas.objeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Lote {

	private int numeroDoLote;
	private LocalDate dataDaFabricacao;
	private int quantidadeTotalDePecas;
	private ArrayList<Camisetas> listaDeCamisetas = new ArrayList<>();
	private boolean prontoParaEnvio = false;
	private boolean producaoFinalizada = false;

	public Lote() {
	}

	public Lote(int quantidadeTotalDePecas) {
		this.numeroDoLote = gerarNumero();
		this.dataDaFabricacao = gerarDataDeFabricacao();
		this.quantidadeTotalDePecas = quantidadeTotalDePecas;
	}

	public int gerarNumero() {
		Random numeroAleatorio = new Random();
		return numeroAleatorio.nextInt(1000);
	}

	public LocalDate gerarDataDeFabricacao() {
		return LocalDate.now();
	}

	public void adicionarCamisas(int quantidade, char tamanho, String cor) {
		listaDeCamisetas.add(new Camisetas(tamanho, cor, quantidade));
	}

	public void prontoParaEnvio() {
		prontoParaEnvio = true;
	}
	
	public void producaoFinalizada() {
		producaoFinalizada = true;
	}

	public String listarCamisas() {
		for(Camisetas camisetas : listaDeCamisetas) {
			return camisetas.toString()
			+"\n --------------------------------------------------------";
		}
		return null;
	}

	public int getQuantidadeTotalDePecas() {
		return quantidadeTotalDePecas;
	}

	public void setQuantidadeTotalDePecas(int quantidadeTotalDePecas) {
		this.quantidadeTotalDePecas = quantidadeTotalDePecas;
	}

	public int getNumeroDoLote() {
		return numeroDoLote;
	}

	public void setNumeroDoLote(int numeroDoLote) {
		this.numeroDoLote = numeroDoLote;
	}

	public boolean isProntoParaEnvio() {
		return prontoParaEnvio;
	}

	public void setProntoParaEnvio(boolean prontoParaEnvio) {
		this.prontoParaEnvio = prontoParaEnvio;
	}

	public boolean isProducaoFinalizada() {
		return producaoFinalizada;
	}

	public void setProducaoFinalizada(boolean emProducaoFinalizada) {
		this.producaoFinalizada = emProducaoFinalizada;
	}

	@Override
	public String toString() {
		return "NF: " + numeroDoLote + " dataDaFabricacao=" + dataDaFabricacao
				+ "\n quantidadeTotalDePecas: " + quantidadeTotalDePecas 
				+ ", listaDeCamisetas: " + listarCamisas();
	}
	
	
}
