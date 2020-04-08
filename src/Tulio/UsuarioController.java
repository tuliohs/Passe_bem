package Tulio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author tulio
 */
public class UsuarioController {
    
    public void CadastrarUsuario(UsuarioModel usuario) throws SQLException {
Connection con = null;
String url = "string de conexao com banco";
con = DriverManager.getConnection(url);
          
  try {
      Statement st = null;
    ResultSet rs = null;
        st = con.createStatement();
        PreparedStatement preparedStatement = con
            .prepareStatement("insert into usuario "+
            "( Login,Senha,Email,Genero,Idade)" +
            "values(?,?,?,?,?)");
        preparedStatement.setString(1, usuario.getLogin());
        preparedStatement.setString(2, usuario.getSenha());
        preparedStatement.setString(3, usuario.getEmail());
        preparedStatement.setString(4, usuario.getGenero());
        preparedStatement.setInt(5, usuario.getIdade());
        preparedStatement.execute();
  } catch (SQLException ex) {
    String e = null;
      JOptionPane.showMessageDialog(null, "ERRO!\n" + e);
  }
con.close();
}


private static boolean PesquisarUsuario(UsuarioModel usuario) throws SQLException {
    
Connection con = null;
String url = "string de conexao com banco";
con = DriverManager.getConnection(url);
    String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
    
    try {
      Statement st = null;
    ResultSet rs = null;
        st = con.createStatement();
        PreparedStatement preparedStatement = con
            .prepareStatement(sql);             
        preparedStatement.setString(1, usuario.getLogin());
        preparedStatement.setString(2, usuario.getSenha());        
        preparedStatement.execute();
        return true;
  } catch (SQLException ex) {
    String e = null;
      JOptionPane.showMessageDialog(null, "ERRO!\n" + e);
  }
    con.close();
    return false;
}


public static boolean EditarUsuario(UsuarioModel usuario) throws SQLException {
    try{
        Connection con = null;
        String url = "string de conexao com banco";
        con = DriverManager.getConnection(url);
        String sql = "UPDATE clientes SET Login = ?,Senha = ?,Email = ?,Genero = ?,Idade = ? WHERE Id = ?";
        PreparedStatement preparedStatement = con
            .prepareStatement(sql);        
        preparedStatement.setString(1, usuario.getLogin());
        preparedStatement.setString(2, usuario.getSenha());
        preparedStatement.setString(3, usuario.getEmail());
        preparedStatement.setString(4, usuario.getGenero());
        preparedStatement.setInt(5, usuario.getIdade());
        preparedStatement.executeUpdate();
        con.close();
        return true;
  } catch (SQLException ex) {
    String e = null;
      JOptionPane.showMessageDialog(null, "ERRO!\n" + e);
  }    
    return false;
}
    
    
}
