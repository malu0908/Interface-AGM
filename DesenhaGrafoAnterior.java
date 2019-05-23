package AlgKruskal;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class DesenhaGrafoAnterior extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;
	public boolean primeiro;
	public Aresta[] aresta;
	int escala = 4;
	int tamBol = 10;
	int soma;
	
	public DesenhaGrafoAnterior() {
		setSize(500,500);
	}
	
	public void paintComponent(Graphics grafo) {
		super.paintComponent(grafo);
		this.setBackground(Color.black);
		printaGrafoAtual(grafo);
	}
	
	
	public void printaGrafoAtual(Graphics grafo) {
		if(!primeiro)
			aresta = Vetor.getVetorIni();
		else
			aresta = Vetor.getVetorRes();
		
		for (int i = 0; i < aresta.length; i++) {
			grafo.setColor(Color.white);
			grafo.drawLine((int) (Matrizes.getMatriz()[aresta[i].vertice1][0] * escala),
					(int) (Matrizes.getMatriz()[aresta[i].vertice1][1] * escala),
					(int) (Matrizes.getMatriz()[aresta[i].vertice2][0] * escala),
					(int) (Matrizes.getMatriz()[aresta[i].vertice2][1] * escala));

			grafo.setColor(Color.red);
			grafo.fillOval((int) (Matrizes.getMatriz()[aresta[i].vertice1][0] * escala - tamBol/2),
					(int) (Matrizes.getMatriz()[aresta[i].vertice1][1] * escala - tamBol/2), tamBol, tamBol);
			grafo.setColor(Color.white);

			grafo.setColor(Color.red);
			grafo.fillOval((int) (Matrizes.getMatriz()[aresta[i].vertice2][0] * escala - tamBol/2),
					(int) (Matrizes.getMatriz()[aresta[i].vertice2][1] * escala - tamBol/2), tamBol, tamBol);
		}		
	}

	public void update(Observable o, Object arg) {
		if((boolean)arg == false) {
			this.repaint();
			this.primeiro = true;
		}
	}

}