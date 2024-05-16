public class Bebida implements IProduto {
    public String nome;
    public double preco;
    public String descricao;

    public Bebida(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
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
