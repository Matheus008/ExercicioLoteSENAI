package lote.acoes;

import java.util.Random;

public class Despacho {
	
	private int codigoDeValidacao;
	private NotaFiscal notaFiscal;
	
	
	public Despacho(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public int gerarNumero() {
		Random numeroAleatorio = new Random();
		return numeroAleatorio.nextInt(1000);
	}

	public int getCodigoDeValidacao() {
		return codigoDeValidacao;
	}

	public void setCodigoDeValidacao(int codigoDeValidacao) {
		this.codigoDeValidacao = codigoDeValidacao;
	}

	@Override
	public String toString() {
		return "Despacho codigoDeValidacao=" + codigoDeValidacao + ", notaFiscal=" + notaFiscal + "]";
	}
	
	
}
