class personagem {
    String nome = "Herói";
    int idade;
    int poder;
}

public class Main {
    public static void main(String[] args) {
        personagem persona = new personagem();

        persona.idade = 42;
        persona.poder = 4;

        System.out.println(persona.nome);
        System.out.println(persona.idade);
        System.out.println(persona.poder);
    }
}
