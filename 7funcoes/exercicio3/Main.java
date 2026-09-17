import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Chamada da função que exibe a tabuada
        exibirTabuada(numero);

        scanner.close();
    }

    // Função que recebe um valor inteiro e exibe a tabuada
    public static void exibirTabuada(int numero) {
        System.out.println("\nTabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

