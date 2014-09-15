package state;

public class EmAprovacao implements EstadoDeUmOrcamento
{
	
	private boolean descontoAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto j� aplicado!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finalizado(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos em aprova��o n�o podem ir direto para finaliza��o");
		
	}
}
