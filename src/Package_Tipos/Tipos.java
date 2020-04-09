package Package_Tipos;

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
    

