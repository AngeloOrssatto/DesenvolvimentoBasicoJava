package Heranca;

public class Quadrilatero extends FiguraGeometrica {

    private String nome;
    private Integer numLados = 4;

    public Quadrilatero(String nome){
        this.nome = nome;
    }

    @Override
    public Integer getNumLados() {
        return numLados;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
