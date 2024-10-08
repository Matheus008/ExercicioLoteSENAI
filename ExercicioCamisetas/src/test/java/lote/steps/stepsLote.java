package lote.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lote.acoes.Despacho;
import lote.acoes.NotaFiscal;
import loteECamisetas.objeto.Lote;

public class stepsLote {

	private Lote lote;
	private NotaFiscal notaFiscal;
	private int quantidadeTotal = 0;
	private Despacho despacho;

	@Before
	public void setUp() {
		notaFiscal = new NotaFiscal();
		lote = new Lote();
		despacho = new Despacho();
	}
	
	@After
	public void adicionarNaListaDeDespacho() { // Limpar memória
		System.out.println(despacho.toString());
		notaFiscal = null;
		lote = null;
		despacho = null; 
	}

	@Given("A quantidade total de itens: {int} e lote:{int}")
	public void aQuantidadeTotalDeItensELote(Integer quantidade, Integer numLote) {
		lote = new Lote(quantidade, numLote);
		
		assertNotNull("Número do Lote: "+lote.getNumeroDoLote()+" Data de fabricação: "+lote.getDataDaFabricacao(),lote);
	}
	
	@Given("Cadastra {int} camisetas da cor {string} e tamanho {string}")
	public void cadastraCamisetasDaCorETamanho(Integer quantidade, String cor, String tamanho) {
		
		int notExpected = 0;
		
		lote.adicionarCamisas(quantidade, tamanho, cor);

		this.quantidadeTotal += quantidade;
		assertNotEquals(notExpected,lote.getListaDeCamisetas().size());
		System.out.println(lote.listarCamisas());
	}

	@Given("Muda o status da produção como finalizada")
	public void mudaOStatusDaProduçãoComoFinalizada() {
		assertEquals(lote.getQuantidadeTotalDePecas(), this.quantidadeTotal);

		lote.producaoFinalizada();
		this.quantidadeTotal = 0;
	}

	@When("Finalizada a produção uma nota fiscal é emitida para cada lote")
	public void finalizadaAProduçãoUmaNotaFiscalÉEmitidaParaCadaLote() {
		assertTrue(lote.isProducaoFinalizada());
		notaFiscal.emitirNotaFiscal(lote);
		
		assertNotNull(notaFiscal.getNumeroDaNotaFiscal());
	}

	@When("Detalhando as informações do lote e lista as camisetas do lote")
	public void detalhandoAsInformaçõesDoLoteEListaAsCamisetasDoLote() {
		System.out.println(notaFiscal.conteudoDaNotaFiscal());
	}

	@Then("Gera um código de validação para o despacho")
	public void geraUmCódigoDeValidaçãoParaODespacho() {
		assertTrue(notaFiscal.isNotaFiscalEmitida());
		despacho = new Despacho(notaFiscal);
		
		assertNotNull(despacho.getCodigoDeValidacao());
		
	}

	@Then("o lote é marcado como pronto para envio")
	public void oLoteÉMarcadoComoProntoParaEnvio() {
		despacho.prontoParaEnvio();
		
		assertTrue(despacho.isProntoParaEnvio());
	}

}
