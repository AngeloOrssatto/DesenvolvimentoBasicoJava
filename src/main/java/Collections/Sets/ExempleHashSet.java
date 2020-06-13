package Collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class ExempleHashSet {

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(9.4);
        notasAlunos.add(6.3);
        notasAlunos.add(10.0);
        System.out.println(notasAlunos);

        System.out.println(notasAlunos.size());

        notasAlunos.add(5.5);
        System.out.println(notasAlunos);

        System.out.println(notasAlunos.isEmpty());

        notasAlunos.remove(6.3);

        for (Double nota: notasAlunos){
            System.out.println(nota);
        }

        notasAlunos.clear();
        System.out.println(notasAlunos.isEmpty());

        System.out.println(notasAlunos.size());

    }

}
