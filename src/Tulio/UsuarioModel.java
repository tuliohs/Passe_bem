package Tulio;
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
  
}