public enum DiasDaSemana {
    
    DOMINGO("Domingo", false),
    SEGUNDA("Segunda-Feira", true),
    TERCA("Terça-Feira", true),
    QUARTA("Quarta-Feira", true),
    QUINTA("Quinta-Feira", true),
    SEXTA("Sexta-Feira", true),
    SABADO("Sábado", false);


    private String nome;
    private boolean util;
    
    private DiasDaSemana(String nome, boolean util) {
        this.nome = nome;
        this.util = util;
    }


    public boolean isUtil() {
        return util;
    }

    
   

    @Override
    public String toString() {
        return nome;
    }
}
