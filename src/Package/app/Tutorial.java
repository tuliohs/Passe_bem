package Package.app;
/**
* Menu recebe os métodos herdado da classe OpçõesMenu e declara os métodos para
* autorização de acordo com a Opção escolhida pelo usuário que está logado no
* sistema.
* @author Thiago Soares, Tulio Henrique, Adair Lucas
* @version 1.05
*/

public class Tutorial extends Usuario {

    /**Herda Usuário, insere ID, descricao, opcoes de video, insere comentario e 
 * opcoes de curtidas.
     * @return 
 */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte getVideo() {
        return Video;
    }

    public void setVideo(byte Video) {
        this.Video = Video;
    }
    	private int id;
	private String descricao;
	private byte Video;        
        
   public static void InsereComentario(int id, String descricao, byte Video )  {
   }
   
    public static void InsereCurtida(int id)  {
   }
}        