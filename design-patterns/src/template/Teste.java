package template;

public class Teste {

	public static void main(String[] args) {
		
		Orcamento o = new Orcamento(400);
		o.adicionaItem(new Item("CANETA", 10));
		o.adicionaItem(new Item("LAPIS",  20));
		o.adicionaItem(new Item("BORRACHA", 100));
		o.adicionaItem(new Item("BORRACHA1", 90));		
		
		ICPP icpp = new ICPP();
		IKCV ikcv = new IKCV();
		IHIT ihit = new IHIT();
		 
		System.out.println(icpp.calcula(o));
		System.out.println(ikcv.calcula(o));
		System.out.println(ihit.calcula(o));		
		
	}
}
