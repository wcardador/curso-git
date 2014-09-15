package observer;

public class EnviadorDeSms implements AcaoAposGerarNota {
	
	public void executa(NotaFiscal nf) {
		System.out.println("Envei por SMS!");
	}

}
