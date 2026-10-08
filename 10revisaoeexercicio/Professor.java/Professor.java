//PROFESSOR
public class Professor {

    String nome;
    int quantidadeCafe;
    String humor;
    String nivelDePaciencia;
    boolean usaDatashow;
    String fraseFavorita;

    public Professor(String nome, int quantidadeCafe, String humor, String nivelDePaciencia, boolean usaDatashow, String fraseFavorita) {
        this.nome = nome;
        this.quantidadeCafe = quantidadeCafe;
        this.humor = humor;
        this.nivelDePaciencia = nivelDePaciencia;
        this.usaDatashow = usaDatashow;
        this.fraseFavorita = fraseFavorita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setQuantidadeCafe(int quantidadeCafe) {
        this.quantidadeCafe = quantidadeCafe;
    }

    public int getQuantidadeCafe() {
        return this.quantidadeCafe;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    public String getHumor() {
        return this.humor;
    }

    public void setNivelDePaciencia(String nivelDePaciencia) {
        this.nivelDePaciencia = nivelDePaciencia;
    }

    public String getNivelDePaciencia() {
        return this.nivelDePaciencia;
    }

    public void setUsaDatashow(boolean usaDatashow) {
        this.usaDatashow = usaDatashow;
    }

    public boolean getUsaDatashow() {
        return this.usaDatashow;
    }

    public void setFraseFavorita(String fraseFavorita) {
        this.fraseFavorita = fraseFavorita;
    }

    public String getFraseFavorita() {
        return this.fraseFavorita;
    }

    public void ensinar() {
        System.out.println(this.nome + " finge ensinar.");
    }

    public void tomarCafe() {
        System.out.println(this.nome + " tomou café.");
    }

    public static void main(String[] args) {

        Professor professor = new Professor(
            "Carlos",
            3,
            "Feliz",
            "Baixa",
            true,
            "Prestem atenção!"
        );

        System.out.println("Nome: " + professor.getNome());
        System.out.println("Quantidade de café: " + professor.getQuantidadeCafe());
        System.out.println("Humor: " + professor.getHumor());
        System.out.println("Nível de paciência: " + professor.getNivelDePaciencia());
        System.out.println("Usa Datashow: " + professor.getUsaDatashow());
        System.out.println("Frase favorita: " + professor.getFraseFavorita());

        professor.ensinar();
        professor.tomarCafe();
    }
}