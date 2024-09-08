package lote.acoes;

import java.util.Random;

import loteECamisetas.objeto.Lote;

public class NotaFiscal {
	
	private int numeroDaNotaFiscal;
	private Lote lote;
	private boolean notaFiscalEmitida = false;

	public NotaFiscal() {
	}
		
	public int gerarNumero() {
		Random numeroAleatorio = new Random();
		return numeroAleatorio.nextInt(1000);
	}
	
	public void emitirNotaFiscal(Lote lote) {
		numeroDaNotaFiscal = gerarNumero();
		this.lote = lote;
		this.notaFiscalEmitida = true;
	}
	
	public String conteudoDaNotaFiscal() {
			return "-----INFORMAÇÕES-----"
					+"\nNF: "+numeroDaNotaFiscal
					+"\n"+lote.toString();

	}

	public boolean isNotaFiscalEmitida() {
		return notaFiscalEmitida;
	}

	public int getNumeroDaNotaFiscal() {
		return numeroDaNotaFiscal;
	}
	
}
