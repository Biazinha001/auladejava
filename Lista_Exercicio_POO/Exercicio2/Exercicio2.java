public class Exercicio2 {
    public static void main(String[] args) {
        // Instâncias de Tipo
        Tipo guerreiro = new Tipo("Guerreiro");
        Tipo samurai = new Tipo("Samurai");
        Tipo zumbi = new Tipo("Zumbi");

        // Instâncias de Poder
        Poder fogo = new Poder("Soltar fogo");
        Poder agua = new Poder("Soltar água");
        Poder congelar = new Poder("Congelar");
        Poder raio = new Poder("Lançar raio");

        // Instâncias de Personagem (relacionando com Tipo e Poder)
        Personagem personagem_1 = new Personagem(
            "Hiro", 100,
            new Tipo[] { guerreiro, samurai },
            new Poder[] { fogo, raio }
        );

        Personagem personagem_2 = new Personagem(
            "Zed", 80,
            new Tipo[] { zumbi },
            new Poder[] { agua, congelar }
        );

        Personagem[] personagens = { personagem_1, personagem_2 };

        // Exibindo na tela
        for (Personagem p : personagens) {
            System.out.println("Personagem: " + p.getNome());
            System.out.println("Vida: " + p.getVida());

            System.out.println("Tipos:");
            for (Tipo t : p.getTipo()) {
                System.out.println(" - " + t.getNome());
            }

            System.out.println("Poderes:");
            for (Poder po : p.getPoderes()) {
                System.out.println(" - " + po.getDescricao());
            }

            System.out.println("-------------------------");
        }
    }
}