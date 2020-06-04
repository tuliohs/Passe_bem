/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.app;

import Package.Commons.Dicas;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tulio
 */
public class DicasUsuario extends Dicas {

    private int UsuarioId;
    private int DicaId;
    private Date DataPostagem;
    private Dicas Dica;

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

    public void EnviarDica(int UsuarioId, int DicaId, Date DataPostagem, String TextoDica) {
        this.UsuarioId = UsuarioId;
        this.DicaId = Dica.getId();
        this.DataPostagem = DataPostagem;
        Dica.setDicasDescricao(TextoDica);
    }

    public void ExcluirDica(int UsuarioId) {
        this.UsuarioId = UsuarioId;
    }

    public void EditarDica(String TextoDica) {
        if (!TextoDica.equals(Dica.getDicasDescricao())) {
            Dica.setDicasDescricao(TextoDica);
            this.DataPostagem = DataPostagem;
        }
    }
}
