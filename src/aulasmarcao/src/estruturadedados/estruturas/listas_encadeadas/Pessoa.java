package estruturas.listas_encadeadas;

import java.util.Objects;

public class Pessoa {
	private String nome;
	private double peso;

	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return nome + " - " + peso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}

}
