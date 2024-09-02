package alugacarro.steps;

import static org.junit.jupiter.api.Assertions.*;

import aluga.objetos.carro;
import aluga.servicos.aluguel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsAluguel {

	private carro car;
	private aluguel alugar;
	
	@Given("O veículo possui mais de {int} diarias disponiveis")
	public void oVeículoPossuiMaisDeDiariasDisponiveis(Integer int1) {
		car = new carro();
		car.setDiasDisponiveis(int1);
	}
	@Given("O valor da diária deve ser R$ {int}")
	public void oValorDaDiáriaDeveSerR$(Integer int1) {
		car.setValorDiaria(int1);
	}
	@When("Realizado o aluguel para dias {int}")
	public void realizadoOAluguelParaDias(Integer int1) {
		alugar = new aluguel();
		alugar.setDiasAlugado(int1);
	}
	@Then("O status do veículo muda para {string}")
	public void oStatusDoVeículoMudaPara(String string) {
		car.setStatus(string);
	}
	@Then("O reltório da locação deve retornar o preço de {int}")
	public void oReltórioDaLocaçãoDeveRetornarOPreçoDe(Integer expected) {
		int actual;
	    alugar.setPrecoCalculado(alugar.getDiasAlugado(), car.getValorDiaria());
	    actual = alugar.getPrecoCalculado();
	    assertEquals(expected, actual);
	    
	}
}














