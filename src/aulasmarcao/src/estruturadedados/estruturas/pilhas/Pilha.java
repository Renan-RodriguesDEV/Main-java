package aulasmarcao.src.estruturadedados.estruturas.pilhas;

public class Pilha {
	private String[] dados;
	private int topo, qtd;

	public Pilha(int n) {
		dados = new String[n];
		topo = 0;
		qtd = 0;
	}

	public boolean push(String dado) {
		if (qtd == dados.length) {
			return false;
		}
		dados[topo] = dado;
		topo++;
		qtd++;
		return true;
	}

	public String pop() {
		if (qtd == 0) {
			return null;
		}
		String dado = dados[topo - 1];
		topo--;
		qtd--;
		return dado;
	}

	public void exibir() {
		for (int cont = 0; cont < topo; cont++) {
			System.out.print(dados[cont] + "   ");
		}
		System.out.println();
	}
}
