
public class Main {

    public static void verificarSituacao(String nome, double nota) {
        if (nota >= 7) {
            System.out.println(nome + " está APROVADO.");
        } else {
            System.out.println(nome + " está REPROVADO.");
        }
    }

    public static void main(String[] args) {
      verificarSituacao("Vaquinha", 9);
    }
}

