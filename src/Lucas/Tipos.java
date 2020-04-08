package Lucas;

/**
 *
 * @author Lucas
 */
 
    public enum Tipos
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
    

