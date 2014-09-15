package strategy;

public interface Resposta {
	void responde(Requisicao r, Conta c);
	void setProxima(Resposta r);
}
