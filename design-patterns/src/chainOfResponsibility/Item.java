package chainOfResponsibility;

public class Item {
	public final String nome;
	public final double valor;
	
	public Item(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public double getValor() {
		return valor;
	}
}
