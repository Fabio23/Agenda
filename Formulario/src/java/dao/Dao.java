package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Fabio.ribeiro
 */
public class Dao {

    // INSERIR CLIENTE
    public void inserir(String[] dados) throws RuntimeException, SQLException, ClassNotFoundException {
    String sql = "INSERT INTO TABELA_DADOS ("
            + "nome, "
            + "email, "
            + "dataNasc, "
            + "telefone, "
            + "celular, "
            + "rua, "
            + "numero, "
            + "complemento, "
            + "bairro, "
            + "cep "
            + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    Connection connection = Conexao.getConexao();
    
    PreparedStatement stmt = connection.prepareStatement(sql);

    try {
        //Seta valores para inserção
        stmt.setString(1, dados[0]);
        stmt.setString(2, dados[1]);
        stmt.setString(3, dados[2]);
        stmt.setString(4, dados[3]);
        stmt.setString(5, dados[4]);
        stmt.setString(6, dados[5]);
        stmt.setString(7, dados[6]);
        stmt.setString(8, dados[7]);
        stmt.setString(9, dados[8]);
        stmt.setString(10, dados[9]);

        //Executa SQL Statement
        stmt.execute();

    } catch (SQLException e) {
        //Fecha stmt
        stmt.close();
        // Fecha a conexao
        connection.close();
        throw new RuntimeException(e);
    } finally {
        //Fecha stmt
        stmt.close();
        // Fecha a conexao
        connection.close();
    }
}
}
