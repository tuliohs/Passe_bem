package Lucas;

/**
 *
 * @author Lucas
 */
 
    public enum Tipos
    { 
        CAMISA("Camisa Social"),
        TERNO("Blazer"),
        CALCA("Calça jeans"),
        SOCIAIS("Sociais");
 
        private final String descricao;

        Tipos(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }      
    

