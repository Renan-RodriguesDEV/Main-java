package aulasmarcao.src.estruturadedados.estruturas.listas_encadeadas;

public class Nos {
    private String nome;
    private Nos proximo;
    private Nos anterior;

    public Nos(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the valor
     */
    public String getValor() {
        return nome;
    }

    /**
     * 
     * /**
     * 
     * @return Nos return the proximo
     */
    public Nos getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(Nos proximo) {
        this.proximo = proximo;
    }

    /**
     * @return Nos return the anterior
     */
    public Nos getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nos anterior) {
        this.anterior = anterior;
    }

}
