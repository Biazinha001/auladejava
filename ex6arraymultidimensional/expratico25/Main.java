package ex6arraymultidimensional.expratico25;

//SIGA
public class Main {
    public static void main(String[] args) {

        String[] alunos = {"Ana", "Carlos", "Mariana", "João", "Pedro"};
        double[] notas = {8.5, 5.0, 9.0, 3.5, 7.0};

        for (int i = 0; i < alunos.length; i++) {

            if (notas[i] >= 7) {
                System.out.println(alunos[i] + " → Aprovado");
            } else if (notas[i] >= 5) {
                System.out.println(alunos[i] + " → Recuperação");
            } else {
                System.out.println(alunos[i] + " → Reprovado");
            }
        }
    }
}