package ex6arraymultidimensional.expratico4;

//Crie 3 variáveis aleatórias inteiras e exiba qual é a maior.

public class Main {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 25;
        int numero3 = 15;

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("O maior número é: " + numero3);
        }
    }
}