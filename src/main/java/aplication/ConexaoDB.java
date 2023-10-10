package aplication;

import java.sql.Connection;
import java.sql.DriverManager; //permite utilizar metodos entre o driver de conexao do netbeans e do mysql
import static java.sql.DriverManager.getConnection;
import java.sql.SQLException;

//Essa classe é para fazer a conexao com o MySQL
public class ConexaoDB {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "bd_ubs"; //Nome do banco de dados que será acessado
    private static String usuario = "root"; //Usuário de conexão com o MySQL Workbench
    private static String senha = "pedro10"; //Senha de conexão com o MySQL Workbench
    
    public static Connection obtemConexao(){
        try{
            //"jdbc:mysql://localhost:3306/db_usuario?useTimezone=true&serverTimezone=UTC"
            Connection c = getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC", usuario, senha);
            return c;
        }catch(SQLException e){
            return null;
        }
    
    }
    
}
