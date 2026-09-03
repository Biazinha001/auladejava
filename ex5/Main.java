package ex5;

public class Main {
    public static void main (String[] args) {
            String[] alunos = {"Miranata", "Savalo", "Aeronauta"};

            alunos[0] = "Mariazinha";
            System.out.println("Qtde de Alunos; " + alunos.length);
    
            for (String estudante : alunos){
                System.out.println(estudante);
            }

            //Crie uma lista com 5 produtos
            //exiba cada produto utilizando foreach
            //e também for
            
                    String[] produtos = {
                        "Shampoo",
                        "Condicionador",
                        "Mascara de hidratacao",
                        "Creme de pentear",
                        "oleo capilar"
                    };
            
                    System.out.println("Com foreach:");                    
                    for (String produto : produtos) {
                        System.out.println(produto);
                    }
            
                    System.out.println("\nCom for:");
            
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println(produtos[i]);
                    }
                }
            }
            
            
        
    