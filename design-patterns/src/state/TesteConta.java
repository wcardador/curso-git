package state;

public class TesteConta {
	
	public static void main(String[] args) {
		Conta c = new Conta();
		c.deposita(100);
		System.out.println("Saldo inicial " + c.getSaldo());

		//System.out.println("Saldo ap�s dep�sito 100 " + c.getSaldo());
		//c.saca(10);
		//System.out.println("Saldo ap�s saque 10" + c.getSaldo());
		

	}

}
