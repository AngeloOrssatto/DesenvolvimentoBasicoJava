package Heranca;

public abstract class FiguraGeometrica {

    private String nome;
    private Integer numLados;

    public FiguraGeometrica(){};

    public String getNome(){
        return nome;
    }

    public Integer getNumLados(){
        return numLados;
    }
}
