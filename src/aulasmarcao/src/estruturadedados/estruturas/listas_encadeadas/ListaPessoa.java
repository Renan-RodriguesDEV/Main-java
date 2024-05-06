package estruturas.listas_encadeadas;

public class ListaPessoa {
	private NoPessoa head;
	private NoPessoa tail;
	private int tamanho;

	public int getTamamanho() {
		return tamanho;
	}

	public void insereNoInicio(Pessoa pessoa) {
		NoPessoa novo = new NoPessoa(pessoa);
		if (head == null) {
			head = novo;
			tail = novo;
			tamanho = 1;
		} else {
			novo.setProximo(head);
			head.setAnterior(novo);
			head = novo;
			tamanho++;
		}
	}

	public void exibe() {
		NoPessoa no = head;
		while (no != null) {
			System.out.println(no.getPessoa());
			no = no.getProximo();
		}
	}

	public void insereNoFinal(Pessoa pessoa) {
		NoPessoa novo = new NoPessoa(pessoa);
		if (head == null) {
			head = tail = novo;
			tamanho = 1;
		} else {
			novo.setAnterior(tail);
			tail.setProximo(novo);
			tail = novo;
			tamanho++;
		}
	}

}
