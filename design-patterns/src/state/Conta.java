package state;

public class Conta {
	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected EstadoDeUmaConta estado;

	public void saca(double valor) {
		estado.saca(this, valor);
	}
	
	public void deposita(double valor) {
		estado.deposita(this, valor);
	}
}
