package template;

import java.util.List;

import strategy.Conta;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("RELATÓRIO SIMPLES - Banco XYZ");		
	}

	@Override
	protected void rodape() {
		System.out.println("(011) 9879-9878");
		
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for(Conta c: contas) {
			System.out.println( c.getTitular() + " Saldo: " + c.getSaldo());
		}
		
	}

}
