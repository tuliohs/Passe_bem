package Package.app;
/**
* @author Thiago Soares, Tulio, Adair Lucas
* @version 1.05
*/
public class Messagem extends Usuario {
/**Método que Herda Usuário para envio de mensagens
 * @return String - Descricao da Mensagem
 * @return String - Codigo do Remetente
 * @return String - Codigo do Destinatario
 */
    
     	private int CodigoMensagem;
	private String DescricaoMensagem; 
        private String CodigoRemetente;
        private String CodigoDestinatario;
        

    public int getCodigoMensagem() {
        return CodigoMensagem;
    }

    public String getDescricaoMensagem() {
        return DescricaoMensagem;
    }

    public String getCodigoRemetente() {
        return CodigoRemetente;
    }

    public String getCodigoDestinatario() {
        return CodigoDestinatario;
    }

    public void setCodigoMensagem(int CodigoMensagem) {
        this.CodigoMensagem = CodigoMensagem;
    }

    public void setDescricaoMensagem(String DescricaoMensagem) {
        this.DescricaoMensagem = DescricaoMensagem;
    }

    public void setCodigoRemetente(String CodigoRemetente) {
        this.CodigoRemetente = CodigoRemetente;
    }

    public void setCodigoDestinatario(String CodigoDestinatario) {
        this.CodigoDestinatario = CodigoDestinatario;
    }

    
   public static void EnviarMensagem(int CodigoMensagem, String DescricaoMensagem, String CodigoRemetente, String CodigoDestinatario )  {
       Usuario user = new Usuario();
       CodigoRemetente =user.getLogin();
   }
   
   public static void ReceberMensagem(int CodigoMensagem, String DescricaoMensagem, String CodigoRemetente, String CodigoDestinatario )  {
       Usuario user = new Usuario();
       CodigoDestinatario =user.getLogin();
   }
   
  
}        