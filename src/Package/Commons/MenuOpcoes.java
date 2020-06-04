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
