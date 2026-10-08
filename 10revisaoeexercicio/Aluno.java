// ALUNO
public class Aluno {

    String nome;
    String email;
    boolean inteligente;
    int nivel_sono;
    boolean piscando_lento;

    public Aluno(String nome, String email, boolean inteligente, int nivel_sono, boolean piscando_lento) {
        this.nome = nome;
        this.email = email;
        this.inteligente = inteligente;
        this.nivel_sono = nivel_sono;
        this.piscando_lento = piscando_lento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setInteligente(boolean inteligente) {
        this.inteligente = inteligente;
    }

    public boolean getInteligente() {
        return this.inteligente;
    }

    public void setNivelSono(int nivel_sono) {
        this.nivel_sono = nivel_sono;
    }

    public int getNivelSono() {
        return this.nivel_sono;
    }

    public void setPiscandoLento(boolean piscando_lento) {
        this.piscando_lento = piscando_lento;
    }

    public boolean getPiscandoLento() {
        return this.piscando_lento;
    }

    public void dormirNaAula() {
        System.out.println(this.nome + " dormiu na aula.");
    }

    public void fingirEstudar() {
        System.out.println(this.nome + " está fingindo estudar.");
    }

    public static void main(String[] args) {

        Aluno estudante = new Aluno(
            "João",
            "joao@email.com",
            true,
            8,
            true
        );

        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Email: " + estudante.getEmail());
        System.out.println("Inteligente: " + estudante.getInteligente());
        System.out.println("Nível de sono: " + estudante.getNivelSono());
        System.out.println("Piscando lento: " + estudante.getPiscandoLento());

        estudante.dormirNaAula();
        estudante.fingirEstudar();
    }
}