package decorator;

public class TesteDeImpostosComplexos {
	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS(new ICCC()));
		
		Orcamento orcamento = new Orcamento(500);
		double valor = iss.calcula(orcamento);
		System.out.println(valor);
		
		Imposto i = new ImpostoMuitoAlto(new ISS());
		System.out.println(i.calcula(orcamento));
	}
}
