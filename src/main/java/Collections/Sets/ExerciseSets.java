package Collections.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExerciseSets {

    public static void main(String[] args) {

        TreeSet<String> treeCidades = new TreeSet<>();

        treeCidades.add("Porto Alegre");
        treeCidades.add("Florianopolis");
        treeCidades.add("Curitiba");
        treeCidades.add("Sao Paulo");
        treeCidades.add("Rio de Janeiro");

        System.out.println(treeCidades);

        exercicioHashSet();
        exercicioLinkedHashSet();
        exercicioTreeSet();

    }

    private static void exercicioTreeSet() {

        TreeSet<Integer> treeInteiros = new TreeSet<>();

        System.out.println("Criando com TreeSet!");

        treeInteiros.add(3);
        treeInteiros.add(88);
        treeInteiros.add(20);
        treeInteiros.add(44);
        treeInteiros.add(3);

        for (Integer numItem: treeInteiros){
            System.out.println(numItem);
        }

        treeInteiros.pollFirst();
        System.out.println(treeInteiros);

        treeInteiros.add(23);
        System.out.println(treeInteiros);

        System.out.println(treeInteiros.size());
        System.out.println(treeInteiros.isEmpty());
    }

    private static void exercicioLinkedHashSet() {

        LinkedHashSet<Integer> linkedInteiros = new LinkedHashSet<>();

        System.out.println("Criando com LinkedHashSet!");

        linkedInteiros.add(3);
        linkedInteiros.add(88);
        linkedInteiros.add(20);
        linkedInteiros.add(44);
        linkedInteiros.add(3);


        for (Integer numItem: linkedInteiros){
            System.out.println(numItem);
        }

        linkedInteiros.remove(3);
        System.out.println(linkedInteiros);

        linkedInteiros.add(23);
        System.out.println(linkedInteiros);
        System.out.println(linkedInteiros.size());
        System.out.println(linkedInteiros.isEmpty());


    }

    public static void exercicioHashSet(){

        HashSet<Integer> hashInteiros = new HashSet<>();

        System.out.println("Criando com HashSet!");

        hashInteiros.add(3);
        hashInteiros.add(88);
        hashInteiros.add(20);
        hashInteiros.add(44);
        hashInteiros.add(3);

        int i = 0;
        int first = 0;

        for (Integer numItem: hashInteiros){
            System.out.println(numItem);
            if (i == 0){
                first = numItem;
                i++;
            }
        }

        hashInteiros.remove(first);
        System.out.println(hashInteiros);

        hashInteiros.add(23);
        System.out.println(hashInteiros);
        System.out.println(hashInteiros.size());
        System.out.println(hashInteiros.isEmpty());

    }

}
