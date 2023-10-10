package aplication;

import static aplication.ConexaoDB.obtemConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//DAO = Data Acess Object
public class DAO {
    public boolean existe(Funcionario funcionario) throws Exception{ //throws Exception conta como os catchs
        String sql = "SELECT * FROM Funcionario WHERE nome = ? AND cpf = ? AND senha = ? AND cargo = ?"; //query = instrução sql. Ex: create table
        
        try(Connection conn = obtemConexao()){
            PreparedStatement ps = conn.prepareStatement(sql); //pega um texto e converte e um instrução sql
            ps.setString(1, funcionario.getNome()); //para substituir o place holder ou "?" de uma query
            ps.setString(2, funcionario.getCpf()); //2 signifca a posição do "?"
            ps.setString(3, funcionario.getSenha());
            ps.setInt(4, funcionario.getCargo());
            
            try(ResultSet rs = ps.executeQuery()){ //ResultSet representa o Result Grid do sql que mostra a tabela do SELECT
                return rs.next();
            }
        }
    }
    
    public boolean logar(Funcionario funcionario) throws Exception{
        String sql = "SELECT * FROM Funcionario WHERE cpf = ? AND senha = ?";
        
        try(Connection conn = ConexaoDB.obtemConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, funcionario.getCpf());
            ps.setString(2, funcionario.getSenha());
            
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
    
    public void inserir(Funcionario funcionario) throws Exception{
        String sql = "INSERT INTO Funcionario (nome, cpf, senha, cargo) VALUES (?,?,?,?)";
        
        try (Connection conn = obtemConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCpf());
            ps.setString(3, funcionario.getSenha());
            ps.setInt(4, funcionario.getCargo());
            
            ps.execute();
        }
                
    }
    
    public void registrar(Atendimento atendimento) throws Exception{
        String sql = "UPDATE Atendimento SET Especialidade_idEspecialidade = ?, Paciente_cpf = ?, tipo = ?, nr_atendimento = ?, pressao_art = ?, temperatura = ?, sintomas = ?, frequencia_card = ?, status_aten = ? WHERE idAtendimento = ?";
        
        try(Connection conn = obtemConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, atendimento.getEspecialidade_idEspecialidade());
            ps.setString(2, atendimento.getPaciente_cpf());
            ps.setInt(3, atendimento.getTipo());
            ps.setInt(4, atendimento.getNr_atendimento());
            ps.setFloat(5, atendimento.getPressao_art());
            ps.setFloat(6, atendimento.getTemperatura());
            ps.setString(7, atendimento.getSintomas());
            ps.setFloat(8, atendimento.getFrequencia_card());
            ps.setInt(9, atendimento.getStatus_aten());
            ps.setInt(10, atendimento.getIdAtendimento());
            ps.execute();
        }
    }
    
    public void especialidade(Especialidade especialidade) throws Exception{
        String sql = "UPDATE Especialidade SET nome = ?";
        
        try(Connection conn = obtemConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, especialidade.getNome());
            ps.execute();
        }
    }
    
    public void atualizar(Funcionario funcionario) throws Exception{
        String sql = "UPDATE Funcionario SET senha = ? WHERE cpf = ?";
        
        try(Connection conn = obtemConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, funcionario.getSenha());
            ps.setString(2, funcionario.getCpf());
            ps.execute();
        }
    }
    
    public void alterar(Paciente paciente) throws Exception{
        String sql = "UPDATE Paciente SET nome = ?, data_nasc = ?, nr_SUS = ?, genero = ?  WHERE cpf = ?";
        
        try(Connection conn = obtemConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getData_nasc());
            ps.setInt(3, paciente.getNr_SUS());
            ps.setString(4, paciente.getGenero());
            ps.setString(5, paciente.getCpf());
            ps.execute();
        }
    }

    
}
