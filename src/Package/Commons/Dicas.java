/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.Commons;

/**
 *
 * @author tulio
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
