package Heranca;

public class Programa {

    public static void main(String[] args){

        String nome = "Quadrado";
        Integer lados = 4;

        Quadrilatero figura = new Quadrilatero(nome);

        System.out.println("Eh um " + figura.getNome() + " com " + figura.getNumLados() + " lados!");
    }
}
