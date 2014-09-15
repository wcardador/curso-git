package chainOfResponsibility;

public class TesteDeDescontos {
	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		Orcamento orcamento = new Orcamento(500.0);
		
		orcamento.adicionaItem(new Item("CANETA",1.0));
		orcamento.adicionaItem(new Item("LAPIS",2.0));
		//orcamento.adicionaItem(new Item("PAPEL",3.0));
		//orcamento.adicionaItem(new Item("BORRACHA",4.0));
		//orcamento.adicionaItem(new Item("SULFITE",5.0));
		//orcamento.adicionaItem(new Item("COLA",6.0));
		double descontoFinal = descontos.calcula(orcamento);
		System.out.println(descontoFinal);
	}
}
