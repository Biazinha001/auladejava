package ex6arraymultidimensional.expratico21;

//Salários
public class Main {
    public static void main(String[] args) {

        double[] salarios = {
            1800,
            2500,
            3200,
            4500,
            7000
        };

        for (double salario : salarios) {
            double salarioComAumento = salario * 0.10 + salario;
            System.out.println(salarioComAumento);
        }
    }
}

