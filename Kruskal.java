package AlgKruskal;

import java.io.IOException;
import java.util.Arrays;
import java.util.Observable;

public class Kruskal extends Observable {
	Aresta resultado[] = new Aresta[57];
	Aresta[] arestas = new Aresta[(58 * 57) / 2];
	UnionFind conjuntos = new UnionFind();
	boolean setaGrafo;

	public Kruskal() {
		// gera os conjuntos iniciais composto por conjuntos unitarios
		conjuntos.criaEstrutura();

		// cria uma vetor com as arestas em ordem crescente, considerando apenas a
		// matriz triangular superior
		int w = 0;
		for (int i = 0; i < 58; i++) {
			for (int j = i + 1; j < 58; j++) {
				if (i != j) {
					arestas[w] = new Aresta(i, j, Matrizes.getMatrizAdj()[i][j]);
					w++;
				}
			}
		}
		Vetor.setVetorIni(arestas);
		notifica(false);
		Arrays.sort(arestas);
		
	}
	
	public void notifica(boolean muda) {
		setChanged();
		notifyObservers(muda);
	}

	public void executa() throws IOException {
		int w = 0;
		for (int i = 0; i < arestas.length; i++) {
			if (!(conjuntos.teste(arestas[i].vertice1, arestas[i].vertice2))) {
				conjuntos.juntar(arestas[i].vertice1, arestas[i].vertice2);
				resultado[w] = arestas[i];
				w++;
			}
		}
		Vetor.setVetorRes(resultado);
		notifica(true);
		notifica(false);
		
//		for(int i = 0; i < resultado.length; i++) {
//			System.out.print(i+1 + " " + "(" + resultado[i].vertice1 + "," + resultado[i].vertice2 + ")" + " " +resultado[i].peso);
//			System.out.println();
//		}
	}
}
