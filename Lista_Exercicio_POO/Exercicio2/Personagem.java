public class Personagem {
    String nome;
    int vida;
    Tipo[] tipo;
    Poder[] poderes;

    public Personagem(String nome, int vida, Tipo[] tipo, Poder[] poderes) {
        this.nome = nome;
        this.vida = vida;
        this.tipo = tipo;
        this.poderes = poderes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return this.vida;
    }

    public void setTipo(Tipo[] tipo) {
        this.tipo = tipo;
    }

    public Tipo[] getTipo() {
        return this.tipo;
    }

    public void setPoderes(Poder[] poderes) {
        this.poderes = poderes;
    }

    public Poder[] getPoderes() {
        return this.poderes;
    }
}