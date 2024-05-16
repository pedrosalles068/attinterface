public class Comida implements IProduto{
    private String nome;
    private double preco;
    public String descricao;

    public Comida(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return "";
    }

    @Override
    public double getPreco() {
        return 0;
    }
}
