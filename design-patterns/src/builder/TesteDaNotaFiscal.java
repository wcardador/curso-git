package builder;

import java.awt.List;
import java.util.Arrays;

public class TesteDaNotaFiscal {
	public static void main(String[] args) {
		CriadorDeNotaFiscal criador = new CriadorDeNotaFiscal();
		criador.paraEmpresa("");
		criador.comCnpj("");
	}
}
