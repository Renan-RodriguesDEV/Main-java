package main.estruturadedados.estruturas.listas_encadeadas;

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

	public boolean contem(Pessoa p) {
		NoPessoa no = head;
		while (no != null) {
			if (p.equals(no.getPessoa())) {
				return true;
			}
			no = no.getProximo();
		}
		return false;
	}

	public Pessoa buscaPorNome(String nome) {
		NoPessoa no = head;
		while (no != null) {
			if (nome.equalsIgnoreCase(no.getPessoa().getNome())) {
				return no.getPessoa();
			}
			no = no.getProximo();
		}
		return null;
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

	public void removeNoInicio() {
		if (head != null) {
			if (tamanho == 1) {
				head = tail = null;
				tamanho = 0;
			} else {
				NoPessoa p = head.getProximo();
				head.setProximo(null);
				p.setAnterior(null);
				head = p;
				tamanho--;
			}
		}
	}

	public void removeNoFinal() {
		if (head != null) {
			if (tamanho == 1) {
				head = tail = null;
				tamanho = 0;
			} else {
				NoPessoa p = tail.getAnterior();
				tail.setAnterior(null);
				p.setProximo(null);
				tail = p;
				tamanho--;
			}
		}
	}

	public void insereClassificado(Pessoa pessoa) {
		NoPessoa novo = new NoPessoa(pessoa);
		if (tamanho == 0) {
			head = novo;
			tail = novo;
			tamanho = 1;
		} else {
			NoPessoa p = head;
			while (p != null
					&& p.getPessoa().getNome().compareTo(
							novo.getPessoa().getNome()) < 0) {
				p = p.getProximo();
			}
			if (p == head) {
				// Inserção no início
				novo.setProximo(p);
				p.setAnterior(novo);
				head = novo;
				tamanho++;
			} else if (p != null) {
				// Inserção no meio
				novo.setProximo(p);
				novo.setAnterior(p.getAnterior());
				p.getAnterior().setProximo(novo);
				p.setAnterior(novo);
				tamanho++;
			} else {
				// Inserção no final
				novo.setAnterior(tail);
				tail.setProximo(novo);
				tail = novo;
				tamanho++;
			}
		}
	}
}
