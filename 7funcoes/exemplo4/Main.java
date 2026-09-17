
public class Main {

    static void contador(int n){
        if ( n > 0) {
           System.out.println(n + " ");
           contador(n - 1);
        }
    }

    public static void main(String[] args){
        contador(5);
    }
    
}








