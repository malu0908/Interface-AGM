package AlgKruskal;

import java.io.IOException;

public class Teste {
	public static void main(String[] args) throws IOException {
		Matrizes.inicializa();
		Kruskal geraAGM = new Kruskal();
		DesenhaTela tela = new DesenhaTela();
		geraAGM.addObserver(tela.getDesenhaGrafoAtual());
		geraAGM.addObserver(tela.getDesenhaGrafoAnterior());
		geraAGM.executa();
	}
}
