package modelo;

public enum Tamanho {
    P(0.8),
    M(1.0),
    G(1.3);

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


