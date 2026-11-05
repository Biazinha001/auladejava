package modificadoresdeacesso.exercicio;

public class Main {
    
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        Aluno aluno1 = new Aluno();
        Diretor diretor1 = new Diretor();

        professor1.nome = "Francisco";
        aluno1.nome = "Joaquim";
        diretor1.nome = "Bartolomeu";

        professor1.profissao();
        aluno1.profissao();
        diretor1.profissao();
    }
    
}
