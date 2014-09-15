package template;

import java.util.Calendar;
import java.util.List;

import strategy.Conta;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("RELATÓRIO COMPLEXO - Banco XYZ");
		System.out.println("Avenida Paulista, 123");
		System.out.println("(11) 1234-5678");
		
	}

	@Override
	protected void rodape() {
		System.out.println("banco@xyz.com.br");
		System.out.println(Calendar.getInstance().getTime());
		
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for(Conta c: contas) {
			System.out.println("Nome: " + c.getTitular() + " Agência: " + c.getAgencia() + 
					" Número: "+ c.getNumero() + " Saldo: " + c.getSaldo());
		}
		
	}

}
