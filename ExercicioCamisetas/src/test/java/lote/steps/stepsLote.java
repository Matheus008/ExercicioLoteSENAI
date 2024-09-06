package lote.steps;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
	
	@Given("A quantidade total do lote que é {int} camisetas")
	public void aQuantidadeTotalDoLoteQueÉCamisetas(Integer quantidadeTotal) {
	    lote = new Lote(quantidadeTotal);
	}
	@Given("Sendo {int} camisetas da cor {string} e tamanho {string}")
	public void sendoCamisetasDaCorETamanho(Integer quantidade, String cor, String tamanho) {
		
		lote.adicionarCamisas(quantidade, tamanho, cor);
	    
		this.quantidadeTotal += quantidade;

	}
	@Given("Coloca a produção como finalizada")
	public void colocaAProduçãoComoFinalizadaGeraOCódigoDoLote() {
		
		assertEquals(lote.getQuantidadeTotalDePecas(), quantidadeTotal);
		
	    lote.producaoFinalizada();
	    quantidadeTotal = 0;
	}
	@When("Finalizada emite o número da nota fiscal")
	public void finalizadaEmiteONúmeroDaNotaFiscal() {
	    assertTrue(lote.isProducaoFinalizada());
	    notaFiscal = new NotaFiscal(lote);
	}
	@Then("Coloca o lote como pronto para envio")
	public void colocaOLoteComoProntoParaEnvio() {
	    lote.prontoParaEnvio();
	}
	@Then("É preparado para despacho")
	public void éPreparadoParaDespacho() {
	    
		assertTrue(lote.isProntoParaEnvio());
		
		despacho = new Despacho(notaFiscal);
	}
	@Then("Gera um código de validação")
	public void geraUmCódigoDeValidação() {
	    despacho.setCodigoDeValidacao(despacho.gerarNumero());
	}

}
