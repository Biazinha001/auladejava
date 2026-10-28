public class Jogador {
    String nome;
    int numero_camisa;
    String posicao;

    public Jogador(String nome, int numero_camisa, String posicao) {
        this.nome = nome;
        this.numero_camisa = numero_camisa;
        this.posicao = posicao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNumeroCamisa(int numero_camisa) {
        this.numero_camisa = numero_camisa;
    }

    public int getNumeroCamisa() {
        return this.numero_camisa;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPosicao() {
        return this.posicao;
    }
}