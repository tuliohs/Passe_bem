package Package.app;

import java.util.Objects;

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

    public void CadastrarUsuario(String login, String senha, String email, String genero, int idade) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.genero = genero;
        this.idade = idade;
    }

    private String login;
    private String senha;
    private String email;
    private String genero;
    private int idade;

    private static boolean Login(String login, String senha) {
        boolean result = false;
        if (result) {
            return true;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + ", senha=" + senha + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        return Objects.equals(this.senha, other.senha);
    }

    public void EditarUsuario(String login, String senha, String email, String genero, int idade) throws Exception {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.genero = genero;
        this.idade = idade;
    }
}
