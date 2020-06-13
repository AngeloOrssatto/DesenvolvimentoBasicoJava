package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class ExempleList {

    public static void main(String[] args) {

        List<String> Chamada = new ArrayList<>();

        Chamada.add("Angelo");
        Chamada.add("Carlos");
        Chamada.add("Maria");
        Chamada.add("Joao");

        System.out.println(Chamada);

        Chamada.set(1, "Wesley");
        Collections.sort(Chamada);
        System.out.println(Chamada);

        Iterator<String> iterator =  Chamada.iterator();

        for(String nomeDoItem: Chamada){
            System.out.println("Aluno: " + nomeDoItem);
        }

        while(iterator.hasNext()){
            System.out.println("Repetindo... " + iterator.next() + "?");
        }

    }

}
