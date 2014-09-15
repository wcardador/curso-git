package decorator;
import java.util.ArrayList;
import java.util.List;

import strategy.Conta;

abstract class Filtro {
	
	protected Filtro outroFiltro;
	
	protected Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public Filtro(){}
	
	public abstract List<Conta> filtra(List<Conta> contas);
	
	protected List<Conta> proximo(List<Conta> contas) {
		if(outroFiltro != null) 
			return outroFiltro.filtra(contas);
		else return new ArrayList<Conta>();
	}
}
