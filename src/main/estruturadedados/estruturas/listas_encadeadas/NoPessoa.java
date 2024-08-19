package main.estruturadedados.estruturas.listas_encadeadas;

public class NoPessoa {
	private Pessoa pessoa;
	private NoPessoa proximo;
	private NoPessoa anterior;

	public NoPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public NoPessoa getProximo() {
		return proximo;
	}

	public void setProximo(NoPessoa proximo) {
		this.proximo = proximo;
	}

	public NoPessoa getAnterior() {
		return anterior;
	}

	public void setAnterior(NoPessoa anterior) {
		this.anterior = anterior;
	}
}
