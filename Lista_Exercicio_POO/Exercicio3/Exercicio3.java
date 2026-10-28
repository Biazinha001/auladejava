
public class Exercicio3 {

    public static void main(String[] args) {

        // Instâncias de Linguagem
        Linguagem linguagem1 = new Linguagem("Java", "Avançado");
        Linguagem linguagem2 = new Linguagem("Python", "Intermediário");
        Linguagem linguagem3 = new Linguagem("JavaScript", "Básico");

        // Instâncias de SistemaOperacional
        SistemaOperacional sistema1 =
            new SistemaOperacional("Windows", "11");

        SistemaOperacional sistema2 =
            new SistemaOperacional("Linux", "Ubuntu");

        // Arrays
        Linguagem[] linguagens = {
            linguagem1, linguagem2, linguagem3
        };

        SistemaOperacional[] sistemas = {
            sistema1, sistema2
        };

        // Instância de Programador
        Programador programador1 =
            new Programador(linguagens, 80, sistemas);

        // Exibição dos dados
        System.out.println("=== PROGRAMADOR ===");
        System.out.println("Nível de cafeína: "
            + programador1.getNivelCafeina() + "%");

        System.out.println("\n=== LINGUAGENS ===");

        for (Linguagem linguagem : programador1.getLinguagem()) {
            System.out.println("Nome: " + linguagem.getNome());
            System.out.println("Nível: " + linguagem.getNivel());
        }

        System.out.println("\n=== SISTEMAS OPERACIONAIS ===");

        for (SistemaOperacional sistema :
                programador1.getSistemaOperacional()) {
            System.out.println("Nome: " + sistema.getNome());
            System.out.println("Versão: " + sistema.getVersao());
        }

        // Executando método
        programador1.programar();
    }
}