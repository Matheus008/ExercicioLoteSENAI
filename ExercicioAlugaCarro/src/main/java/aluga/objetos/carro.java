package aluga.objetos;

public class carro {
	
	private int DiasDisponiveis;
	private int ValorDiaria;
	private String Status;
	
	public carro() {
		this.Status = "Disponível";
	}
	
	public void setStatus(String status) {
		this.Status=status;
	}
	public void setDiasDisponiveis(int diaria) {
		this.DiasDisponiveis=diaria;
	}
	public void setValorDiaria(int ValorDiaria) {
		this.ValorDiaria=ValorDiaria;
	}
	
	public int getValorDiaria() {
		return ValorDiaria;
	}
	public String getStatus() {
		return  Status;
	}
	
}






