import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public int numero;
    public String data;
    public Cliente cliente;
    public String status;
    public List<IProduto> itens = new ArrayList();


    public Pedido(int numero, String data, Cliente cliente, String status, List<IProduto> itens) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.status = status;
        this.itens = itens;
    }

    public void adicionarItem(IProduto item) {
        itens.add(item);
    }

    public void removerItem(IProduto item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (IProduto item : itens) {
            total += item.getPreco();
        }

        return total;
    }

}
