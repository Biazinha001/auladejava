public class EquipeTecnica {
    String nome;
    Tecnico tecnico;
    Membro[] membros;

    public EquipeTecnica(String nome, Tecnico tecnico, Membro[] membros) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.membros = membros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Tecnico getTecnico() {
        return this.tecnico;
    }

    public void setMembros(Membro[] membros) {
        this.membros = membros;
    }

    public Membro[] getMembros() {
        return this.membros;
    }
}
