import java.util.Scanner;

public class Main {

    public static void verificarSituacao(String nome, double nota) {
        if (nota >= 7) {
            System.out.println(nome + " está APROVADO.");
        } else {
            System.out.println(nome + " está REPROVADO.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        verificarSituacao(nome, nota);

        scanner.close();
    }
}

