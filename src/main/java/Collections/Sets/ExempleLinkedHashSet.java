package Collections.Sets;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class ExempleLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(6);
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(-7);
        sequenciaNumerica.add(0);

        System.out.println(sequenciaNumerica);

        System.out.println(sequenciaNumerica.size());

        sequenciaNumerica.remove(-7);

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        sequenciaNumerica.clear();
        System.out.println(sequenciaNumerica.isEmpty());

    }

}
