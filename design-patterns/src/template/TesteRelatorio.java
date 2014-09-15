package template;

import java.util.ArrayList;

import strategy.Conta;

public class TesteRelatorio {
	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<Conta>();
		contas.add(new Conta("JOSÉ MARIA",  1001, 123, 12345));
		contas.add(new Conta("MARIO SILVA", 1002, 456, 12346));
		contas.add(new Conta("DILMANTA ",   1003, 789, 12347));
		contas.add(new Conta("LULARÁPIO",   1004, 101, 12348));
		
		//RelatorioComplexo c = new RelatorioComplexo();
		RelatorioSimples s = new RelatorioSimples();
		
//		c.imprime(contas);
		s.imprime(contas);

	}
}
