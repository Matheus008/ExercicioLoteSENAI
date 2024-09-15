package lote.acoes;

import java.util.Random;

public class Despacho {
	
	private int codigoDeValidacao;
	private NotaFiscal notaFiscal;
	private boolean prontoParaEnvio = false;
	
	public Despacho() {
	}
	
	public Despacho(NotaFiscal notaFiscal) {
		this.codigoDeValidacao = gerarNumero();
		this.notaFiscal = notaFiscal;
	}
	
	public void prontoParaEnvio() {
		prontoParaEnvio = true;
	}
	

	public int gerarNumero() {
		Random numeroAleatorio = new Random(1);
		return numeroAleatorio.nextInt(1000);
	}

	public int getCodigoDeValidacao() {
		return codigoDeValidacao;
	}
	
	public boolean isProntoParaEnvio() {
		return prontoParaEnvio;
	}

	@Override
	public String toString() {
		return "Despacho codigo de validação: " + codigoDeValidacao + ", nota fiscal: " + notaFiscal.getNumeroDaNotaFiscal() ;
	}
	
	
}
