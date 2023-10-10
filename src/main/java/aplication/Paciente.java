package aplication;


public class Paciente {
    private String cpf;
    private String nome;
    private String email;
    private String data_nasc;
    private int celular;
    private String endereço;
    private String cidade;
    private String cep;
    private int nr_SUS;
    private String genero;

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public int getCelular() {
        return celular;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public int getNr_SUS() {
        return nr_SUS;
    }

    public String getGenero() {
        return genero;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setNr_SUS(int nr_SUS) {
        this.nr_SUS = nr_SUS;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Paciente(String cpf, String nome, String email, String data_nasc, int celular, int nr_SUS, String genero) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.data_nasc = data_nasc;
        this.celular = celular;
        this.nr_SUS = nr_SUS;
        this.genero = genero;
    }

    public Paciente(String cpf, String nome, String data_nasc, int nr_SUS, String genero) {
        this.cpf = cpf;
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.nr_SUS = nr_SUS;
        this.genero = genero;
    }
    
    
}
