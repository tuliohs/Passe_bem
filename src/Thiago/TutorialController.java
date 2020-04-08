package Thiago;
import Tulio.UsuarioModel;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Thiago
 */
public class TutorialController {

    private String e;
    
    public void InsereComentario(TutorialModel model,UsuarioModel usuario) throws SQLException {
Connection con = null;
String urlconexao = "jdbc:localhost";
con = DriverManager.getConnection(urlconexao);
con.open();
DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
Date date = new Date(); 
        String data_registro = dateFormat.format(date); 

  try {
      Statement st = null;
    ResultSet rs = null;
        st = con.createStatement();
        PreparedStatement preparedStatement = con
            .prepareStatement("insert into TutarialComentario" + "( id_tutorial,Id_usuario, data_regsitro)" +
            "values(?,?,?)");
        preparedStatement.setInt(1, model.getId());
        preparedStatement.setString(2, usuario.getId());
        preparedStatement.setString(3, data_registro);
        preparedStatement.execute();
  } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "ERRO!\n" + e);
  }
con.close();
}         
    
public void InsereCurtida(TutorialModel model, UsuarioModel usuario) throws SQLException {
Connection con = null;
String urlconexao = "jdbc:localhost";
con = DriverManager.getConnection(urlconexao);
con.open();
DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
Date date = new Date(); 
        String data_registro = dateFormat.format(date); 

  try {
      Statement st = null;
    ResultSet rs = null;
        st = con.createStatement();
        PreparedStatement preparedStatement = con
            .prepareStatement("insert into TutarialCurtida" + "( id_tutorial,Id_usuario, data_regsitro)" +
            "values(?,?,?)");
        preparedStatement.setInt(1, model.getId());
        preparedStatement.setString(2, usuario.getId());
        preparedStatement.setString(3, data_registro);
        preparedStatement.execute();
  } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "ERRO!\n" + e);
  }
con.close();
}
    
    
}


