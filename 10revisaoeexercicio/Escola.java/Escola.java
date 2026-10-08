//ESCOLA
public class Escola {

    Aluno[] alunos;
    Professor[] professores;

    public Escola(Aluno[] alunos, Professor[] professores) {
        this.alunos = alunos;
        this.professores = professores;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public Professor[] getProfessores() {
        return this.professores;
    }

    public static void main(String[] args) {

        // Criando alunos
        Aluno aluno1 = new Aluno(
            "João",
            "joao@email.com",
            true,
            8,
            true
        );

        Aluno aluno2 = new Aluno(
            "Maria",
            "maria@email.com",
            true,
            5,
            false
        );

        // Criando professores
        Professor professor1 = new Professor(
            "Carlos",
            3,
            "Feliz",
            "Baixa",
            true,
            "Prestem atenção!"
        );

        Professor professor2 = new Professor(
            "Ana",
            2,
            "Brava",
            "Alta",
            false,
            "Vamos começar!"
        );

        // Arrays de alunos
        Aluno[] alunos = { aluno1, aluno2 };

        // Arrays de professores
        Professor[] professores = { professor1, professor2 };

        // Criando a escola
        Escola escola = new Escola(alunos, professores);

        // Exibindo os alunos
        System.out.println("ALUNOS:");

        for (Aluno aluno : escola.getAlunos()) {
            System.out.println("Nome: " + aluno.getNome());
        }

        // Exibindo os professores
        System.out.println("\nPROFESSORES:");

        for (Professor professor : escola.getProfessores()) {
            System.out.println("Nome: " + professor.getNome());
        }
    }
}