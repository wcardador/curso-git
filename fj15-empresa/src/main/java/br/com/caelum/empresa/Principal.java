package br.com.caelum.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;

public class Principal {
	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1976, 03, 25);
		Funcionario funcionario = new Funcionario("Well", 1234, dataNascimento);
		Calendar hoje = Calendar.getInstance();
		Gasto gasto1 = new Gasto(40, "taxi", funcionario, hoje, true);
		Gasto gasto2 = new Gasto(12, "onibus", funcionario, hoje, true);
		Gasto gasto3 = new Gasto(5, "mototáxi", funcionario, hoje, true);
		System.out.println(gasto1);
		System.out.println(gasto2);
		System.out.println(gasto3);		
	}
}
