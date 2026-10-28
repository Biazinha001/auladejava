public class Time {
    String nome;
    String cidade;
    Jogador[] jogadores;
    EquipeTecnica equipe_tecnica;

    public Time(String nome, String cidade, Jogador[] jogadores, EquipeTecnica equipe_tecnica) {
        this.nome = nome;
        this.cidade = cidade;
        this.jogadores = jogadores;
        this.equipe_tecnica = equipe_tecnica;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores() {
        return this.jogadores;
    }

    public void setEquipeTecnica(EquipeTecnica equipe_tecnica) {
        this.equipe_tecnica = equipe_tecnica;
    }

    public EquipeTecnica getEquipeTecnica() {
        return this.equipe_tecnica;
    }
}
