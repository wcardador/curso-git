package strategy;

public class RespostaEmXML implements Resposta {
	private Resposta outraResposta;

	@Override
	public void responde(Requisicao r, Conta c) {
		if(r.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + c.getTitular() + "</titular><saldo>" 
					+ c.getSaldo() + "</saldo></conta>");
		} else {
			outraResposta.responde(r, c);
		}
		
	}

	@Override
	public void setProxima(Resposta r) {
		this.outraResposta = r;
		
	}

}
