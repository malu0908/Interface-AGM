package AlgKruskal;

public class Vetor {
	public static Aresta vetorInicial[] = new Aresta[58 * 57 / 2];
	public static Aresta vetorResultado[] = new Aresta[57];
	
	public static Aresta[] getVetorRes() {
		return vetorResultado;
	}
	
	public static void setVetorRes(Aresta v[]) {
		vetorResultado = v;
	}
	
	public static Aresta[] getVetorIni() {
		return vetorInicial;
	}
	
	public static void setVetorIni(Aresta v[]) {
		vetorInicial = v;
	}
	
}
