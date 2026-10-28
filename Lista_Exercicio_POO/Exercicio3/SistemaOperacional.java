public class SistemaOperacional {

    // Atributos
    String nome = "";
    String versao = "";

    // Construtor
    public SistemaOperacional(String nome, String versao) {
        this.nome = nome;
        this.versao = versao;
    }

    // Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getVersao() {
        return this.versao;
    }
}
