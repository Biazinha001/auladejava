public class Exercicio5 {
    public static void main(String[] args) {
        // Jogadores
        Jogador jogador_1 = new Jogador("Carlos", 9, "Atacante");
        Jogador jogador_2 = new Jogador("Pedro", 5, "Meio-campo");
        Jogador jogador_3 = new Jogador("Lucas", 1, "Goleiro");

        // Técnico e membros da equipe técnica
        Tecnico tecnico = new Tecnico("Marcos", 15);
        Membro membro_1 = new Membro("Ana", "Fisioterapeuta");
        Membro membro_2 = new Membro("Roberto", "Preparador físico");

        // Equipe técnica (possui um técnico e vários membros)
        EquipeTecnica equipe = new EquipeTecnica(
            "Comissão Técnica",
            tecnico,
            new Membro[] { membro_1, membro_2 }
        );

        // Time (possui vários jogadores e uma equipe técnica)
        Time time = new Time(
            "Tatuí FC",
            "Tatuí",
            new Jogador[] { jogador_1, jogador_2, jogador_3 },
            equipe
        );

        // Exibindo na tela
        System.out.println("Time: " + time.getNome());
        System.out.println("Cidade: " + time.getCidade());

        System.out.println("Jogadores:");
        for (Jogador j : time.getJogadores()) {
            System.out.println(" - " + j.getNome() + " | Camisa: " + j.getNumeroCamisa() + " | Posição: " + j.getPosicao());
        }

        EquipeTecnica et = time.getEquipeTecnica();
        System.out.println("Equipe Técnica: " + et.getNome());
        System.out.println("Técnico: " + et.getTecnico().getNome() + " (" + et.getTecnico().getAnosExperiencia() + " anos de experiência)");

        System.out.println("Membros:");
        for (Membro m : et.getMembros()) {
            System.out.println(" - " + m.getNome() + " | Função: " + m.getFuncao());
        }
    }
}
