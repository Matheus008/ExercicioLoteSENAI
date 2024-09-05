package lote.acoes;

import java.util.ArrayList;
import java.util.Random;

import loteECamisetas.objeto.Lote;

public class NotaFiscal {
	
	private int numeroDaNotaFiscal;
	private Lote lote;
	private ArrayList<NotaFiscal> listaNotaFiscal = new ArrayList<>();
	
	public NotaFiscal() {
	}
	
	public NotaFiscal(Lote lote) {
		this.numeroDaNotaFiscal = gerarNumero();
		this.lote = lote;
	}
	
	public void adicionarNotaFiscal() {
		listaNotaFiscal.add(new NotaFiscal(lote));
	}
		
	public int gerarNumero() {
		Random numeroAleatorio = new Random();
		return numeroAleatorio.nextInt(1000);
	}
	
	public void emitirNotaFiscal() {
		numeroDaNotaFiscal = gerarNumero();
		
	}
	
	public String conteudoDaNotaFiscal() {
		for(NotaFiscal notaFiscal : listaNotaFiscal) {
			return "-----INFORMAÇÕES-----"
					+"\n NF: "+numeroDaNotaFiscal
					+"\n"+notaFiscal.lote.toString();
		}
		return null;
	}
}
