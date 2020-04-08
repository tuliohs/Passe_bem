package Lucas;

/**
 *
 * @author Lucas
 */
public class Tipos
{  
    public enum tipos
    { 
        CAMISA("Camisa"),
        CALCA("Calça"),
        SOCIAIS("Sociais");
 
        private String descricao;

        tipos(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }      
    
}
