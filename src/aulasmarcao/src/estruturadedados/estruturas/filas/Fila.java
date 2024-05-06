package estruturas.filas;

public class Fila {
	private String[] dados;
	private int inicio, fim, qtd;

	public Fila(int n) {
		dados = new String[n];
		inicio = 0;
		fim = 0;
		qtd = 0;
	}

	public boolean adicionar(String dado) {
		if (qtd == dados.length) {
			return false;
		}
		dados[fim] = dado;
		fim = (fim + 1) % dados.length;
		qtd++;
		return true;
	}

	public String retirar() {
		if (qtd == 0) {
			return null;
		}
		String dado = dados[inicio];
		inicio = (inicio + 1) % dados.length;
		qtd--;
		return dado;
	}

	public void exibir() {
		for (int cont = 1; cont <= qtd; cont++) {
			System.out.print(dados[inicio] + "   ");
			inicio = (inicio + 1) % dados.length;
		}
		System.out.println();
	}
}
