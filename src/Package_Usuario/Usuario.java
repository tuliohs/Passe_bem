package Package_Usuario;

public class Usuario {
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

  private String login;
  private String senha;
  private String email;
  private String genero;
  private int idade;
    
public static void CadastrarUsuario(String login ,String  senha, String email,String  genero, int idade) {

}

private static boolean Login(String login ,String  senha)  {
    boolean result = false;
    if (result) {
        return true;
    }   
    return false;   
}

public static void EditarUsuario(String login ,String  senha, String email,String  genero, int idade) throws Exception {

}  
}
