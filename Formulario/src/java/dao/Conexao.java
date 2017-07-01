package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.derby.jdbc.ClientDriver;

/**
 *
 * @author Fabio.ribeiro
 */
/**
 * Obtém um objeto de conexão do banco de dados.
 * Pode ser utilizado para abertura e fechamento de conexões com o banco
 * 
 */
public class Conexao {
    /**
     * Obtém uma conexão do banco de dados
     * 
     * @return
     * @throws ClassNotFoundException 
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public static Connection getConexao() throws ClassNotFoundException {
        Connection conexao = null;
        
        try {
            DriverManager.registerDriver(new ClientDriver());
            
            // Endereço de conexão com o banco de dados
            String dbURL = Constantes.DB_ADDRESS;
            
            // Propriedades para armazenamento de usuário e senha
            Properties properties = new Properties();
            properties.put("user", Constantes.DB_USER);
            properties.put("password", Constantes.DB_PASS);
            
            // Realiza a conexão com o banco
            conexao = DriverManager.getConnection(dbURL, properties);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //Retorna a conexão
        return conexao;
    }
}