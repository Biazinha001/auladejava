public class Membro {
    String nome;
    String funcao;

    public Membro(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getFuncao() {
        return this.funcao;
    }
}
