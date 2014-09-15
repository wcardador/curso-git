package observer;

public class TesteAcoes {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new Impressora());
		builder.adicionaAcao(new Multiplicador(2));
		builder.adicionaAcao(new Multiplicador(3));
		builder.adicionaAcao(new Multiplicador(5));

		NotaFiscal nf = builder.paraEmpresa("Caelum").comCnpj("123")
				.comItem(new ItemDaNota("item 1", 10)).comObservacoes("obs")
				.naDataAtual().constroi();
		
		System.out.println(nf.getValorBruto());

	}

}
