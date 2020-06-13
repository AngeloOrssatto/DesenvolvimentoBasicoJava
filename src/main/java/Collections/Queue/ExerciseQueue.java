package Collections.Queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExerciseQueue {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("Joao");

        Iterator<String> iterator = fila.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(fila.peek());

        System.out.println(fila.poll());

        fila.add("Daniel");
        System.out.println(fila);

        System.out.println(fila.size());

        System.out.println("A fila esta vazia? " + fila.isEmpty());

        System.out.println("Carlos esta na fila? " + fila.contains("Carlos"));

    }

}
