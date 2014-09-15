package state;

public class Negativo implements EstadoDeUmaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Sua conta est� no vermelho. N�o � poss�vel sacar!");
		
	}

	@Override
	public void deposita(Conta conta, double valor) {
		System.out.println("state.deposita");
		conta.saldo += valor * 0.95;
		if(conta.saldo > 0) conta.estado = new Positivo();
		
	}

}
