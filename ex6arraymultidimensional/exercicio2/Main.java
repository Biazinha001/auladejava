package ex6arraymultidimensional.exercicio2;

    public class Main {
        public static void main(String[] args) {
            int[][] numeros = {
                {1, 4, 2},
                {3, 6, 8, 5, 2}
            };
            for(int[] linha: numeros) {
                for(int num : linha) {
                    System.out.println(num);
                }
            }
        }
    }