public class Linguagem {

    // Atributos
    String nome = "";
    String nivel = "";

    // Construtor
    public Linguagem(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    // Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return this.nivel;
    }
}
