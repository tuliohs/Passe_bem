package passe_bem;

import Package.app.Tutorial;
import Package.app.Usuario;

public class PasseBem {

    public static void main(String[] args) throws Exception {

        String login = "Joao";
        String senha = "sfgg654sdfg";
        String email = "Joao@gmail.com";
        String genero = "Masculino";
        int idade = 25;

        Usuario user = new Usuario();

        user.CadastrarUsuario(login, senha, email, genero, idade);

        boolean acessar = Usuario.Login(login, senha);
        System.out.println("Status de acesso = " + acessar);

        System.out.println("Metodo toString " + user.toString());

        user.EditarUsuario("Antonio", "asdf678", email, genero, 12);

        System.out.println("Usuario apos edição " + user.toString());

        byte video = (byte) 544787;
        int idVideo = 2;
        Tutorial.InsereComentario(idVideo, "aqui sera digitado o comentario", video);
        Tutorial.InsereCurtida(idVideo);
    }
}
