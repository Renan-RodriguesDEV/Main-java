package estruturas.listas_encadeadas;

public class TestaListaPessoa {
	public static void main(String[] args) {
		ListaPessoa lista = new ListaPessoa();
		lista.insereNoInicio(new Pessoa("Asdrubal", 98));
		lista.insereNoInicio(new Pessoa("Xispocovênio", 55));
		lista.insereNoInicio(new Pessoa("Plinofélfio", 74));
		lista.insereNoFinal(new Pessoa("Maria", 59));
		Pessoa p = new Pessoa();
		p.setNome("Didi");
		p.setPeso(105);
		lista.insereNoInicio(p);
		System.out.println("A lista possui " + lista.getTamamanho() + " elementos");
		lista.exibe();
		if (lista.contem(new Pessoa("Asdrubal", 98))) {
			System.out.println("A Pessoa foi encontrada!");
		} else {
			System.out.println("A Pessoa não está na lista.");
		}
		Pessoa procurado = lista.buscaPorNome("Xispocovênio");
		System.out.println(procurado);
	}
}
