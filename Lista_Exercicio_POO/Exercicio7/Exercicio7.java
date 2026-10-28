public class Exercicio7 {
    public static void main(String[] args) {
        Categoria informatica = new Categoria(1, "Informática");
        Categoria perifericos = new Categoria(2, "Periféricos");

        Produto notebook = new Produto("Notebook", 3500.00, informatica);
        Produto mouse = new Produto("Mouse", 80.00, perifericos);
        Produto teclado = new Produto("Teclado", 150.00, perifericos);

        Pedido pedido1 = new Pedido(1, "27/10/2026");
        pedido1.adicionarProduto(notebook);
        pedido1.adicionarProduto(mouse);

        Pedido pedido2 = new Pedido(2, "28/10/2026");
        pedido2.adicionarProduto(teclado);

        Cliente cliente = new Cliente("João Pedro", "123.456.789-00");
        cliente.adicionarPedido(pedido1);
        cliente.adicionarPedido(pedido2);

        System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf());

        for (Pedido p : cliente.getPedidos()) {
            System.out.println("\nPedido #" + p.getNumero() + " - " + p.getData());
            for (Produto prod : p.getProdutos()) {
                System.out.println("- " + prod.getNome() + " | R$ " + prod.getPreco()
                        + " | Categoria: " + prod.getCategoria().getNome());
            }
        }
    }
}
