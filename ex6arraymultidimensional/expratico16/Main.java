package ex6arraymultidimensional.expratico16;

//Crie um array contendo 10 números.
//Exiba a quantidade de números positivos, negativos e iguais a zero.

public class Main {
    public static void main(String[] args) {

        int[] numeros = {5, -2, 10, 0, -8, 3, 0, 7, -4, 12};

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
    }
}
