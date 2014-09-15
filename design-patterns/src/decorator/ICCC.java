package decorator;


public class ICCC extends Imposto {
	
	public ICCC(){
		
	}
	
	public ICCC(Imposto outroImposto){
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.08 +  + calculoDoOutroImposto(orcamento);
	}
}
