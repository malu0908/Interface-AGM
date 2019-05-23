package AlgKruskal;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DesenhaTela extends JFrame {

	private static final long serialVersionUID = 1L;
	int tamanho = 58;
	private DesenhaGrafoAnterior grafoAnterior = new DesenhaGrafoAnterior();
	private DesenhaGrafoAtual grafoAtual = new DesenhaGrafoAtual();
	private JPanel AreaBotoes = new JPanel();

	public DesenhaTela() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Árvore Geradora Mínima");

		JButton button = new JButton("Aplicar modificações >>>");
		this.AreaBotoes.setSize(450, 100);
		this.AreaBotoes.setBackground(Color.black);
		this.AreaBotoes.add(button);
		AreaBotoes.setBounds(400,510, 200,200);
		
		getContentPane().add(AreaBotoes);
		getContentPane().add(grafoAnterior);
		getContentPane().add(grafoAtual);
		this.setVisible(true);
	}

	public DesenhaGrafoAnterior getDesenhaGrafoAnterior() {
		return this.grafoAnterior;
	}

	public DesenhaGrafoAtual getDesenhaGrafoAtual() {
		return this.grafoAtual;
	}
}
