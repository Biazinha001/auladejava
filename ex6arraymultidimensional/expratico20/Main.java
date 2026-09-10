package ex6arraymultidimensional.expratico20;

// Sistema de Notas
public class Main {
    public static void main(String[] args) {

        double[] notas = {7.5, 4.0, 8.5, 5.5, 9.0, 3.5};

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > 7) {
                System.out.println(notas[i] + " → Aprovado");
            } else if (notas[i] < 5) {
                System.out.println(notas[i] + " → Reprovado");
            } else {
                System.out.println(notas[i] + " → Recuperação");
            }
        }
    }
}
