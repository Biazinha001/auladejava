package ex6arraymultidimensional.expratico24;

//Sistema de Estoque
public class Main {
    public static void main(String[] args) {

        String[] produtos = {"Mouse", "Teclado", "Monitor", "Notebook", "Impressora"};
        int[] estoque = {10, 3, 0, 5, 2};

        for (int i = 0; i < produtos.length; i++) {

            if (estoque[i] == 0) {
                System.out.println(produtos[i] + " → SEM ESTOQUE");
            } else {
                System.out.println(produtos[i] + " → " + estoque[i] + " unidades");
            }
        }
    }
}