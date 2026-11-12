
import java.util.List;
import java.util.ArrayList;
public class Main {
    private static List<Professor> professor = new ArrayList<>();
    private static List<Aluno> aluno = new ArrayList<>();
    
    public static void main(String[] args) {
        professor.add(new Professor("Joaquim"));
        professor.add(new Professor("Jubileu"));
        professor.add(new Professor("Fancisco"));

        aluno.add(new Aluno("Cunha"));
        aluno.add(new Aluno("Cavalo Horse"));


        for(Professor prof : professor){
           System.out.println("Nome:"+ prof.getNome());
      }

      for(Aluno al : aluno){
        System.out.println("Nome do Aluno:" + al.getNome());
      }
    }
}
