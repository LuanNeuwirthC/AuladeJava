public enum Planetas {
    MERCURIO("Mercúrio",2439.7, 3.30),
    VENUS("Vênus",6051.8, 48.6),
    TERRA("Terra",6371.0, 59.7),
    MARTE("Marte",3389.5, 6.41),
    JUPITER("Jupiter",69911.0, 18981.9),
    SATURNO("Saturno",58232.0, 5683.1),
    URANO("Urano",25362.0, 868.1),
    NETUNO("Netuno",24622.0, 1024.1);

    public String nome;
    public double raio;
    public double massa;

    
     Planetas(String nome, double raio, double massa) {
        this.nome = nome;
        this.raio = raio;
        this.massa = massa;
    }


    public String getNome() {
        return nome;
    }


    public double getRaio() {
        return raio;
    }


    public double getMassa() {
        return massa;
    }

  



    
}
