package ex6arraymultidimensional.expratico26;

// Melhorando o Siga
public class Main {
    public static void main(String[] args) {

        String[] alunos = {"Ana", "Carlos", "Mariana", "João"};
        double[] notas = {8.5, 5.0, 9.0, 3.5};

        double soma = 0;
        double maior = notas[0];
        double menor = notas[0];

        System.out.println("===== RELATÓRIO =====");
        System.out.println();

        for (int i = 0; i < alunos.length; i++) {

            if (notas[i] >= 7) {
                System.out.println(alunos[i] + "       " + notas[i] + "  APROVADO");
            } else if (notas[i] >= 5) {
                System.out.println(alunos[i] + "       " + notas[i] + "  RECUPERAÇÃO");
            } else {
                System.out.println(alunos[i] + "       " + notas[i] + "  REPROVADO");
            }

            soma += notas[i];

            if (notas[i] > maior) {
                maior = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double media = soma / notas.length;

        System.out.println();
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
    }
}