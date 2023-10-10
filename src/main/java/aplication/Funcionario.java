package aplication;


public class Funcionario {
    private String nome;
    private String cpf;
    private String senha;
    private int cargo;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public Funcionario (String nome, String cpf, String senha, int cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.cargo = cargo;
    }

    public Funcionario(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }
   
    
}
