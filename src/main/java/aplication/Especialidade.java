package aplication;

public class Especialidade {
    private int idEspecialidade;
    private int nome;

    
    public Especialidade(int idEspecialidade, int nome) {
        this.idEspecialidade = idEspecialidade;
        this.nome = nome;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }
    
    
}
