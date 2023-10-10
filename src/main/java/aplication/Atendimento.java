package aplication;

public class Atendimento {
    private int idAtendimento;
    private int Especialidade_idEspecialidade;
    private String paciente_cpf;
    private String data_atendimento;
    private int tipo;
    private int nr_atendimento;
    private float pressao_art;
    private float temperatura;
    private String sintomas;
    private float frequencia_card;
    private int status_aten;
    
    
    public Atendimento(int idAtendimento,int Especialidade_idEspecialidade, String paciente_cpf, int tipo, float pressao_art, float temperatura, String sintomas, float frequencia_card, int status_aten) {
        this.idAtendimento = idAtendimento;
        this.Especialidade_idEspecialidade = Especialidade_idEspecialidade;
        this.paciente_cpf = paciente_cpf;
        this.tipo = tipo;
        this.pressao_art = pressao_art;
        this.temperatura = temperatura;
        this.sintomas = sintomas;
        this.frequencia_card = frequencia_card;
        this.status_aten = status_aten;
    }
    
    
    public Atendimento(int Especialidade_idEspecialidade, String paciente_cpf, String data_atendimento, int tipo, int nr_atendimento, float pressao_art, float temperatura, String sintomas, float frequencia_card, int status_aten) {
        this.Especialidade_idEspecialidade = Especialidade_idEspecialidade;
        this.paciente_cpf = paciente_cpf;
        this.data_atendimento = data_atendimento;
        this.tipo = tipo;
        this.nr_atendimento = nr_atendimento;
        this.pressao_art = pressao_art;
        this.temperatura = temperatura;
        this.sintomas = sintomas;
        this.frequencia_card = frequencia_card;
        this.status_aten = status_aten;
    }

    public int getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(int idAtendimento) {
        this.idAtendimento = idAtendimento;
    }
    
    public int getEspecialidade_idEspecialidade() {
        return Especialidade_idEspecialidade;
    }

    public String getPaciente_cpf() {
        return paciente_cpf;
    }

    public String getData_atendimento() {
        return data_atendimento;
    }

    public int getNr_atendimento() {
        return nr_atendimento;
    }

    public void setEspecialidade_idEspecialidade(int especialidade_idEspecialidade) {
        this.Especialidade_idEspecialidade = especialidade_idEspecialidade;
    }

    public void setPaciente_cpf(String paciente_cpf) {
        this.paciente_cpf = paciente_cpf;
    }

    public void setData_atendimento(String data_atendimento) {
        this.data_atendimento = data_atendimento;
    }

    public void setNr_atendimento(int nr_atendimento) {
        this.nr_atendimento = nr_atendimento;
    }
    
    public int getTipo() {
        return tipo;
    }

    public float getPressao_art() {
        return pressao_art;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public String getSintomas() {
        return sintomas;
    }

    public float getFrequencia_card() {
        return frequencia_card;
    }

    public int getStatus_aten() {
        return status_aten;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setPressao_art(float pressao_art) {
        this.pressao_art = pressao_art;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public void setFrequencia_card(float frequencia_card) {
        this.frequencia_card = frequencia_card;
    }

    public void setStatus_aten(int status_aten) {
        this.status_aten = status_aten;
    }
    
    
}
