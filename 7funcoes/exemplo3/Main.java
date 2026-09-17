
public class Main {

    static boolean ligarInterruptor(){
        if (passareletricidade() == true) {
            if (acenderlampada() == true) {
                System.out.println("Lâmpada acendeu!");
                return true;
            } else {
                System.out.println("Lâmpada queimou!");
                return false;
            }
        } else {
            System.out.println("Problema no circuito");
            return false;
        }
    }

    static boolean passareletricidade(){
        return true;
    }

    static boolean acenderlampada(){
    return true;
    }

    public static void main(String[] args){
        if (ligarInterruptor() == true) {
            System.out.println("Processo Funcionou!");
        } else {
            System.out.println("Processo Falhou!");
        }
    }
    
}
