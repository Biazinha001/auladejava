package ex6arraymultidimensional.expratico18;

//18 - Procurar um nome

public class Main {
    public static void main(String[] args) {

        String[] nomes = {
            "Letsgo Daqui Silva",
            "César Teio",
            "Bispo de Paris",
            "Antônio Morrendo das Dores",
            "Rolando Escada Abaixo Santos",
            "Amazonas Rio do Brasil Pimpão",
            "Amin Amou Amado Pinto",
            "Amado Amoroso",
            "Inocêncio Coitadinho",
            "Maria Privada de Jesus",
            "Zélia Tocafundo Pinto"
        };

        for (String nome : nomes) {
            if (nome.equals("Bispo de Paris")) {
                System.out.println("Nome encontrado!");
            }
        }
    }
}
