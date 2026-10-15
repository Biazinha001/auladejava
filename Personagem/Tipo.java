package perssonagem;


public class Personagem {

    String nome;
    int vida;
    Tipo[] tipo;

    public Personagem(String nome, int vida, Tipo[] tipo) {
        this.nome = nome;
        this.vida = vida;
        this.tipo = tipo;
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

    public static void main(String[] args) {

        Tipo tipo1 = new Tipo("Guerreiro");
        Tipo tipo2 = new Tipo("Samurai");
        Tipo tipo3 = new Tipo("Zumbi");

        Tipo[] tipos = { tipo1, tipo2, tipo3 };

        Personagem personagem = new Personagem(
            "Ryu",
            100,
            tipos
        );

        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Vida: " + personagem.getVida());

        System.out.println("Tipos:");

        for (Tipo tipo : personagem.getTipo()) {
            System.out.println("- " + tipo.getNome());
        }

        Poder poder1 = new Poder("Soltar fogo");
        Poder poder2 = new Poder("Soltar raio");
        Poder poder3 = new Poder("Congelar");

        System.out.println("\nPoderes:");

        System.out.println("- " + poder1.getDescricao());
        System.out.println("- " + poder2.getDescricao());
        System.out.println("- " + poder3.getDescricao());
    }
}


public class Tipo {

    String nome;

    public Tipo(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}



public class Poder {

    String descricao;

    public Poder(String descricao) {
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}

