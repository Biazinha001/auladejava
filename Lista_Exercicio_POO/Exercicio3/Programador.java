public class Programador {

    // Atributos
    Linguagem[] linguagem;
    int nivel_cafeina = 0;
    SistemaOperacional[] sistema_operacional;

    // Construtor
    public Programador(Linguagem[] linguagem, int nivel_cafeina,
                       SistemaOperacional[] sistema_operacional) {
        this.linguagem = linguagem;
        this.nivel_cafeina = nivel_cafeina;
        this.sistema_operacional = sistema_operacional;
    }

    // Getters e Setters
    public void setLinguagem(Linguagem[] linguagem) {
        this.linguagem = linguagem;
    }

    public Linguagem[] getLinguagem() {
        return this.linguagem;
    }

    public void setNivelCafeina(int nivel_cafeina) {
        this.nivel_cafeina = nivel_cafeina;
    }

    public int getNivelCafeina() {
        return this.nivel_cafeina;
    }

    public void setSistemaOperacional(
            SistemaOperacional[] sistema_operacional) {
        this.sistema_operacional = sistema_operacional;
    }

    public SistemaOperacional[] getSistemaOperacional() {
        return this.sistema_operacional;
    }

    // Método personalizado
    public void programar() {
        System.out.println("O programador está programando!");
    }
}