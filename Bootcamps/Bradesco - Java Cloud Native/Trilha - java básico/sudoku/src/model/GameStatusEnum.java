package model;

public enum GameStatusEnum {
    COMPLETE("jogo ocmpleto"),
    INCOMPLETE("jogo não foi concluido"),
    NON_STARTED("jogo ainda não iniciado");
    

        private final String label;

        GameStatusEnum(String label) {
            this.label = label;
        }
    
        public String getLabel() {
            return label;
        }


}
