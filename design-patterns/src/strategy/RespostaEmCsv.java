package strategy;

public class RespostaEmCsv implements Resposta {
	
	private Resposta outraResposta;

	@Override
	public void responde(Requisicao r, Conta c) {
		if(r.getFormato() == Formato.CSV) {
			System.out.println("" + c.getTitular() + ";" + c.getSaldo() + ";");
		} else {
			outraResposta.responde(r, c);
		}
		
	}

	@Override
	public void setProxima(Resposta r) {
		this.outraResposta = r;
		
	}

}
