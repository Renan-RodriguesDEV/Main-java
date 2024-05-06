package estruturas.listas_encadeadas;

public class TestaListaPessoa {
	public static void main(String[] args) {
		ListaPessoa lista = new ListaPessoa();
		lista.insereNoInicio(new Pessoa("Asdrubal", 98));
		lista.insereNoInicio(new Pessoa("Xispocovênio", 55));
		lista.insereNoInicio(new Pessoa("Plinofélfio", 74));
		lista.insereNoFinal(new Pessoa("Maria", 59));
		System.out.println("A lista possui " + lista.getTamamanho() + " elementos");
		lista.exibe();
	}
}
