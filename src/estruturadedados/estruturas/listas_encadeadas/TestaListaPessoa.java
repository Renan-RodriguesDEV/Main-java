package estruturadedados.estruturas.listas_encadeadas;

public class TestaListaPessoa {
	public static void main(String[] args) {
		ListaPessoa lista = new ListaPessoa();
		lista.insereClassificado(new Pessoa("Asdrubal", 98));
		lista.insereClassificado(new Pessoa("Xispocovênio", 55));
		lista.insereClassificado(new Pessoa("Plinofélfio", 74));
		lista.insereClassificado(new Pessoa("Maria", 59));
		Pessoa p = new Pessoa();
		p.setNome("Didi");
		p.setPeso(105);
		lista.insereClassificado(p);
		System.out.println("A lista possui " + lista.getTamamanho() + " elementos");
		lista.exibe();
	}
}
