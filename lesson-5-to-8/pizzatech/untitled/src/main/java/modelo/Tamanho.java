package modelo;

public enum Tamanho {
    P(1.1),
    M(1.5),
    G(2.0);

    private final double fator;

    Tamanho(double fator) {
        this.fator = fator;
    }

    public double getFator() {
        return fator;
    }

    public static Tamanho deLetra(String letra){
        for(Tamanho t : Tamanho.values()){
            if(t.name().equalsIgnoreCase(letra)){
                return t;
            }
        }
        throw new IllegalArgumentException(letra + " Nao coresponde a um tamanho de pizza");
    }

}


