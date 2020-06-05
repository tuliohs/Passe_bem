package Package.app;
/**Classe para objetos do tipo Funcionários, onde serão contidos, valores e 
* métodos para o mesmo.
* @author Thiago Soares, Tulio Henrique, Adair Lucas
* @version 1.05
*/
 
import Package.Commons.Dicas;
import java.util.Date;

public class DicasUsuario extends Dicas {
    private int UsuarioId;
    private int DicaId;
    private Date DataPostagem;
    private Dicas Dica;
 
 /** Método para herdar os métodos de Dicas
 * @return String - Id do usuário, Id Dica, Data da Publicação
 */
    
    public int getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(int UsuarioId) {
        this.UsuarioId = UsuarioId;
    }

    public int getDicaId() {
        return DicaId;
    }

    public void setDicaId(int DicaId) {
        this.DicaId = DicaId;
    }

    public Date getDataPostagem() {
        return DataPostagem;
    }

    public void setDataPostagem(Date DataPostagem) {
        this.DataPostagem = DataPostagem;
    }

    public void EnviarDica(int UsuarioId, int DicaId, Date DataPostagem, 
        String TextoDica) {
        this.UsuarioId = UsuarioId;
        this.DicaId = Dica.getId();
        this.DataPostagem = DataPostagem;
        Dica.setDicasDescricao(TextoDica);
    }

    public void ExcluirDica(int UsuarioId) {
        this.UsuarioId = UsuarioId;
    }
 
 /** Método para retorno da matrícula do funcionário
 * Compara TextoDica e DicasDescricao, se ok Dica recebe a Descricao
 * @param TextoDica
 */
    
    public void EditarDica(String TextoDica) {
        if (!TextoDica.equals(Dica.getDicasDescricao())) {
            Dica.setDicasDescricao(TextoDica);
            this.DataPostagem = DataPostagem;
        }
    }
}
