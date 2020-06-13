package Collections.Sets;

import java.util.TreeSet;

public class ExempleTreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> treeNumbers = new TreeSet<>();

        treeNumbers.add(5);
        treeNumbers.add(9);
        treeNumbers.add(0);
        treeNumbers.add(-6);
        treeNumbers.add(15);

        System.out.println(treeNumbers);

        System.out.println("Primeiro elemento: " + treeNumbers.first());
        System.out.println("Ultimo elemento: " + treeNumbers.last());
        System.out.println("Elemento abaixo do 5: " + treeNumbers.lower(5));
        System.out.println("Elemento acima do 5: " + treeNumbers.higher(5));

        System.out.println("Removendo o primeiro item: " + treeNumbers.pollFirst());
        System.out.println("Removendo o ultimo item: " + treeNumbers.pollLast());

        System.out.println(treeNumbers);

    }

}
