package ex6arraymultidimensional.expratico12;

//int[] numeros = { 5, -2, 10, -8,3, 0, 7 };
//Utilize `for-each` para contar quantos números são positivos.

public class Main {
    public static void main(String[] args) {

        int[] numeros = {5, -2, 10, -8, 3, 0, 7};

        int positivos = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + positivos);
    }
}
