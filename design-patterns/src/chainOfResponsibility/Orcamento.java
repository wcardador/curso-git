package chainOfResponsibility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	private final double valor;
	private final List<Item> itens;

	public Orcamento(double valor) {
		super();
		this.valor = valor;
		itens = new ArrayList<Item>();
	}
	public double getValor() {
		return valor;
	}
	public void adicionaItem(Item item) {
		itens.add(item);
	}
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	
	
}
