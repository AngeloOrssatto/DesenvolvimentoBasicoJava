package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ExerciseList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(); //instancia a primeira lista

        //adicionando elementos a lista
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("Joao");

        //navegando pela lista
        for(String nomeDoItem: nomes){
            System.out.println(nomeDoItem);
        }

        nomes.set(2, "Roberto");//substituindo carlos por roberto

        String nomePos1 = nomes.get(0);
        System.out.println(nomePos1);

        nomes.remove(3);
        nomes.remove("Joao");

        int qtde = nomes.size();
        System.out.println(qtde);

        System.out.println(nomes.contains("Juliano"));

        List<String> outrosNomes = new ArrayList<>();

        outrosNomes.add("Ismael");
        outrosNomes.add("Rodrigo");
        nomes.addAll(outrosNomes);

        Collections.sort(nomes);

        if(nomes.isEmpty()){
            System.out.println("Lista esta vazia");
        } else {
            System.out.println(nomes);
        }

    }

}
