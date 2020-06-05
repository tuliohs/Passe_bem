package Package.Commons;

/**Retorna a descricao do Menu, e recupera o Id da opção do Menu.
* @author Thiago Soares, Tulio Henrique, Adair Lucas
* @version 1.05
* @Return String - Opcao Descricao
* @Return String - Id do Menu 
*/
public class MenuOpcoes {
    
    private int Id;
            private String OpcaoDescricao;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getOpcaoDescricao() {
        return OpcaoDescricao;
    }

    public void setOpcaoDescricao(String OpcaoDescricao) {
        this.OpcaoDescricao = OpcaoDescricao;
    }
            
       public void InserirOpcao(int Id, String OpcaoDescricao) {
        this.Id = Id;
        this.OpcaoDescricao = OpcaoDescricao;
    }

    public void ExcluirOpcao(int Id) {
        this.Id = Id;
    }

    public void EditarOpcao(int Id, String OpcaoDescricao) {
        if (!this.OpcaoDescricao.equals(OpcaoDescricao)) {
            this.OpcaoDescricao = OpcaoDescricao;
        }
    }
}
