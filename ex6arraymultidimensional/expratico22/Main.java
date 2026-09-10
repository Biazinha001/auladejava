package ex6arraymultidimensional.expratico22;

//Desafio do maior e menor número
public class Main {
    public static void main(String[] args) {

        int[] numeros = {15, 8, 32, 4, 19, 27, 11};

        int maior = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
