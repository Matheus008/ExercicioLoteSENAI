package aluga.servicos;

public class aluguel {

	private int DiasAlugado;
	private int PrecoCalculado;

	public void setDiasAlugado(int diaria) {
		this.DiasAlugado = diaria;
	}

	public void setPrecoCalculado(int diaria, int valordiaria) {
		this.PrecoCalculado = diaria * valordiaria;
	}

	public int getPrecoCalculado() {
		return PrecoCalculado;
	}

	public int getDiasAlugado() {
		return DiasAlugado;
	}
}
