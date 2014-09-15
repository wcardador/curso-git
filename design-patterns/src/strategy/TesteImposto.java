package strategy;

public class TesteImposto {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Orcamento orcamento = new Orcamento(500);
		CalculaImposto calcula = new CalculaImposto();
		calcula.realizaCalculo(orcamento, iss);
		calcula.realizaCalculo(orcamento, icms);
	}

}
