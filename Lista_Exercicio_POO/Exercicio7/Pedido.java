import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private String data;
    private List<Produto> produtos = new ArrayList<>();

    public Pedido(int numero, String data) {
        this.numero = numero;
        this.data = data;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public List<Produto> getProdutos() { return produtos; }
    public void setProdutos(List<Produto> produtos) { this.produtos = produtos; }

    public void adicionarProduto(Produto produto) { produtos.add(produto); }
}
