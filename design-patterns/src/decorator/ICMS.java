package decorator;

public class ICMS extends Imposto {
	
	public ICMS(){
		
	}
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
 
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
	}

}
