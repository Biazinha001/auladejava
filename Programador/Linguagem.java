package Programador;

public class Programador {

    Linguagem[] linguagem;
    int nivel_cafeina;
    SistemaOperacional[] sistema_operacional;

    public Programador(Linguagem[] linguagem, int nivel_cafeina, SistemaOperacional[] sistema_operacional) {
        this.linguagem = linguagem;
        this.nivel_cafeina = nivel_cafeina;
        this.sistema_operacional = sistema_operacional;
    }

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

    public void setSistemaOperacional(SistemaOperacional[] sistema_operacional) {
        this.sistema_operacional = sistema_operacional;
    }

    public SistemaOperacional[] getSistemaOperacional() {
        return this.sistema_operacional;
    }

    public static void main(String[] args) {

        Linguagem linguagem1 = new Linguagem("Java");
        Linguagem linguagem2 = new Linguagem("Python");
        Linguagem linguagem3 = new Linguagem("JavaScript");

        Linguagem[] linguagens = {
            linguagem1,
            linguagem2,
            linguagem3
        };

        SistemaOperacional sistema1 = new SistemaOperacional("Windows");
        SistemaOperacional sistema2 = new SistemaOperacional("Linux");

        SistemaOperacional[] sistemas = {
            sistema1,
            sistema2
        };

        Programador programador = new Programador(
            linguagens,
            90,
            sistemas
        );

        System.out.println("Nível de cafeína: " + programador.getNivelCafeina());

        System.out.println("Linguagens:");

        for (Linguagem linguagem : programador.getLinguagem()) {
            System.out.println("- " + linguagem.getNome());
        }

        System.out.println("Sistemas Operacionais:");

        for (SistemaOperacional sistema : programador.getSistemaOperacional()) {
            System.out.println("- " + sistema.getNome());
        }
    }
}


public class Linguagem {

    String nome;

    public Linguagem(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}


public class SistemaOperacional {

    String nome;

    public SistemaOperacional(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
