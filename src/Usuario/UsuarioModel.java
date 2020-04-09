package Usuario;

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
public class UsuarioModel {

  private String Login;
  private String Senha;
  private String Email;
  private String Genero;
  private int Idade;
  private int Id;

  public String getLogin() {
    return Login;
  }

  public void setLogin(String login) {
    this.Login = login;
  }

  public String getSenha() {
    return Senha;
  }

  public void setSenha(String senha) {
    this.Senha = senha;
  }
  
    public String getEmail() {
    return Email;
  }

  public void setEmail(String Email) {
    this.Email = Email;
  }

  public String getGenero() {
    return Genero;
  }

  public void setGenero(String Genero) {
    this.Genero = Genero;
  }
  
   public int getIdade() {
    return Idade;
  }

  public void setIdade(int Idade) {
    this.Idade = Idade;
  }
  
    public int getId() {
    return Id;
  }

  public void setId(int Id) {
    this.Id = Id;
  }
   
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
