package chainOfResponsibility;

public class SemDesconto implements Desconto {

	public double desconto(Orcamento orcamento) {
		return 0;
	}

	public void setProximo(Desconto proximo) {
		//n�o tem
		
	}

}
