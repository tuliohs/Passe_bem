package Package.app;
/**Enum para escolha dos tipos de camisa
* @author Thiago Soares, Tulio, Adair Lucas
* @version 1.05
*/
    public enum Tipos{ 
        CAMISA("Camisa Social"),
        TERNO("Camisa Social"),
        CALCA("Calça"),
        SOCIAIS("Calça jeans");
 
        private final String descricao;

        Tipos(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }      
    

