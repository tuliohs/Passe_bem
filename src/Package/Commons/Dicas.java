package Package.Commons;

/**
* Classe Dicas, contrução dos métodos e retornos para Descricao, Id.
* @author Thiago Soares, Tulio, Adair Lucas
* @version 1.05
*/

public class Dicas {

    private int Id;
    private String DicasDescricao;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDicasDescricao() {
        return DicasDescricao;
    }

    public void setDicasDescricao(String DicasDescricao) {
        this.DicasDescricao = DicasDescricao;
    }

    public void InserirDicas(int Id, String DicasDescricao) {
        this.Id = Id;
        this.DicasDescricao = DicasDescricao;

    }

    public void ExcluirDicas(int Id) {
        this.Id = Id;
    }

    public void EditarDica(int Id, String DicasDescricao) {
        
        if (!this.DicasDescricao.equals(DicasDescricao) ) {
            this.DicasDescricao = DicasDescricao;
        }
    }

}
