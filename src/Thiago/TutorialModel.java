package Thiago;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import Tulio.UsuarioModel;
import java.sql.Connection;
import java.sql.ResultSet;
/**
 *
 * @author Thiago
 */
public class TutorialModel {
    	private int Id;
	private String Descricao;
	private String Video;
	
	public int getId() {
	    return Id;
	}
	public void setId(int Id){
	    this.Id = Id;
	}
	public String  getDescricaod() {
	    return Descricao;
	}
	public void setDescricao(String Descricao){
	    this.Descricao = Descricao;
	}
	
	public String getVideo() {
	    return Video;
	}
	public void setVideo(String Video){
	    this.Video = Video;
	}
}

