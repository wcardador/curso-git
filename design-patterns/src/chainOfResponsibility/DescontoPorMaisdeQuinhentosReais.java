package chainOfResponsibility;

public class DescontoPorMaisdeQuinhentosReais implements Desconto {
	private Desconto proximo;
	public double desconto(Orcamento orcamento) {
		if(orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			return proximo.desconto(orcamento);
		}
	}
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
}
