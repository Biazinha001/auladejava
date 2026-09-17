import java.util.Scanner;

public class Main {

    public static void verificarValor(int valor) {

        if (valor < 0) {
            System.out.println("O valor é menor que zero.");
        } else if (valor > 0) {
            System.out.println("O valor é maior que zero.");
        } else {
            System.out.println("O valor é igual a zero.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();

        verificarValor(valor);

        scanner.close();
    }
}
