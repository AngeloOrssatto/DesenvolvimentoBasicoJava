package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        //push
        filaBanco.add("Patricia");
        filaBanco.add("Geraldo");
        filaBanco.add("Neri");
        filaBanco.add("Cleuza");
        filaBanco.add("Rodinei");

        System.out.println(filaBanco);

        //pull
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        //pop q pode retornar null
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //pop q lança excessao
        try{
            String primeiroClienteOuErro = filaBanco.element();
        } catch (Exception e) {
            System.out.println("Nao ha clientes");
        }


        for (String nomeCliente: filaBanco) {
            System.out.println("Cliente: " + nomeCliente);
        }

    }

}
