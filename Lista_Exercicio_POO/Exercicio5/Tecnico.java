public class Tecnico {
    String nome;
    int anos_experiencia;

    public Tecnico(String nome, int anos_experiencia) {
        this.nome = nome;
        this.anos_experiencia = anos_experiencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setAnosExperiencia(int anos_experiencia) {
        this.anos_experiencia = anos_experiencia;
    }

    public int getAnosExperiencia() {
        return this.anos_experiencia;
    }
}
